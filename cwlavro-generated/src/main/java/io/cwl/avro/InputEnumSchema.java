package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InputEnumSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5871834633624412295L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InputEnumSchema\",\"fields\":[{\"name\":\"symbols\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true},\"inherited_from\":\"https://w3id.org/cwl/salad#EnumSchema\"},{\"name\":\"label\",\"type\":[\"null\",\"string\"],\"doc\":\"A short, human-readable label of this object.\",\"jsonldPredicate\":\"rdfs:label\",\"inherited_from\":\"https://w3id.org/cwl/cwl#SchemaBase\"},{\"name\":\"inputBinding\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CommandLineBinding\",\"doc\":\"\\nWhen listed under `inputBinding` in the input schema, the term\\n\\\"value\\\" refers to the the corresponding value in the input object.  For\\nbinding objects listed in `CommandLineTool.arguments`, the term \\\"value\\\"\\nrefers to the effective value after evaluating `valueFrom`.\\n\\nThe binding behavior when building the command line depends on the data\\ntype of the value.  If there is a mismatch between the type described by\\nthe input schema and the effective value, such as resulting from an\\nexpression evaluation, an implementation must use the data type of the\\neffective value.\\n\\n  - **string**: Add `prefix` and the string to the command line.\\n\\n  - **number**: Add `prefix` and decimal representation to command line.\\n\\n  - **boolean**: If true, add `prefix` to the command line.  If false, add\\n      nothing.\\n\\n  - **File**: Add `prefix` and the value of\\n    [`File.path`](#File) to the command line.\\n\\n  - **array**: If `itemSeparator` is specified, add `prefix` and the join\\n      the array into a single string with `itemSeparator` separating the\\n      items.  Otherwise first add `prefix`, then recursively process\\n      individual elements.\\n\\n  - **object**: Add `prefix` only, and recursively add object fields for\\n      which `inputBinding` is specified.\\n\\n  - **null**: Add nothing.\\n\",\"fields\":[{\"name\":\"loadContents\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Only valid when `type: File` or is an array of `items: File`.\\n\\nRead up to the first 64 KiB of text from the file and place it in the\\n\\\"contents\\\" field of the file object for use by expressions.\\n\",\"jsonldPredicate\":\"cwl:loadContents\",\"inherited_from\":\"https://w3id.org/cwl/cwl#InputBinding\"},{\"name\":\"position\",\"type\":[\"null\",\"int\"],\"doc\":\"The sorting key.  Default position is 0.\"},{\"name\":\"prefix\",\"type\":[\"null\",\"string\"],\"doc\":\"Command line prefix to add before the value.\"},{\"name\":\"separate\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If true (default), then the prefix and value must be added as separate\\ncommand line arguments; if false, prefix and value must be concatenated\\ninto a single command line argument.\\n\"},{\"name\":\"itemSeparator\",\"type\":[\"null\",\"string\"],\"doc\":\"Join the array elements into a single string with the elements\\nseparated by by `itemSeparator`.\\n\"},{\"name\":\"valueFrom\",\"type\":[\"null\",\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"'Expression' is not a real type.  It indicates that a field must allow\\nruntime parameter references.  If [InlineJavascriptRequirement](#InlineJavascriptRequirement)\\nis declared and supported by the platform, the field must also allow\\nJavascript expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]}],\"doc\":\"If `valueFrom` is a constant string value, use this as the value and\\napply the binding rules above.\\n\\nIf `valueFrom` is an expression, evaluate the expression to yield the\\nactual value to use to build the command line and apply the binding\\nrules above.  If the inputBinding is associated with an input\\nparameter, the value of `self` in the expression will be the value of the\\ninput parameter.\\n\\nWhen a binding is part of the `CommandLineTool.arguments` field,\\nthe `valueFrom` field is required.\\n\",\"jsonldPredicate\":\"cwl:valueFrom\"},{\"name\":\"shellQuote\",\"type\":[\"null\",\"boolean\"],\"doc\":\"If `ShellCommandRequirement` is in the requirements for the current command,\\nthis controls whether the value is quoted on the command line (default is true).\\nUse `shellQuote: false` to inject metacharacters for operations such as pipes.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#InputBinding\"}],\"jsonldPredicate\":\"cwl:inputBinding\"}],\"extends\":[\"https://w3id.org/cwl/salad#EnumSchema\",\"https://w3id.org/cwl/cwl#InputSchema\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Defines the set of valid symbols. */
  @Deprecated public java.util.List<java.lang.CharSequence> symbols;
  /** Must be `enum` */
  @Deprecated public Enum_symbol type;
  /** A short, human-readable label of this object. */
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public CommandLineBinding inputBinding;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InputEnumSchema() {}

  /**
   * All-args constructor.
   * @param symbols Defines the set of valid symbols.
   * @param type Must be `enum`
   * @param label A short, human-readable label of this object.
   * @param inputBinding The new value for inputBinding
   */
  public InputEnumSchema(java.util.List<java.lang.CharSequence> symbols, Enum_symbol type, java.lang.CharSequence label, CommandLineBinding inputBinding) {
    this.symbols = symbols;
    this.type = type;
    this.label = label;
    this.inputBinding = inputBinding;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return symbols;
    case 1: return type;
    case 2: return label;
    case 3: return inputBinding;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: symbols = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: type = (Enum_symbol)value$; break;
    case 2: label = (java.lang.CharSequence)value$; break;
    case 3: inputBinding = (CommandLineBinding)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'symbols' field.
   * @return Defines the set of valid symbols.
   */
  public java.util.List<java.lang.CharSequence> getSymbols() {
    return symbols;
  }

  /**
   * Sets the value of the 'symbols' field.
   * Defines the set of valid symbols.
   * @param value the value to set.
   */
  public void setSymbols(java.util.List<java.lang.CharSequence> value) {
    this.symbols = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return Must be `enum`
   */
  public Enum_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `enum`
   * @param value the value to set.
   */
  public void setType(Enum_symbol value) {
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
   * Gets the value of the 'inputBinding' field.
   * @return The value of the 'inputBinding' field.
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
   * Creates a new InputEnumSchema RecordBuilder.
   * @return A new InputEnumSchema RecordBuilder
   */
  public static InputEnumSchema.Builder newBuilder() {
    return new InputEnumSchema.Builder();
  }

  /**
   * Creates a new InputEnumSchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InputEnumSchema RecordBuilder
   */
  public static InputEnumSchema.Builder newBuilder(InputEnumSchema.Builder other) {
    return new InputEnumSchema.Builder(other);
  }

  /**
   * Creates a new InputEnumSchema RecordBuilder by copying an existing InputEnumSchema instance.
   * @param other The existing instance to copy.
   * @return A new InputEnumSchema RecordBuilder
   */
  public static InputEnumSchema.Builder newBuilder(InputEnumSchema other) {
    return new InputEnumSchema.Builder(other);
  }

  /**
   * RecordBuilder for InputEnumSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InputEnumSchema>
    implements org.apache.avro.data.RecordBuilder<InputEnumSchema> {

    /** Defines the set of valid symbols. */
    private java.util.List<java.lang.CharSequence> symbols;
    /** Must be `enum` */
    private Enum_symbol type;
    /** A short, human-readable label of this object. */
    private java.lang.CharSequence label;
    private CommandLineBinding inputBinding;
    private CommandLineBinding.Builder inputBindingBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(InputEnumSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.symbols)) {
        this.symbols = data().deepCopy(fields()[0].schema(), other.symbols);
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
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
      if (other.hasInputBindingBuilder()) {
        this.inputBindingBuilder = CommandLineBinding.newBuilder(other.getInputBindingBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing InputEnumSchema instance
     * @param other The existing instance to copy.
     */
    private Builder(InputEnumSchema other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.symbols)) {
        this.symbols = data().deepCopy(fields()[0].schema(), other.symbols);
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
      if (isValidValue(fields()[3], other.inputBinding)) {
        this.inputBinding = data().deepCopy(fields()[3].schema(), other.inputBinding);
        fieldSetFlags()[3] = true;
      }
      this.inputBindingBuilder = null;
    }

    /**
      * Gets the value of the 'symbols' field.
      * Defines the set of valid symbols.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getSymbols() {
      return symbols;
    }

    /**
      * Sets the value of the 'symbols' field.
      * Defines the set of valid symbols.
      * @param value The value of 'symbols'.
      * @return This builder.
      */
    public InputEnumSchema.Builder setSymbols(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.symbols = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'symbols' field has been set.
      * Defines the set of valid symbols.
      * @return True if the 'symbols' field has been set, false otherwise.
      */
    public boolean hasSymbols() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'symbols' field.
      * Defines the set of valid symbols.
      * @return This builder.
      */
    public InputEnumSchema.Builder clearSymbols() {
      symbols = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Must be `enum`
      * @return The value.
      */
    public Enum_symbol getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * Must be `enum`
      * @param value The value of 'type'.
      * @return This builder.
      */
    public InputEnumSchema.Builder setType(Enum_symbol value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Must be `enum`
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * Must be `enum`
      * @return This builder.
      */
    public InputEnumSchema.Builder clearType() {
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
    public InputEnumSchema.Builder setLabel(java.lang.CharSequence value) {
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
    public InputEnumSchema.Builder clearLabel() {
      label = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'inputBinding' field.
      * @return The value.
      */
    public CommandLineBinding getInputBinding() {
      return inputBinding;
    }

    /**
      * Sets the value of the 'inputBinding' field.
      * @param value The value of 'inputBinding'.
      * @return This builder.
      */
    public InputEnumSchema.Builder setInputBinding(CommandLineBinding value) {
      validate(fields()[3], value);
      this.inputBindingBuilder = null;
      this.inputBinding = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'inputBinding' field has been set.
      * @return True if the 'inputBinding' field has been set, false otherwise.
      */
    public boolean hasInputBinding() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'inputBinding' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public CommandLineBinding.Builder getInputBindingBuilder() {
      if (inputBindingBuilder == null) {
        if (hasInputBinding()) {
          setInputBindingBuilder(CommandLineBinding.newBuilder(inputBinding));
        } else {
          setInputBindingBuilder(CommandLineBinding.newBuilder());
        }
      }
      return inputBindingBuilder;
    }

    /**
     * Sets the Builder instance for the 'inputBinding' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public InputEnumSchema.Builder setInputBindingBuilder(CommandLineBinding.Builder value) {
      clearInputBinding();
      inputBindingBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'inputBinding' field has an active Builder instance
     * @return True if the 'inputBinding' field has an active Builder instance
     */
    public boolean hasInputBindingBuilder() {
      return inputBindingBuilder != null;
    }

    /**
      * Clears the value of the 'inputBinding' field.
      * @return This builder.
      */
    public InputEnumSchema.Builder clearInputBinding() {
      inputBinding = null;
      inputBindingBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public InputEnumSchema build() {
      try {
        InputEnumSchema record = new InputEnumSchema();
        record.symbols = fieldSetFlags()[0] ? this.symbols : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (Enum_symbol) defaultValue(fields()[1]);
        record.label = fieldSetFlags()[2] ? this.label : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (inputBindingBuilder != null) {
          record.inputBinding = this.inputBindingBuilder.build();
        } else {
          record.inputBinding = fieldSetFlags()[3] ? this.inputBinding : (CommandLineBinding) defaultValue(fields()[3]);
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
