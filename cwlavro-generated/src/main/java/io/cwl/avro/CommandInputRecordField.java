package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandInputRecordField extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandInputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"rdfs:comment\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"CWLType\",\"symbols\":[\"File\",\"Directory\"],\"symbol\":[\"https://w3id.org/cwl/salad#null\",\"http://www.w3.org/2001/XMLSchema#boolean\",\"http://www.w3.org/2001/XMLSchema#int\",\"http://www.w3.org/2001/XMLSchema#long\",\"http://www.w3.org/2001/XMLSchema#float\",\"http://www.w3.org/2001/XMLSchema#double\",\"http://www.w3.org/2001/XMLSchema#string\",\"https://w3id.org/cwl/cwl#File\",\"https://w3id.org/cwl/cwl#Directory\"],\"extends\":\"https://w3id.org/cwl/salad#PrimitiveType\"},{\"type\":\"record\",\"name\":\"CommandInputRecordSchema\",\"fields\":[{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"CommandInputRecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":{\"_id\":\"https://w3id.org/cwl/salad#fields\",\"mapSubject\":\"name\",\"mapPredicate\":\"type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputRecordSchema\"},{\"type\":\"record\",\"name\":\"CommandInputEnumSchema\",\"fields\":[{\"name\":\"symbols\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" refers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#File) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nRead up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for use by expressions.\\n\",\"jsonldPredicate\":\"cwl:loadContents\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputBinding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"'Expression' is not a real type.  It indicates that a field must allow\\nruntime parameter references.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]}],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the value of `self` in the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\",\"jsonldPredicate\":\"cwl:valueFrom\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputBinding\"}],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputEnumSchema\"},{\"type\":\"record\",\"name\":\"CommandInputArraySchema\",\"fields\":[{\"name\":\"items\",\"type\":[\"CWLType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputArraySchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#Comma","ndLineBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputArraySchema\"},\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandInputRecordSchema\",\"CommandInputEnumSchema\",\"CommandInputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"inputBinding\",\"type\":[\"null\",\"CommandLineBinding\"],\"jsonldPredicate\":\"cwl:inputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputRecordField\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this process object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandInputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#InputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandLineBinding\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The name of the field
 */
  @Deprecated public java.lang.CharSequence name;
  /** A documentation string for this field
 */
  @Deprecated public java.lang.CharSequence doc;
  /** The field type
 */
  @Deprecated public java.lang.Object type;
  @Deprecated public CommandLineBinding inputBinding;
  /** A short, human-readable label of this process object. */
  @Deprecated public java.lang.CharSequence label;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public CommandInputRecordField() {}

  /**
   * All-args constructor.
   */
  public CommandInputRecordField(java.lang.CharSequence name, java.lang.CharSequence doc, java.lang.Object type, CommandLineBinding inputBinding, java.lang.CharSequence label) {
    this.name = name;
    this.doc = doc;
    this.type = type;
    this.inputBinding = inputBinding;
    this.label = label;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return doc;
    case 2: return type;
    case 3: return inputBinding;
    case 4: return label;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: doc = (java.lang.CharSequence)value$; break;
    case 2: type = (java.lang.Object)value$; break;
    case 3: inputBinding = (CommandLineBinding)value$; break;
    case 4: label = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * The name of the field
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The name of the field
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'doc' field.
   * A documentation string for this field
   */
  public java.lang.CharSequence getDoc() {
    return doc;
  }

  /**
   * Sets the value of the 'doc' field.
   * A documentation string for this field
   * @param value the value to set.
   */
  public void setDoc(java.lang.CharSequence value) {
    this.doc = value;
  }

  /**
   * Gets the value of the 'type' field.
   * The field type
   */
  public java.lang.Object getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * The field type
   * @param value the value to set.
   */
  public void setType(java.lang.Object value) {
    this.type = value;
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

  /**
   * Gets the value of the 'label' field.
   * A short, human-readable label of this process object.   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * A short, human-readable label of this process object.   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /** Creates a new CommandInputRecordField RecordBuilder */
  public static CommandInputRecordField.Builder newBuilder() {
    return new CommandInputRecordField.Builder();
  }
  
  /** Creates a new CommandInputRecordField RecordBuilder by copying an existing Builder */
  public static CommandInputRecordField.Builder newBuilder(CommandInputRecordField.Builder other) {
    return new CommandInputRecordField.Builder(other);
  }
  
  /** Creates a new CommandInputRecordField RecordBuilder by copying an existing CommandInputRecordField instance */
  public static CommandInputRecordField.Builder newBuilder(CommandInputRecordField other) {
    return new CommandInputRecordField.Builder(other);
  }
  
  /**
   * RecordBuilder for CommandInputRecordField instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandInputRecordField>
    implements org.apache.avro.data.RecordBuilder<CommandInputRecordField> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence doc;
    private java.lang.Object type;
    private CommandLineBinding inputBinding;
    private java.lang.CharSequence label;

    /** Creates a new Builder */
    private Builder() {
      super(CommandInputRecordField.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(CommandInputRecordField.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.doc)) {
        this.doc = data().deepCopy(fields()[1].schema(), other.doc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.label)) {
        this.label = data().deepCopy(fields()[4].schema(), other.label);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing CommandInputRecordField instance */
    private Builder(CommandInputRecordField other) {
            super(CommandInputRecordField.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.doc)) {
        this.doc = data().deepCopy(fields()[1].schema(), other.doc);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.label)) {
        this.label = data().deepCopy(fields()[4].schema(), other.label);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public CommandInputRecordField.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public CommandInputRecordField.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'doc' field */
    public java.lang.CharSequence getDoc() {
      return doc;
    }
    
    /** Sets the value of the 'doc' field */
    public CommandInputRecordField.Builder setDoc(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.doc = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'doc' field has been set */
    public boolean hasDoc() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'doc' field */
    public CommandInputRecordField.Builder clearDoc() {
      doc = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.Object getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public CommandInputRecordField.Builder setType(java.lang.Object value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'type' field */
    public CommandInputRecordField.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'inputBinding' field */
    public CommandLineBinding getInputBinding() {
      return inputBinding;
    }
    
    /** Sets the value of the 'inputBinding' field */
    public CommandInputRecordField.Builder setInputBinding(CommandLineBinding value) {
      validate(fields()[3], value);
      this.inputBinding = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'inputBinding' field has been set */
    public boolean hasInputBinding() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'inputBinding' field */
    public CommandInputRecordField.Builder clearInputBinding() {
      inputBinding = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public CommandInputRecordField.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.label = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'label' field */
    public CommandInputRecordField.Builder clearLabel() {
      label = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public CommandInputRecordField build() {
      try {
        CommandInputRecordField record = new CommandInputRecordField();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.doc = fieldSetFlags()[1] ? this.doc : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.Object) defaultValue(fields()[2]);
        record.inputBinding = fieldSetFlags()[3] ? this.inputBinding : (CommandLineBinding) defaultValue(fields()[3]);
        record.label = fieldSetFlags()[4] ? this.label : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
