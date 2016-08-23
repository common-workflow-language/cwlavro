package io.cwl.avro;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.mortbay.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Helper class that performs utility functions relating to CWL parsing and manipulation.
 * @author dyuen
 */
public class CWL {

    private final Gson gson;
    private final Logger log = LoggerFactory.getLogger(CWL.class);

    public CWL(){
        gson =  getTypeSafeCWLToolDocument();
    }

    /**
     * Convert a String representation of a CWL file to a run json
     * @param output
     * @return
     */
    public Map<String, Object> extractRunJson(final String output) {
        final CommandLineTool commandLineTool = gson.fromJson(output, CommandLineTool.class);
        final Map<String, Object> runJson = new HashMap<>();

        for(final CommandInputParameter inputParam : commandLineTool.getInputs()){
            final String idString = inputParam.getId().toString();
            final Object stub = getStub(inputParam.getType(), null);
            runJson.put(idString.substring(idString.lastIndexOf('#') + 1), stub);
        }
        for(final CommandOutputParameter outParam : commandLineTool.getOutputs()){
            final String idString = outParam.getId().toString();
            final Object stub = getStub(outParam.getType(), null);
            runJson.put(idString.substring(idString.lastIndexOf('#') + 1), stub);
        }
        return runJson;
    }

    public Map<String, String> extractCWLTypes(final String output){
        final CommandLineTool commandLineTool = gson.fromJson(output, CommandLineTool.class);
        final Map<String, String> typeJson = new HashMap<>();

        for(final CommandInputParameter inputParam : commandLineTool.getInputs()){
            final String idString = inputParam.getId().toString();
            String type = convertCWLType(inputParam.getType());
            typeJson.put(idString.substring(idString.lastIndexOf('#') + 1), type);
        }
        for(final CommandOutputParameter outParam : commandLineTool.getOutputs()){
            final String idString = outParam.getId().toString();
            String type = convertCWLType(outParam.getType());
            typeJson.put(idString.substring(idString.lastIndexOf('#') + 1), outParam.getType().toString());
        }
        return typeJson;
    }

    private String convertCWLType(Object cwlType) {
        String type = null;
        if (cwlType instanceof List){
            for(final Object entry : (Iterable) cwlType){
                if (entry != null){
                    type = entry.toString();
                }
            }
            if (type == null) {
                throw new RuntimeException("CWL format unknown");
            }
        } else{
            type = cwlType.toString();
        }
        return type;
    }

    /**
     * This is an ugly mapping between CWL's primitives and Java primitives
     * @param type the CWL type
     * @param value
     * @return a stub Java object corresponding to type
     */
    public static Object getStub(final Object type, final String value) {
        Object stub = value == null? "fill me in" : value;
        if (type instanceof List){
            // if its a list, call recursively and return first non-stub entry
            for(final Object entry : (Iterable) type){
                final Object arrayStub = getStub(entry, value);
                if (!Objects.equals(arrayStub, stub)){
                    return arrayStub;
                }
            }
            return stub;
        }
        final String strType = type.toString();
        switch (strType) {
        case "File":
            final Map<String, String> file = new HashMap<>();
            file.put("class", "File");
            file.put("path", value != null ? value : "fill me in");
            stub = file;
            break;
        case "boolean":
            stub = value != null? Boolean.parseBoolean(value) : Boolean.FALSE;
            break;
        case "int":
            stub = value != null? Integer.parseInt(value) :0;
            break;
        case "long":
            stub = value != null? Long.parseLong(value) :0L;
            break;
        case "float":
            stub = value != null? Float.parseFloat(value) :0.0;
            break;
        case "double":
            stub = value != null? Double.parseDouble(value) : Double.MAX_VALUE;
            break;
        default:
            break;
        }
        return stub;
    }

    /**
     * @return a gson instance that can properly convert CWL tools into a typesafe Java object
     */
    public static Gson getTypeSafeCWLToolDocument() {
        final Type hintType = new TypeToken<List<Any>>() {}.getType();
        final Gson sequenceSafeGson = new GsonBuilder().registerTypeAdapter(CharSequence.class,
            (JsonDeserializer<CharSequence>) (json, typeOfT, context) -> json.getAsString()).create();

        return new GsonBuilder().registerTypeAdapter(CharSequence.class,
            (JsonDeserializer<CharSequence>) (json, typeOfT, context) -> json.getAsString())
                        .registerTypeAdapter(hintType, (JsonDeserializer) (json, typeOfT, context) -> {
                            Collection<Object> hints = new ArrayList<>();
                            for (final JsonElement jsonElement : json.getAsJsonArray()) {
                                final Object o = getCWLObject(sequenceSafeGson, jsonElement);
                                if (o == null){
                                    continue;
                                }
                                hints.add(o);
                            }
                            return hints;
                        })
                   .registerTypeAdapter(CommandInputParameter.class, (JsonDeserializer<CommandInputParameter>) (json, typeOfT, context) -> {
                       final CommandInputParameter commandInputParameter = sequenceSafeGson.fromJson(json,
                           CommandInputParameter.class);
                       // default has a dollar sign in the schema but not in sample jsons, we could do something here if we wanted
                       return commandInputParameter;
                   })
                   .serializeNulls().setPrettyPrinting()
            .create();
    }

    private static Object getCWLObject(Gson gson1, JsonElement jsonElement) {
        final String elementClass = jsonElement.getAsJsonObject().get("class").getAsString();
        Class<SpecificRecordBase> anyClass;
        try {
            anyClass = (Class<SpecificRecordBase>) Class.forName("io.cwl.avro." + elementClass);
        } catch (ClassNotFoundException e) {
            Log.debug("Could not process " + elementClass, e);
            return null;
        }
        return gson1.fromJson(jsonElement, anyClass);
    }

    public ImmutablePair<String, String> parseCWL(final String cwlFile) {
        // update seems to just output the JSON version without checking file links
        final String[] s = { "cwltool", "--non-strict", "--print-pre", cwlFile };
        final ImmutablePair<String, String> execute = io.cwl.avro.Utilities
                .executeCommand(Joiner.on(" ").join(Arrays.asList(s)), false,  Optional.absent(), Optional.absent());
        return execute;
    }

    public Map cwlJson2Map(final String cwljson) {
        Map jsonObject;
        try {
            jsonObject = (Map) JsonUtils.fromString(cwljson);
            // Create a context JSON map containing prefixes and definitions
            Map context = new HashMap();
            // Customise context...
            // Create an instance of JsonLdOptions with the standard JSON-LD options
            JsonLdOptions options = new JsonLdOptions();
            // Customise options...
            // Call whichever JSONLD function you want! (e.g. compact)
            Map compact = (Map) JsonLdProcessor.compact(jsonObject, context, options);
            return compact;
        } catch (IOException | JsonLdError e) {
            throw new RuntimeException(e);
        }
    }
}
