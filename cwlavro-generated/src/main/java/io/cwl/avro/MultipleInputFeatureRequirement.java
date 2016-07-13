package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Indicates that the workflow platform must support multiple inbound data links
listed in the `source` field of [WorkflowStepInput](#WorkflowStepInput).
 */
@org.apache.avro.specific.AvroGenerated
public class MultipleInputFeatureRequirement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5386172918476389294L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MultipleInputFeatureRequirement\",\"doc\":\"Indicates that the workflow platform must support multiple inbound data links\\nlisted in the `source` field of [WorkflowStepInput](#WorkflowStepInput).\\n\",\"fields\":[{\"name\":\"class\",\"type\":\"string\",\"doc\":\"Always 'MultipleInputFeatureRequirement'\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"@type\"}}],\"extends\":\"https://w3id.org/cwl/cwl#ProcessRequirement\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Always 'MultipleInputFeatureRequirement' */
  @Deprecated public java.lang.CharSequence class$;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MultipleInputFeatureRequirement() {}

  /**
   * All-args constructor.
   * @param class$ Always 'MultipleInputFeatureRequirement'
   */
  public MultipleInputFeatureRequirement(java.lang.CharSequence class$) {
    this.class$ = class$;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return class$;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: class$ = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'class$' field.
   * @return Always 'MultipleInputFeatureRequirement'
   */
  public java.lang.CharSequence getClass$() {
    return class$;
  }

  /**
   * Sets the value of the 'class$' field.
   * Always 'MultipleInputFeatureRequirement'
   * @param value the value to set.
   */
  public void setClass$(java.lang.CharSequence value) {
    this.class$ = value;
  }

  /**
   * Creates a new MultipleInputFeatureRequirement RecordBuilder.
   * @return A new MultipleInputFeatureRequirement RecordBuilder
   */
  public static MultipleInputFeatureRequirement.Builder newBuilder() {
    return new MultipleInputFeatureRequirement.Builder();
  }

  /**
   * Creates a new MultipleInputFeatureRequirement RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MultipleInputFeatureRequirement RecordBuilder
   */
  public static MultipleInputFeatureRequirement.Builder newBuilder(MultipleInputFeatureRequirement.Builder other) {
    return new MultipleInputFeatureRequirement.Builder(other);
  }

  /**
   * Creates a new MultipleInputFeatureRequirement RecordBuilder by copying an existing MultipleInputFeatureRequirement instance.
   * @param other The existing instance to copy.
   * @return A new MultipleInputFeatureRequirement RecordBuilder
   */
  public static MultipleInputFeatureRequirement.Builder newBuilder(MultipleInputFeatureRequirement other) {
    return new MultipleInputFeatureRequirement.Builder(other);
  }

  /**
   * RecordBuilder for MultipleInputFeatureRequirement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MultipleInputFeatureRequirement>
    implements org.apache.avro.data.RecordBuilder<MultipleInputFeatureRequirement> {

    /** Always 'MultipleInputFeatureRequirement' */
    private java.lang.CharSequence class$;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(MultipleInputFeatureRequirement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MultipleInputFeatureRequirement instance
     * @param other The existing instance to copy.
     */
    private Builder(MultipleInputFeatureRequirement other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'class$' field.
      * Always 'MultipleInputFeatureRequirement'
      * @return The value.
      */
    public java.lang.CharSequence getClass$() {
      return class$;
    }

    /**
      * Sets the value of the 'class$' field.
      * Always 'MultipleInputFeatureRequirement'
      * @param value The value of 'class$'.
      * @return This builder.
      */
    public MultipleInputFeatureRequirement.Builder setClass$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.class$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'class$' field has been set.
      * Always 'MultipleInputFeatureRequirement'
      * @return True if the 'class$' field has been set, false otherwise.
      */
    public boolean hasClass$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'class$' field.
      * Always 'MultipleInputFeatureRequirement'
      * @return This builder.
      */
    public MultipleInputFeatureRequirement.Builder clearClass$() {
      class$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public MultipleInputFeatureRequirement build() {
      try {
        MultipleInputFeatureRequirement record = new MultipleInputFeatureRequirement();
        record.class$ = fieldSetFlags()[0] ? this.class$ : (java.lang.CharSequence) defaultValue(fields()[0]);
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
