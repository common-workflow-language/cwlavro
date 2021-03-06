package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OutputArraySchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8936775166764859356L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OutputArraySchema\",\"fields\":[{\"name\":\"items\",\"type\":[{\"type\":\"enum\",\"name\":\"CWLType\",\"symbols\":[\"File\",\"Directory\"],\"symbol\":[\"https://w3id.org/cwl/salad#null\",\"http://www.w3.org/2001/XMLSchema#boolean\",\"http://www.w3.org/2001/XMLSchema#int\",\"http://www.w3.org/2001/XMLSchema#long\",\"http://www.w3.org/2001/XMLSchema#float\",\"http://www.w3.org/2001/XMLSchema#double\",\"http://www.w3.org/2001/XMLSchema#string\",\"https://w3id.org/cwl/cwl#File\",\"https://w3id.org/cwl/cwl#Directory\"],\"extends\":\"https://w3id.org/cwl/salad#PrimitiveType\"},{\"type\":\"record\",\"name\":\"OutputRecordSchema\",\"fields\":[{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OutputRecordField\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"rdfs:comment\",\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"type\",\"type\":[\"CWLType\",\"OutputRecordSchema\",{\"type\":\"record\",\"name\":\"OutputEnumSchema\",\"fields\":[{\"name\":\"symbols\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandOutputBinding\",\"doc\":\"Describes how to generate an output parameter based on the files produced\\nby a CommandLineTool.\\n\\nThe output parameter is generated by applying these operations in\\nthe following order:\\n\\n  - glob\\n  - loadContents\\n  - outputEval\\n\",\"fields\":[{\"name\":\"glob\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"'Expression' is not a real type.  It indicates that a field must allow\\nruntime parameter references.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]},{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Find files relative to the output directory, using POSIX glob(3)\\npathname matching.  If an array is provided, find files that match any\\npattern in the array.  If an expression is provided, the expression must\\nreturn a string or an array of strings, which will then be evaluated as\\none or more glob patterns.  Must only match and return files which\\nactually exist.\\n\"},{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"For each file matched in `glob`, read up to\\nthe first 64 KiB of text from the file and place it in the `contents`\\nfield of the file object for manipulation by `outputEval`.\\n\",\"jsonldPredicate\":\"cwl:loadContents\"},{\"name\":\"outputEval\",\"type\":[\"null\",\"string\",\"Expression\"],\"doc\":\"Evaluate an expression to generate the output value.  If `glob` was\\nspecified, the value of `self` must be an array containing file objects\\nthat were matched.  If no files were matched, `self` must be a zero\\nlength array; if a single file was matched, the value of `self` is an\\narray of a single element.  Additionally, if `loadContents` is `true`,\\nthe File objects must include up to the first 64 KiB of file contents\\nin the `contents` field.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#OutputBinding\"}],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#EnumSchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"]},\"OutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordField\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"extends\":\"https://w3id.org/cwl/salad#RecordField\",\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#PrimitiveType\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CWLType\"}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":{\"_id\":\"https://w3id.org/cwl/salad#fields\",\"mapSubject\":\"name\",\"mapPredicate\":\"type\"},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#RecordSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#RecordSchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordField\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordField\"}]},\"OutputEnumSchema\",\"OutputArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"CWLType\",\"OutputRecordSchema\",\"OutputEnumSchema\",\"OutputArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#ArraySchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"outputBinding\",\"type\":[\"null\",\"CommandOutputBinding\"],\"jsonldPredicate\":\"cwl:outputBinding\"}],\"docParent\":\"https://w3id.org/cwl/cwl#OutputParameter\",\"extends\":[\"https://w3id.org/cwl/salad#ArraySchema\",\"https://w3id.org/cwl/cwl#OutputSchema\"],\"specialize\":[{\"specializeFrom\":\"https://w3id.org/cwl/salad#RecordSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputRecordSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#EnumSchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputEnumSchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#ArraySchema\",\"specializeTo\":\"https://w3id.org/cwl/cwl#OutputArraySchema\"},{\"specializeFrom\":\"https://w3id.org/cwl/salad#PrimitiveType\",\"specializeTo\":\"https://w3id.org/cwl/cwl#CWLType\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Defines the type of the array elements. */
  @Deprecated public java.lang.Object items;
  /** Must be `array` */
  @Deprecated public Array_symbol type;
  /** A short, human-readable label of this object. */
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public CommandOutputBinding outputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OutputArraySchema() {}

  /**
   * All-args constructor.
   * @param items Defines the type of the array elements.
   * @param type Must be `array`
   * @param label A short, human-readable label of this object.
   * @param outputBinding The new value for outputBinding
   */
  public OutputArraySchema(java.lang.Object items, Array_symbol type, java.lang.CharSequence label, CommandOutputBinding outputBinding) {
    this.items = items;
    this.type = type;
    this.label = label;
    this.outputBinding = outputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return items;
    case 1: return type;
    case 2: return label;
    case 3: return outputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: items = (java.lang.Object)value$; break;
    case 1: type = (Array_symbol)value$; break;
    case 2: label = (java.lang.CharSequence)value$; break;
    case 3: outputBinding = (CommandOutputBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'items' field.
   * @return Defines the type of the array elements.
   */
  public java.lang.Object getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * Defines the type of the array elements.
   * @param value the value to set.
   */
  public void setItems(java.lang.Object value) {
    this.items = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return Must be `array`
   */
  public Array_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `array`
   * @param value the value to set.
   */
  public void setType(Array_symbol value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'label' field.
   * @return A short, human-readable label of this object.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * A short, human-readable label of this object.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
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
   * Creates a new OutputArraySchema RecordBuilder.
   * @return A new OutputArraySchema RecordBuilder
   */
  public static OutputArraySchema.Builder newBuilder() {
    return new OutputArraySchema.Builder();
  }

  /**
   * Creates a new OutputArraySchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OutputArraySchema RecordBuilder
   */
  public static OutputArraySchema.Builder newBuilder(OutputArraySchema.Builder other) {
    return new OutputArraySchema.Builder(other);
  }

  /**
   * Creates a new OutputArraySchema RecordBuilder by copying an existing OutputArraySchema instance.
   * @param other The existing instance to copy.
   * @return A new OutputArraySchema RecordBuilder
   */
  public static OutputArraySchema.Builder newBuilder(OutputArraySchema other) {
    return new OutputArraySchema.Builder(other);
  }

  /**
   * RecordBuilder for OutputArraySchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OutputArraySchema>
    implements org.apache.avro.data.RecordBuilder<OutputArraySchema> {

    /** Defines the type of the array elements. */
    private java.lang.Object items;
    /** Must be `array` */
    private Array_symbol type;
    /** A short, human-readable label of this object. */
    private java.lang.CharSequence label;
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
    private Builder(OutputArraySchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.items)) {
        this.items = data().deepCopy(fields()[0].schema(), other.items);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.label)) {
        this.label = data().deepCopy(fields()[2].schema(), other.label);
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
     * Creates a Builder by copying an existing OutputArraySchema instance
     * @param other The existing instance to copy.
     */
    private Builder(OutputArraySchema other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.items)) {
        this.items = data().deepCopy(fields()[0].schema(), other.items);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.label)) {
        this.label = data().deepCopy(fields()[2].schema(), other.label);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.outputBinding)) {
        this.outputBinding = data().deepCopy(fields()[3].schema(), other.outputBinding);
        fieldSetFlags()[3] = true;
      }
      this.outputBindingBuilder = null;
    }

    /**
      * Gets the value of the 'items' field.
      * Defines the type of the array elements.
      * @return The value.
      */
    public java.lang.Object getItems() {
      return items;
    }

    /**
      * Sets the value of the 'items' field.
      * Defines the type of the array elements.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public OutputArraySchema.Builder setItems(java.lang.Object value) {
      validate(fields()[0], value);
      this.items = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * Defines the type of the array elements.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'items' field.
      * Defines the type of the array elements.
      * @return This builder.
      */
    public OutputArraySchema.Builder clearItems() {
      items = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Must be `array`
      * @return The value.
      */
    public Array_symbol getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * Must be `array`
      * @param value The value of 'type'.
      * @return This builder.
      */
    public OutputArraySchema.Builder setType(Array_symbol value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Must be `array`
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * Must be `array`
      * @return This builder.
      */
    public OutputArraySchema.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'label' field.
      * A short, human-readable label of this object.
      * @return The value.
      */
    public java.lang.CharSequence getLabel() {
      return label;
    }

    /**
      * Sets the value of the 'label' field.
      * A short, human-readable label of this object.
      * @param value The value of 'label'.
      * @return This builder.
      */
    public OutputArraySchema.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.label = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'label' field has been set.
      * A short, human-readable label of this object.
      * @return True if the 'label' field has been set, false otherwise.
      */
    public boolean hasLabel() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'label' field.
      * A short, human-readable label of this object.
      * @return This builder.
      */
    public OutputArraySchema.Builder clearLabel() {
      label = null;
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
    public OutputArraySchema.Builder setOutputBinding(CommandOutputBinding value) {
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
    public OutputArraySchema.Builder setOutputBindingBuilder(CommandOutputBinding.Builder value) {
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
    public OutputArraySchema.Builder clearOutputBinding() {
      outputBinding = null;
      outputBindingBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public OutputArraySchema build() {
      try {
        OutputArraySchema record = new OutputArraySchema();
        record.items = fieldSetFlags()[0] ? this.items : (java.lang.Object) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (Array_symbol) defaultValue(fields()[1]);
        record.label = fieldSetFlags()[2] ? this.label : (java.lang.CharSequence) defaultValue(fields()[2]);
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
