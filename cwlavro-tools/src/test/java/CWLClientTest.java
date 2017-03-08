/*
 * Copyright (C) 2015 Collaboratory
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import com.google.common.io.Resources;
import com.google.gson.Gson;
import io.cwl.avro.CWL;
import io.cwl.avro.CommandLineTool;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * These tests demonstrate how to work with CWL documents(in JSON format) describing actual tools
 * and create Java Model objects from them.
 * @author dyuen
 */
public class CWLClientTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    /**
     * This test demonstrates how to take a CWL document and generate a corresponding json parameters file for it.
     * @throws Exception
     */
    @Test
    public void serializeToJson() throws Exception {
        final URL resource = Resources.getResource("cwl.json");
        final String cwlJson = Resources.toString(resource, StandardCharsets.UTF_8);

        final CWL cwl = new CWL();

        final Gson gson = CWL.getTypeSafeCWLToolDocument();
        final Map<String, Object> runJson = cwl.extractRunJson(cwlJson);
        // check that default values made it
        assertTrue(runJson.get("mem_gb").equals(4));
        assertTrue(((Map)runJson.get("bam_input")).get("path").equals("default_directory/default_bam_location.bam"));
        assertTrue(((Map)runJson.get("bam_input")).containsKey("format"));
        final String s = gson.toJson(runJson);
        assertTrue(s.length() > 10);
    }

    /**
     * This test demonstrates how to parse a CWL document using CWL tool.
     * @throws Exception
     */
    @Test
    public void parseCWL() throws Exception{
        final URL resource = Resources.getResource("cwl.json");
        final CWL cwl = new CWL();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        assertTrue(!output.getLeft().isEmpty() && output.getLeft().contains("cwlVersion"));
        assertTrue(!output.getRight().isEmpty() && output.getRight().contains("cwltool"));
    }

    /**
     * This test demonstrates how to parse a CWL document using CWL tool.
     * @throws Exception
     */
    @Test
    public void parseCWLActual() throws Exception{
        final URL resource = Resources.getResource("valid.cwl");
        final CWL cwl = new CWL();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        assertTrue(!output.getLeft().isEmpty() && output.getLeft().contains("cwlVersion"));
        assertTrue(!output.getRight().isEmpty() && output.getRight().contains("cwltool"));
    }

    /**
     * This test demonstrates a parse failure for a CWL document.
     * @throws Exception
     */
    @Test
    public void parseCWLInvalid() throws Exception{
        final URL resource = Resources.getResource("invalid.cwl");
        final CWL cwl = new CWL();

        try {
            final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
            assertTrue(!output.getLeft().isEmpty() && output.getLeft().contains("cwlVersion"));
            assertTrue(!output.getRight().isEmpty() && output.getRight().contains("cwltool"));
        }catch (RuntimeException e){
            assertTrue("output should include a validation error",systemErrRule.getLog().contains("Tool definition failed validation:") );
            return;
        }
        // this should always exception
        assertTrue(false);
    }

    /**
     * This test demonstrates how to parse a CWL document and populate a
     * @throws Exception
     */
    @Test
    public void createToolJavaModel() throws Exception {
        final URL resource = Resources.getResource("cwl.json");
        final CWL cwl = new CWL();
        Gson gson =  CWL.getTypeSafeCWLToolDocument();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        final CommandLineTool commandLineTool = gson.fromJson(output.getLeft(), CommandLineTool.class);
        assertTrue(commandLineTool != null && commandLineTool.getLabel().equals("BAMStats tool"));
    }

    /**
     * This test demonstrates how to extract information from a CWL file.
     * @throws Exception
     */
    @Test
    public void extractCWLTypes() throws Exception {
        final URL resource = Resources.getResource("cwl.json");
        final CWL cwl = new CWL();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        final Map<String, String> typeMap = cwl.extractCWLTypes(output.getLeft());
        assertTrue(typeMap.size() == 3);
        assertTrue("int".equals(typeMap.get("mem_gb")));
        assertTrue("File".equals(typeMap.get("bam_input")));
    }

    /**
     * This test demonstrates how to extract metadata from a CWL file.
     * @throws Exception
     */
    @Test
    public void extractMetadata() throws Exception {
        final URL resource = Resources.getResource("cwl.json");
        final CWL cwl = new CWL();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        final Map map = cwl.cwlJson2Map(output.getLeft());
        assertTrue(map.size() == 1 && ((Map)map.get("http://purl.org/dc/terms/creator")).size() == 3);
        String key = (String)((Map) map.get("http://purl.org/dc/terms/creator")).get("http://xmlns.com/foaf/0.1/name");
        assertTrue(Objects.equals(key,"Brian O'Connor"));
    }

    /**
     * This tests verifies json conversion from a cwl file with array types
     * @throws Exception
     */
    @Test
    public void stubArray() throws Exception {
        final URL resource = Resources.getResource("arrays.cwl");

        final URL confirm = Resources.getResource("arraysConfirm.txt");
        final String jsonResult = Resources.toString(confirm, StandardCharsets.UTF_8);

        final CWL cwl = new CWL();
        final ImmutablePair<String, String> output = cwl.parseCWL(resource.getFile());
        final Map<String, Object> runJson = cwl.extractRunJson(output.getLeft());

        final Gson gson = cwl.getTypeSafeCWLToolDocument();

        assertEquals(jsonResult.trim(), gson.toJson(runJson).trim());
    }
}
