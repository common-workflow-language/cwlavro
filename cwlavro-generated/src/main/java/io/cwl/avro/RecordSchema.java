package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RecordSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7922924870479178867L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordSchema\",\"fields\":[{\"name\":\"fields\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordField\",\"doc\":\"A field of a record.\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The name of the field\\n\",\"jsonldPredicate\":\"@id\"},{\"name\":\"doc\",\"type\":[\"null\",\"string\"],\"doc\":\"A documentation string for this field\\n\",\"jsonldPredicate\":\"rdfs:comment\"},{\"name\":\"type\",\"type\":[{\"type\":\"enum\",\"name\":\"PrimitiveType\",\"symbols\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\"]},\"RecordSchema\",{\"type\":\"record\",\"name\":\"EnumSchema\",\"doc\":\"Define an enumerated type.\\n\",\"fields\":[{\"name\":\"symbols\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Defines the set of valid symbols.\",\"jsonldPredicate\":{\"_type\":\"@id\",\"_id\":\"https://w3id.org/cwl/salad#symbols\",\"identity\":true}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Enum_symbol\",\"symbols\":[\"enum\"]},\"doc\":\"Must be `enum`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true}}]},{\"type\":\"record\",\"name\":\"ArraySchema\",\"fields\":[{\"name\":\"items\",\"type\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"Defines the type of the array elements.\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#items\"}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Array_symbol\",\"symbols\":[\"array\"]},\"doc\":\"Must be `array`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true}}]},\"string\",{\"type\":\"array\",\"items\":[\"PrimitiveType\",\"RecordSchema\",\"EnumSchema\",\"ArraySchema\",\"string\"]}],\"doc\":\"The field type\\n\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true}}]}}],\"doc\":\"Defines the fields of the record.\",\"jsonldPredicate\":{\"_id\":\"https://w3id.org/cwl/salad#fields\",\"mapSubject\":\"name\",\"mapPredicate\":\"type\"}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"Record_symbol\",\"symbols\":[\"record\"]},\"doc\":\"Must be `record`\",\"jsonldPredicate\":{\"refScope\":2,\"_type\":\"@vocab\",\"_id\":\"https://w3id.org/cwl/salad#type\",\"typeDSL\":true}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Defines the fields of the record. */
  @Deprecated public java.util.List<RecordField> fields;
  /** Must be `record` */
  @Deprecated public Record_symbol type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordSchema() {}

  /**
   * All-args constructor.
   * @param fields Defines the fields of the record.
   * @param type Must be `record`
   */
  public RecordSchema(java.util.List<RecordField> fields, Record_symbol type) {
    this.fields = fields;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fields;
    case 1: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fields = (java.util.List<RecordField>)value$; break;
    case 1: type = (Record_symbol)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fields' field.
   * @return Defines the fields of the record.
   */
  public java.util.List<RecordField> getFields() {
    return fields;
  }

  /**
   * Sets the value of the 'fields' field.
   * Defines the fields of the record.
   * @param value the value to set.
   */
  public void setFields(java.util.List<RecordField> value) {
    this.fields = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return Must be `record`
   */
  public Record_symbol getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * Must be `record`
   * @param value the value to set.
   */
  public void setType(Record_symbol value) {
    this.type = value;
  }

  /**
   * Creates a new RecordSchema RecordBuilder.
   * @return A new RecordSchema RecordBuilder
   */
  public static RecordSchema.Builder newBuilder() {
    return new RecordSchema.Builder();
  }

  /**
   * Creates a new RecordSchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordSchema RecordBuilder
   */
  public static RecordSchema.Builder newBuilder(RecordSchema.Builder other) {
    return new RecordSchema.Builder(other);
  }

  /**
   * Creates a new RecordSchema RecordBuilder by copying an existing RecordSchema instance.
   * @param other The existing instance to copy.
   * @return A new RecordSchema RecordBuilder
   */
  public static RecordSchema.Builder newBuilder(RecordSchema other) {
    return new RecordSchema.Builder(other);
  }

  /**
   * RecordBuilder for RecordSchema instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordSchema>
    implements org.apache.avro.data.RecordBuilder<RecordSchema> {

    /** Defines the fields of the record. */
    private java.util.List<RecordField> fields;
    /** Must be `record` */
    private Record_symbol type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(RecordSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fields)) {
        this.fields = data().deepCopy(fields()[0].schema(), other.fields);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RecordSchema instance
     * @param other The existing instance to copy.
     */
    private Builder(RecordSchema other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.fields)) {
        this.fields = data().deepCopy(fields()[0].schema(), other.fields);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'fields' field.
      * Defines the fields of the record.
      * @return The value.
      */
    public java.util.List<RecordField> getFields() {
      return fields;
    }

    /**
      * Sets the value of the 'fields' field.
      * Defines the fields of the record.
      * @param value The value of 'fields'.
      * @return This builder.
      */
    public RecordSchema.Builder setFields(java.util.List<RecordField> value) {
      validate(fields()[0], value);
      this.fields = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fields' field has been set.
      * Defines the fields of the record.
      * @return True if the 'fields' field has been set, false otherwise.
      */
    public boolean hasFields() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fields' field.
      * Defines the fields of the record.
      * @return This builder.
      */
    public RecordSchema.Builder clearFields() {
      fields = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Must be `record`
      * @return The value.
      */
    public Record_symbol getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * Must be `record`
      * @param value The value of 'type'.
      * @return This builder.
      */
    public RecordSchema.Builder setType(Record_symbol value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Must be `record`
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * Must be `record`
      * @return This builder.
      */
    public RecordSchema.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public RecordSchema build() {
      try {
        RecordSchema record = new RecordSchema();
        record.fields = fieldSetFlags()[0] ? this.fields : (java.util.List<RecordField>) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (Record_symbol) defaultValue(fields()[1]);
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
