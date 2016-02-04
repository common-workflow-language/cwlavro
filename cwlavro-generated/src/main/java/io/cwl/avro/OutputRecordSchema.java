package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OutputRecordSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OutputRecordSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OutputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"sld:doc\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},\"OutputRecordSchema\",{\"type\":\"record\",\"name\":\"OutputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow runtime parameter\\nreferences.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"glob\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If provided an array, find files that match any\\npattern in the array.  If provided an expression, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Must only match and return files which\\nactually exist.\\n\"},{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"For each file matched in `glob`, read up to\\nthe first 64 KiB of text from the file and place it in the `contents`\\nfield of the file object for manipulation by `outputEval`.\\n\",\"jsonldPredicate\":\"cwl:loadContents\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the value of `self` must be an array containing file objects\\nthat were matched.  If no files were matched, `self' must be a zero\\nlength array; if a single file was matched, the value of `self` is an\\narray of a single element.  Additionally, if `loadContents` is `true`,\\nthe File objects must include up to the first 64 KiB of file contents\\nin the `contents` field.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputBinding\"}],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#EnumSchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"]},{\"type\":\"record\",\"name\":\"OutputArraySchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Def","ault: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#ArraySchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#RecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":\"sld:fields\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#RecordSchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `record` */
  @Deprecated public Record_symbol type;
  /** Defines the fields of the record. */
  @Deprecated public java.util.List<OutputRecordField> fields;
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

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public OutputRecordSchema() {}

  /**
   * All-args constructor.
   */
  public OutputRecordSchema(Record_symbol type, java.util.List<OutputRecordField> fields, java.lang.Object secondaryFiles, java.lang.Object format, java.lang.Boolean streamable) {
    this.type = type;
    this.fields = fields;
    this.secondaryFiles = secondaryFiles;
    this.format = format;
    this.streamable = streamable;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return fields;
    case 2: return secondaryFiles;
    case 3: return format;
    case 4: return streamable;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Record_symbol)value$; break;
    case 1: fields = (java.util.List<OutputRecordField>)value$; break;
    case 2: secondaryFiles = (java.lang.Object)value$; break;
    case 3: format = (java.lang.Object)value$; break;
    case 4: streamable = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `record`   */
  public Record_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `record`   * @param value the value to set.
   */
  public void setType(Record_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'fields' field.
   * Defines the fields of the record.   */
  public java.util.List<OutputRecordField> getFields() {
    return fields;
  }

  /**
   * Sets the value of the 'fields' field.
   * Defines the fields of the record.   * @param value the value to set.
   */
  public void setFields(java.util.List<OutputRecordField> value) {
    this.fields = value;
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

  /** Creates a new OutputRecordSchema RecordBuilder */
  public static OutputRecordSchema.Builder newBuilder() {
    return new OutputRecordSchema.Builder();
  }
  
  /** Creates a new OutputRecordSchema RecordBuilder by copying an existing Builder */
  public static OutputRecordSchema.Builder newBuilder(OutputRecordSchema.Builder other) {
    return new OutputRecordSchema.Builder(other);
  }
  
  /** Creates a new OutputRecordSchema RecordBuilder by copying an existing OutputRecordSchema instance */
  public static OutputRecordSchema.Builder newBuilder(OutputRecordSchema other) {
    return new OutputRecordSchema.Builder(other);
  }
  
  /**
   * RecordBuilder for OutputRecordSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OutputRecordSchema>
    implements org.apache.avro.data.RecordBuilder<OutputRecordSchema> {

    private Record_symbol type;
    private java.util.List<OutputRecordField> fields;
    private java.lang.Object secondaryFiles;
    private java.lang.Object format;
    private java.lang.Boolean streamable;

    /** Creates a new Builder */
    private Builder() {
      super(OutputRecordSchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(OutputRecordSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
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
    }
    
    /** Creates a Builder by copying an existing OutputRecordSchema instance */
    private Builder(OutputRecordSchema other) {
            super(OutputRecordSchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fields)) {
        this.fields = data().deepCopy(fields()[1].schema(), other.fields);
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
    }

    /** Gets the value of the 'type' field */
    public Record_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public OutputRecordSchema.Builder setType(Record_symbol value) {
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
    public OutputRecordSchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'fields' field */
    public java.util.List<OutputRecordField> getFields() {
      return fields;
    }
    
    /** Sets the value of the 'fields' field */
    public OutputRecordSchema.Builder setFields(java.util.List<OutputRecordField> value) {
      validate(fields()[1], value);
      this.fields = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'fields' field has been set */
    public boolean hasFields() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'fields' field */
    public OutputRecordSchema.Builder clearFields() {
      fields = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'secondaryFiles' field */
    public java.lang.Object getSecondaryFiles() {
      return secondaryFiles;
    }
    
    /** Sets the value of the 'secondaryFiles' field */
    public OutputRecordSchema.Builder setSecondaryFiles(java.lang.Object value) {
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
    public OutputRecordSchema.Builder clearSecondaryFiles() {
      secondaryFiles = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'format' field */
    public java.lang.Object getFormat() {
      return format;
    }
    
    /** Sets the value of the 'format' field */
    public OutputRecordSchema.Builder setFormat(java.lang.Object value) {
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
    public OutputRecordSchema.Builder clearFormat() {
      format = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'streamable' field */
    public java.lang.Boolean getStreamable() {
      return streamable;
    }
    
    /** Sets the value of the 'streamable' field */
    public OutputRecordSchema.Builder setStreamable(java.lang.Boolean value) {
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
    public OutputRecordSchema.Builder clearStreamable() {
      streamable = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public OutputRecordSchema build() {
      try {
        OutputRecordSchema record = new OutputRecordSchema();
        record.type = fieldSetFlags()[0] ? this.type : (Record_symbol) defaultValue(fields()[0]);
        record.fields = fieldSetFlags()[1] ? this.fields : (java.util.List<OutputRecordField>) defaultValue(fields()[1]);
        record.secondaryFiles = fieldSetFlags()[2] ? this.secondaryFiles : (java.lang.Object) defaultValue(fields()[2]);
        record.format = fieldSetFlags()[3] ? this.format : (java.lang.Object) defaultValue(fields()[3]);
        record.streamable = fieldSetFlags()[4] ? this.streamable : (java.lang.Boolean) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
