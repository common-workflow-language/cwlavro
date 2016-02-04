package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOutputEnumSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOutputEnumSchema\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"symbols\",\"type\":[{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"secondaryFiles\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow runtime parameter\\nreferences.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":[\"string\",\"Expression\"]}],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nDescribes files that must be included alongside the primary file(s).\\n\\nIf the value is an expression, the value of `self` in the expression\\nmust be the primary input or output File to which this binding applies.\\n\\nIf the value is a string, it specifies that the following pattern\\nshould be applied to the primary file:\\n\\n  1. If string begins with one or more caret `^` characters, for each\\n    caret, remove the last file extension from the path (the last\\n    period `.` and all following characters).  If there are no file\\n    extensions, the path is unchanged.\\n  2. Append the remainder of the string to the end of the file path.\\n\",\"jsonldPredicate\":\"cwl:secondaryFiles\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"format\",\"type\":[\"null\",\"string\",{\"type\":\"array\",\"items\":\"string\"},\"Expression\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nFor input parameters, this must be one or more URIs of a concept nodes\\nthat represents file formats which are allowed as input to this\\nparameter, preferrably defined within an ontology.  If no ontology is\\navailable, file formats may be tested by exact match.\\n\\nFor output parameters, this is the file format that will be assigned to\\nthe output parameter.\\n\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/cwl#format\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"streamable\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nA value of `true` indicates that the file is read or written\\nsequentially without seeking.  An implementation may use this flag to\\nindicate whether it is valid to stream file contents using a named\\npipe.  Default: `false`.\\n\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"glob\",\"type\":[\"null\",\"string\",\"Expression\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If provided an array, find files that match any\\npattern in the array.  If provided an expression, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Must only match and return files which\\nactually exist.\\n\"},{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"For each file matched in `glob`, read up to\\nthe first 64 KiB of text from the file and place it in the `contents`\\nfield of the file object for manipulation by `outputEval`.\\n\",\"jsonldPredicate\":\"cwl:loadContents\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the value of `self` must be an array containing file objects\\nthat were matched.  If no files were matched, `self' must be a zero\\nlength array; if a single file was matched, the value of `self` is an\\narray of a single element.  Additionally, if `loadContents` is `true`,\\nthe File objects must include up to the first 64 KiB of file contents\\nin the `contents` field.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputBinding\"}],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Must be `enum` */
  @Deprecated public Enum_symbol type;
  /** Defines the set of valid symbols. */
  @Deprecated public java.lang.Object symbols;
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
  @Deprecated public CommandOutputBinding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandOutputEnumSchema() {}

  /**
   * All-args constructor.
   */
  public CommandOutputEnumSchema(Enum_symbol type, java.lang.Object symbols, java.lang.Object secondaryFiles, java.lang.Object format, java.lang.Boolean streamable, CommandOutputBinding outputBinding) {
    this.type = type;
    this.symbols = symbols;
    this.secondaryFiles = secondaryFiles;
    this.format = format;
    this.streamable = streamable;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return symbols;
    case 2: return secondaryFiles;
    case 3: return format;
    case 4: return streamable;
    case 5: return outputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (Enum_symbol)value$; break;
    case 1: symbols = (java.lang.Object)value$; break;
    case 2: secondaryFiles = (java.lang.Object)value$; break;
    case 3: format = (java.lang.Object)value$; break;
    case 4: streamable = (java.lang.Boolean)value$; break;
    case 5: outputBinding = (CommandOutputBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * Must be `enum`   */
  public Enum_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `enum`   * @param value the value to set.
   */
  public void setType(Enum_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'symbols' field.
   * Defines the set of valid symbols.   */
  public java.lang.Object getSymbols() {
    return symbols;
  }

  /**
   * Sets the value of the 'symbols' field.
   * Defines the set of valid symbols.   * @param value the value to set.
   */
  public void setSymbols(java.lang.Object value) {
    this.symbols = value;
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
   * Gets the value of the 'outputBinding' field.
   */
  public CommandOutputBinding getOutputBinding() {
    return outputBinding;
  }

  /**
   * Sets the value of the 'outputBinding' field.
   * @param value the value to set.
   */
  public void setOutputBinding(CommandOutputBinding value) {
    this.outputBinding = value;
  }

  /** Creates a new CommandOutputEnumSchema RecordBuilder */
  public static CommandOutputEnumSchema.Builder newBuilder() {
    return new CommandOutputEnumSchema.Builder();
  }
  
  /** Creates a new CommandOutputEnumSchema RecordBuilder by copying an existing Builder */
  public static CommandOutputEnumSchema.Builder newBuilder(CommandOutputEnumSchema.Builder other) {
    return new CommandOutputEnumSchema.Builder(other);
  }
  
  /** Creates a new CommandOutputEnumSchema RecordBuilder by copying an existing CommandOutputEnumSchema instance */
  public static CommandOutputEnumSchema.Builder newBuilder(CommandOutputEnumSchema other) {
    return new CommandOutputEnumSchema.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandOutputEnumSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOutputEnumSchema>
    implements org.apache.avro.data.RecordBuilder<CommandOutputEnumSchema> {

    private Enum_symbol type;
    private java.lang.Object symbols;
    private java.lang.Object secondaryFiles;
    private java.lang.Object format;
    private java.lang.Boolean streamable;
    private CommandOutputBinding outputBinding;

    /** Creates a new Builder */
    private Builder() {
      super(CommandOutputEnumSchema.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandOutputEnumSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.symbols)) {
        this.symbols = data().deepCopy(fields()[1].schema(), other.symbols);
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
      if (isValidValue(fields()[5], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[5].schema(), other.outputBinding);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandOutputEnumSchema instance */
    private Builder(CommandOutputEnumSchema other) {
            super(CommandOutputEnumSchema.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.symbols)) {
        this.symbols = data().deepCopy(fields()[1].schema(), other.symbols);
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
      if (isValidValue(fields()[5], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[5].schema(), other.outputBinding);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public Enum_symbol getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandOutputEnumSchema.Builder setType(Enum_symbol value) {
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
    public CommandOutputEnumSchema.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'symbols' field */
    public java.lang.Object getSymbols() {
      return symbols;
    }
    
    /** Sets the value of the 'symbols' field */
    public CommandOutputEnumSchema.Builder setSymbols(java.lang.Object value) {
      validate(fields()[1], value);
      this.symbols = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'symbols' field has been set */
    public boolean hasSymbols() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'symbols' field */
    public CommandOutputEnumSchema.Builder clearSymbols() {
      symbols = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'secondaryFiles' field */
    public java.lang.Object getSecondaryFiles() {
      return secondaryFiles;
    }
    
    /** Sets the value of the 'secondaryFiles' field */
    public CommandOutputEnumSchema.Builder setSecondaryFiles(java.lang.Object value) {
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
    public CommandOutputEnumSchema.Builder clearSecondaryFiles() {
      secondaryFiles = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'format' field */
    public java.lang.Object getFormat() {
      return format;
    }
    
    /** Sets the value of the 'format' field */
    public CommandOutputEnumSchema.Builder setFormat(java.lang.Object value) {
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
    public CommandOutputEnumSchema.Builder clearFormat() {
      format = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'streamable' field */
    public java.lang.Boolean getStreamable() {
      return streamable;
    }
    
    /** Sets the value of the 'streamable' field */
    public CommandOutputEnumSchema.Builder setStreamable(java.lang.Boolean value) {
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
    public CommandOutputEnumSchema.Builder clearStreamable() {
      streamable = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'outputBinding' field */
    public CommandOutputBinding getOutputBinding() {
      return outputBinding;
    }
    
    /** Sets the value of the 'outputBinding' field */
    public CommandOutputEnumSchema.Builder setOutputBinding(CommandOutputBinding value) {
      validate(fields()[5], value);
      this.outputBinding = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'outputBinding' field has been set */
    public boolean hasOutputBinding() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'outputBinding' field */
    public CommandOutputEnumSchema.Builder clearOutputBinding() {
      outputBinding = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public CommandOutputEnumSchema build() {
      try {
        CommandOutputEnumSchema record = new CommandOutputEnumSchema();
        record.type = fieldSetFlags()[0] ? this.type : (Enum_symbol) defaultValue(fields()[0]);
        record.symbols = fieldSetFlags()[1] ? this.symbols : (java.lang.Object) defaultValue(fields()[1]);
        record.secondaryFiles = fieldSetFlags()[2] ? this.secondaryFiles : (java.lang.Object) defaultValue(fields()[2]);
        record.format = fieldSetFlags()[3] ? this.format : (java.lang.Object) defaultValue(fields()[3]);
        record.streamable = fieldSetFlags()[4] ? this.streamable : (java.lang.Boolean) defaultValue(fields()[4]);
        record.outputBinding = fieldSetFlags()[5] ? this.outputBinding : (CommandOutputBinding) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
