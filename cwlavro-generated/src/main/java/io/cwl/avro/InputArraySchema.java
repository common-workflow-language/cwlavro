package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InputArraySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},{\"type\":\"record\",\"name\":\"InputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"InputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[\"PrimitiveType\",\"InputRecordSchema\",{\"type\":\"record\",\"name\":\"InputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow runtime parameter\\nreferences.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" refers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#File) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nRead up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for use by expressions.\\n\",\"jsonldPredicate\":\"cwl:loadContents\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputBinding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the value of `self` in the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\",\"jsonldPredicate\":\"cwl:valueFrom\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputBinding\"}],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"extends\":[\"https://w3id.org/cwl/salad#EnumSchema\",\"https://w3id.org/cwl/cwl#InputSchema\"]},\"InputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#RecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSc","hema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordField\"}],\"extends\":[\"https://w3id.org/cwl/salad#RecordSchema\",\"https://w3id.org/cwl/cwl#InputSchema\"]},\"InputEnumSchema\",\"InputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"InputRecordSchema\",\"InputEnumSchema\",\"InputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}],\"extends\":[\"https://w3id.org/cwl/salad#ArraySchema\",\"https://w3id.org/cwl/cwl#InputSchema\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `array` */
  @Deprecated public Array_symbol type;
  /** Defines the type of the array elements. */
  @Deprecated public java.lang.Object items;
  /** Only valid when `type: File` or is an array of `items: File`.

Describes files that must be included alongside the primary file(s).

If the value is an expression, the value of `self` in the expression
must be the primary input or output File to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
 */
  @Deprecated public java.lang.Object secondaryFiles;
  /** Only valid when `type: File` or is an array of `items: File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.

For output parameters, this is the file format that will be assigned to
the output parameter.
 */
  @Deprecated public java.lang.Object format;
  /** Only valid when `type: File` or is an array of `items: File`.

A value of `true` indicates that the file is read or written
sequentially without seeking.  An implementation may use this flag to
indicate whether it is valid to stream file contents using a named
pipe.  Default: `false`.
 */
  @Deprecated public java.lang.Boolean streamable;
  @Deprecated public CommandLineBinding inputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public InputArraySchema() {}

  /**
   * All-args constructor.
   */
  public InputArraySchema(Array_symbol type, java.lang.Object items, java.lang.Object secondaryFiles, java.lang.Object format, java.lang.Boolean streamable, CommandLineBinding inputBinding) {
    this.type = type;
    this.items = items;
    this.secondaryFiles = secondaryFiles;
    this.format = format;
    this.streamable = streamable;
    this.inputBinding = inputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return items;
    case 2: return secondaryFiles;
    case 3: return format;
    case 4: return streamable;
    case 5: return inputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Array_symbol)value$; break;
    case 1: items = (java.lang.Object)value$; break;
    case 2: secondaryFiles = (java.lang.Object)value$; break;
    case 3: format = (java.lang.Object)value$; break;
    case 4: streamable = (java.lang.Boolean)value$; break;
    case 5: inputBinding = (CommandLineBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `array`   */
  public Array_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `array`   * @param value the value to set.
   */
  public void setType(Array_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'items' field.
   * Defines the type of the array elements.   */
  public java.lang.Object getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * Defines the type of the array elements.   * @param value the value to set.
   */
  public void setItems(java.lang.Object value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'secondaryFiles' field.
   * Only valid when `type: File` or is an array of `items: File`.

Describes files that must be included alongside the primary file(s).

If the value is an expression, the value of `self` in the expression
must be the primary input or output File to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
   */
  public java.lang.Object getSecondaryFiles() {
    return secondaryFiles;
  }

  /**
   * Sets the value of the 'secondaryFiles' field.
   * Only valid when `type: File` or is an array of `items: File`.

Describes files that must be included alongside the primary file(s).

If the value is an expression, the value of `self` in the expression
must be the primary input or output File to which this binding applies.

If the value is a string, it specifies that the following pattern
should be applied to the primary file:

  1. If string begins with one or more caret `^` characters, for each
    caret, remove the last file extension from the path (the last
    period `.` and all following characters).  If there are no file
    extensions, the path is unchanged.
  2. Append the remainder of the string to the end of the file path.
   * @param value the value to set.
   */
  public void setSecondaryFiles(java.lang.Object value) {
    this.secondaryFiles = value;
  }

  /**
   * Gets the value of the 'format' field.
   * Only valid when `type: File` or is an array of `items: File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.

For output parameters, this is the file format that will be assigned to
the output parameter.
   */
  public java.lang.Object getFormat() {
    return format;
  }

  /**
   * Sets the value of the 'format' field.
   * Only valid when `type: File` or is an array of `items: File`.

For input parameters, this must be one or more URIs of a concept nodes
that represents file formats which are allowed as input to this
parameter, preferrably defined within an ontology.  If no ontology is
available, file formats may be tested by exact match.

For output parameters, this is the file format that will be assigned to
the output parameter.
   * @param value the value to set.
   */
  public void setFormat(java.lang.Object value) {
    this.format = value;
  }

  /**
   * Gets the value of the 'streamable' field.
   * Only valid when `type: File` or is an array of `items: File`.

A value of `true` indicates that the file is read or written
sequentially without seeking.  An implementation may use this flag to
indicate whether it is valid to stream file contents using a named
pipe.  Default: `false`.
   */
  public java.lang.Boolean getStreamable() {
    return streamable;
  }

  /**
   * Sets the value of the 'streamable' field.
   * Only valid when `type: File` or is an array of `items: File`.

A value of `true` indicates that the file is read or written
sequentially without seeking.  An implementation may use this flag to
indicate whether it is valid to stream file contents using a named
pipe.  Default: `false`.
   * @param value the value to set.
   */
  public void setStreamable(java.lang.Boolean value) {
    this.streamable = value;
  }

  /**
   * Gets the value of the 'inputBinding' field.
   */
  public CommandLineBinding getInputBinding() {
    return inputBinding;
  }

  /**
   * Sets the value of the 'inputBinding' field.
   * @param value the value to set.
   */
  public void setInputBinding(CommandLineBinding value) {
    this.inputBinding = value;
  }

  /** Creates a new InputArraySchema RecordBuilder */
  public static InputArraySchema.Builder newBuilder() {
    return new InputArraySchema.Builder();
  }
  
  /** Creates a new InputArraySchema RecordBuilder by copying an existing Builder */
  public static InputArraySchema.Builder newBuilder(InputArraySchema.Builder other) {
    return new InputArraySchema.Builder(other);
  }
  
  /** Creates a new InputArraySchema RecordBuilder by copying an existing InputArraySchema instance */
  public static InputArraySchema.Builder newBuilder(InputArraySchema other) {
    return new InputArraySchema.Builder(other);
  }
  
  /**
   * RecordBuilder for InputArraySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InputArraySchema>
    implements org.apache.avro.data.RecordBuilder<InputArraySchema> {

    private Array_symbol type;
    private java.lang.Object items;
    private java.lang.Object secondaryFiles;
    private java.lang.Object format;
    private java.lang.Boolean streamable;
    private CommandLineBinding inputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(InputArraySchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(InputArraySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.secondaryFiles)) {
        this.secondaryFiles = data().deepCopy(fields()[2].schema(), other.secondaryFiles);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.format)) {
        this.format = data().deepCopy(fields()[3].schema(), other.format);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.streamable)) {
        this.streamable = data().deepCopy(fields()[4].schema(), other.streamable);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[5].schema(), other.inputBinding);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing InputArraySchema instance */
    private Builder(InputArraySchema other) {
            super(InputArraySchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.secondaryFiles)) {
        this.secondaryFiles = data().deepCopy(fields()[2].schema(), other.secondaryFiles);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.format)) {
        this.format = data().deepCopy(fields()[3].schema(), other.format);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.streamable)) {
        this.streamable = data().deepCopy(fields()[4].schema(), other.streamable);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[5].schema(), other.inputBinding);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Array_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public InputArraySchema.Builder setType(Array_symbol value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public InputArraySchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'items' field */
    public java.lang.Object getItems() {
      return items;
    }
    
    /** Sets the value of the 'items' field */
    public InputArraySchema.Builder setItems(java.lang.Object value) {
      validate(fields()[1], value);
      this.items = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'items' field has been set */
    public boolean hasItems() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'items' field */
    public InputArraySchema.Builder clearItems() {
      items = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'secondaryFiles' field */
    public java.lang.Object getSecondaryFiles() {
      return secondaryFiles;
    }
    
    /** Sets the value of the 'secondaryFiles' field */
    public InputArraySchema.Builder setSecondaryFiles(java.lang.Object value) {
      validate(fields()[2], value);
      this.secondaryFiles = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'secondaryFiles' field has been set */
    public boolean hasSecondaryFiles() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'secondaryFiles' field */
    public InputArraySchema.Builder clearSecondaryFiles() {
      secondaryFiles = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'format' field */
    public java.lang.Object getFormat() {
      return format;
    }
    
    /** Sets the value of the 'format' field */
    public InputArraySchema.Builder setFormat(java.lang.Object value) {
      validate(fields()[3], value);
      this.format = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'format' field has been set */
    public boolean hasFormat() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'format' field */
    public InputArraySchema.Builder clearFormat() {
      format = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'streamable' field */
    public java.lang.Boolean getStreamable() {
      return streamable;
    }
    
    /** Sets the value of the 'streamable' field */
    public InputArraySchema.Builder setStreamable(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.streamable = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'streamable' field has been set */
    public boolean hasStreamable() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'streamable' field */
    public InputArraySchema.Builder clearStreamable() {
      streamable = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'inputBinding' field */
    public CommandLineBinding getInputBinding() {
      return inputBinding;
    }
    
    /** Sets the value of the 'inputBinding' field */
    public InputArraySchema.Builder setInputBinding(CommandLineBinding value) {
      validate(fields()[5], value);
      this.inputBinding = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'inputBinding' field has been set */
    public boolean hasInputBinding() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'inputBinding' field */
    public InputArraySchema.Builder clearInputBinding() {
      inputBinding = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public InputArraySchema build() {
      try {
        InputArraySchema record = new InputArraySchema();
        record.type = fieldSetFlags()[0] ? this.type : (Array_symbol) defaultValue(fields()[0]);
        record.items = fieldSetFlags()[1] ? this.items : (java.lang.Object) defaultValue(fields()[1]);
        record.secondaryFiles = fieldSetFlags()[2] ? this.secondaryFiles : (java.lang.Object) defaultValue(fields()[2]);
        record.format = fieldSetFlags()[3] ? this.format : (java.lang.Object) defaultValue(fields()[3]);
        record.streamable = fieldSetFlags()[4] ? this.streamable : (java.lang.Boolean) defaultValue(fields()[4]);
        record.inputBinding = fieldSetFlags()[5] ? this.inputBinding : (CommandLineBinding) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
