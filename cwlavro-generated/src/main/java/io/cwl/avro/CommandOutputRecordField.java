package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CommandOutputRecordField extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8136592146465805726L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommandOutputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"rdfs:comment\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"CWLType\",\"symbols\":[\"File\",\"Directory\"],\"symbol\":[\"https://w3id.org/cwl/salad#null\",\"http://www.w3.org/2001/XMLSchema#boolean\",\"http://www.w3.org/2001/XMLSchema#int\",\"http://www.w3.org/2001/XMLSchema#long\",\"http://www.w3.org/2001/XMLSchema#float\",\"http://www.w3.org/2001/XMLSchema#double\",\"http://www.w3.org/2001/XMLSchema#string\",\"https://w3id.org/cwl/cwl#File\",\"https://w3id.org/cwl/cwl#Directory\"],\"extends\":\"https://w3id.org/cwl/salad#PrimitiveType\"},{\"type\":\"record\",\"name\":\"CommandOutputRecordSchema\",\"fields\":[{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"CommandOutputRecordField\"}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":{\"_id\":\"https://w3id.org/cwl/salad#fields\",\"mapSubject\":\"name\",\"mapPredicate\":\"type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"type\":\"record\",\"name\":\"CommandOutputEnumSchema\",\"fields\":[{\"name\":\"symbols\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"glob\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"'Expression' is not a real type.  It indicates that a field must allow\\nruntime parameter references.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If an array is provided, find files that match any\\npattern in the array.  If an expression is provided, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Must only match and return files which\\nactually exist.\\n\"},{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"For each file matched in `glob`, read up to\\nthe first 64 KiB of text from the file and place it in the `contents`\\nfield of the file object for manipulation by `outputEval`.\\n\",\"jsonldPredicate\":\"cwl:loadContents\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the value of `self` must be an array containing file objects\\nthat were matched.  If no files were matched, `self` must be a zero\\nlength array; if a single file was matched, the value of `self` is an\\narray of a single element.  Additionally, if `loadContents` is `true`,\\nthe File objects must include up to the first 64 KiB of file contents\\nin the `contents` field.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputBinding\"}],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"type\":\"record\",\"name\":\"CommandOutputArraySchema\",\"fields\":[{\"name\":\"items\",\"type\":[\"CWLType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"}],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"},\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"CommandOutputRecordSchema\",\"CommandOutputEnumSchema\",\"CommandOutputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\",\"inherited_from\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputRecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/cwl#OutputBinding\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CommandOutputBinding\"}]}");
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
  @Deprecated public CommandOutputBinding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommandOutputRecordField() {}

  /**
   * All-args constructor.
   * @param name The name of the field

   * @param doc A documentation string for this field

   * @param type The field type

   * @param outputBinding The new value for outputBinding
   */
  public CommandOutputRecordField(java.lang.CharSequence name, java.lang.CharSequence doc, java.lang.Object type, CommandOutputBinding outputBinding) {
    this.name = name;
    this.doc = doc;
    this.type = type;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return doc;
    case 2: return type;
    case 3: return outputBinding;
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
    case 3: outputBinding = (CommandOutputBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The name of the field

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
   * @return A documentation string for this field

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
   * @return The field type

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
   * Gets the value of the 'outputBinding' field.
   * @return The value of the 'outputBinding' field.
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

  /**
   * Creates a new CommandOutputRecordField RecordBuilder.
   * @return A new CommandOutputRecordField RecordBuilder
   */
  public static CommandOutputRecordField.Builder newBuilder() {
    return new CommandOutputRecordField.Builder();
  }

  /**
   * Creates a new CommandOutputRecordField RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CommandOutputRecordField RecordBuilder
   */
  public static CommandOutputRecordField.Builder newBuilder(CommandOutputRecordField.Builder other) {
    return new CommandOutputRecordField.Builder(other);
  }

  /**
   * Creates a new CommandOutputRecordField RecordBuilder by copying an existing CommandOutputRecordField instance.
   * @param other The existing instance to copy.
   * @return A new CommandOutputRecordField RecordBuilder
   */
  public static CommandOutputRecordField.Builder newBuilder(CommandOutputRecordField other) {
    return new CommandOutputRecordField.Builder(other);
  }

  /**
   * RecordBuilder for CommandOutputRecordField instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommandOutputRecordField>
    implements org.apache.avro.data.RecordBuilder<CommandOutputRecordField> {

    /** The name of the field
 */
    private java.lang.CharSequence name;
    /** A documentation string for this field
 */
    private java.lang.CharSequence doc;
    /** The field type
 */
    private java.lang.Object type;
    private CommandOutputBinding outputBinding;
    private CommandOutputBinding.Builder outputBindingBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(CommandOutputRecordField.Builder other) {
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
      if (isValidValue(fields()[3], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[3].schema(), other.outputBinding);
        fieldSetFlags()[3] = true;
      }
      if (other.hasOutputBindingBuilder()) {
        this.outputBindingBuilder = CommandOutputBinding.newBuilder(other.getOutputBindingBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing CommandOutputRecordField instance
     * @param other The existing instance to copy.
     */
    private Builder(CommandOutputRecordField other) {
            super(SCHEMA$);
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
      if (isValidValue(fields()[3], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[3].schema(), other.outputBinding);
        fieldSetFlags()[3] = true;
      }
      this.outputBindingBuilder = null;
    }

    /**
      * Gets the value of the 'name' field.
      * The name of the field

      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * The name of the field

      * @param value The value of 'name'.
      * @return This builder.
      */
    public CommandOutputRecordField.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * The name of the field

      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * The name of the field

      * @return This builder.
      */
    public CommandOutputRecordField.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'doc' field.
      * A documentation string for this field

      * @return The value.
      */
    public java.lang.CharSequence getDoc() {
      return doc;
    }

    /**
      * Sets the value of the 'doc' field.
      * A documentation string for this field

      * @param value The value of 'doc'.
      * @return This builder.
      */
    public CommandOutputRecordField.Builder setDoc(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.doc = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'doc' field has been set.
      * A documentation string for this field

      * @return True if the 'doc' field has been set, false otherwise.
      */
    public boolean hasDoc() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'doc' field.
      * A documentation string for this field

      * @return This builder.
      */
    public CommandOutputRecordField.Builder clearDoc() {
      doc = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * The field type

      * @return The value.
      */
    public java.lang.Object getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * The field type

      * @param value The value of 'type'.
      * @return This builder.
      */
    public CommandOutputRecordField.Builder setType(java.lang.Object value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * The field type

      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * The field type

      * @return This builder.
      */
    public CommandOutputRecordField.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'outputBinding' field.
      * @return The value.
      */
    public CommandOutputBinding getOutputBinding() {
      return outputBinding;
    }

    /**
      * Sets the value of the 'outputBinding' field.
      * @param value The value of 'outputBinding'.
      * @return This builder.
      */
    public CommandOutputRecordField.Builder setOutputBinding(CommandOutputBinding value) {
      validate(fields()[3], value);
      this.outputBindingBuilder = null;
      this.outputBinding = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'outputBinding' field has been set.
      * @return True if the 'outputBinding' field has been set, false otherwise.
      */
    public boolean hasOutputBinding() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'outputBinding' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public CommandOutputBinding.Builder getOutputBindingBuilder() {
      if (outputBindingBuilder == null) {
        if (hasOutputBinding()) {
          setOutputBindingBuilder(CommandOutputBinding.newBuilder(outputBinding));
        } else {
          setOutputBindingBuilder(CommandOutputBinding.newBuilder());
        }
      }
      return outputBindingBuilder;
    }

    /**
     * Sets the Builder instance for the 'outputBinding' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public CommandOutputRecordField.Builder setOutputBindingBuilder(CommandOutputBinding.Builder value) {
      clearOutputBinding();
      outputBindingBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'outputBinding' field has an active Builder instance
     * @return True if the 'outputBinding' field has an active Builder instance
     */
    public boolean hasOutputBindingBuilder() {
      return outputBindingBuilder != null;
    }

    /**
      * Clears the value of the 'outputBinding' field.
      * @return This builder.
      */
    public CommandOutputRecordField.Builder clearOutputBinding() {
      outputBinding = null;
      outputBindingBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public CommandOutputRecordField build() {
      try {
        CommandOutputRecordField record = new CommandOutputRecordField();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.doc = fieldSetFlags()[1] ? this.doc : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.lang.Object) defaultValue(fields()[2]);
        if (outputBindingBuilder != null) {
          record.outputBinding = this.outputBindingBuilder.build();
        } else {
          record.outputBinding = fieldSetFlags()[3] ? this.outputBinding : (CommandOutputBinding) defaultValue(fields()[3]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
