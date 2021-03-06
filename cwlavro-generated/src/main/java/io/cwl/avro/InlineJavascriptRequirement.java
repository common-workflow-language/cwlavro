package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Indicates that the workflow platform must support inline Javascript expressions.
If this requirement is not present, the workflow platform must not perform expression
interpolatation.
 */
@org.apache.avro.specific.AvroGenerated
public class InlineJavascriptRequirement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6046286333257576604L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InlineJavascriptRequirement\",\"doc\":\"Indicates that the workflow platform must support inline Javascript expressions.\\nIf this requirement is not present, the workflow platform must not perform expression\\ninterpolatation.\\n\",\"fields\":[{\"name\":\"class\",\"type\":\"string\",\"doc\":\"Always 'InlineJavascriptRequirement'\",\"jsonldPredicate\":{\"_type\":\"@vocab\",\"_id\":\"@type\"}},{\"name\":\"expressionLib\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Additional code fragments that will also be inserted\\nbefore executing the expression code.  Allows for function definitions that may\\nbe called from CWL expressions.\\n\"}],\"extends\":\"https://w3id.org/cwl/cwl#ProcessRequirement\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Always 'InlineJavascriptRequirement' */
  @Deprecated public java.lang.CharSequence class$;
  /** Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.
 */
  @Deprecated public java.util.List<java.lang.CharSequence> expressionLib;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InlineJavascriptRequirement() {}

  /**
   * All-args constructor.
   * @param class$ Always 'InlineJavascriptRequirement'
   * @param expressionLib Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

   */
  public InlineJavascriptRequirement(java.lang.CharSequence class$, java.util.List<java.lang.CharSequence> expressionLib) {
    this.class$ = class$;
    this.expressionLib = expressionLib;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return class$;
    case 1: return expressionLib;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: class$ = (java.lang.CharSequence)value$; break;
    case 1: expressionLib = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'class$' field.
   * @return Always 'InlineJavascriptRequirement'
   */
  public java.lang.CharSequence getClass$() {
    return class$;
  }

  /**
   * Sets the value of the 'class$' field.
   * Always 'InlineJavascriptRequirement'
   * @param value the value to set.
   */
  public void setClass$(java.lang.CharSequence value) {
    this.class$ = value;
  }

  /**
   * Gets the value of the 'expressionLib' field.
   * @return Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

   */
  public java.util.List<java.lang.CharSequence> getExpressionLib() {
    return expressionLib;
  }

  /**
   * Sets the value of the 'expressionLib' field.
   * Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

   * @param value the value to set.
   */
  public void setExpressionLib(java.util.List<java.lang.CharSequence> value) {
    this.expressionLib = value;
  }

  /**
   * Creates a new InlineJavascriptRequirement RecordBuilder.
   * @return A new InlineJavascriptRequirement RecordBuilder
   */
  public static InlineJavascriptRequirement.Builder newBuilder() {
    return new InlineJavascriptRequirement.Builder();
  }

  /**
   * Creates a new InlineJavascriptRequirement RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InlineJavascriptRequirement RecordBuilder
   */
  public static InlineJavascriptRequirement.Builder newBuilder(InlineJavascriptRequirement.Builder other) {
    return new InlineJavascriptRequirement.Builder(other);
  }

  /**
   * Creates a new InlineJavascriptRequirement RecordBuilder by copying an existing InlineJavascriptRequirement instance.
   * @param other The existing instance to copy.
   * @return A new InlineJavascriptRequirement RecordBuilder
   */
  public static InlineJavascriptRequirement.Builder newBuilder(InlineJavascriptRequirement other) {
    return new InlineJavascriptRequirement.Builder(other);
  }

  /**
   * RecordBuilder for InlineJavascriptRequirement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InlineJavascriptRequirement>
    implements org.apache.avro.data.RecordBuilder<InlineJavascriptRequirement> {

    /** Always 'InlineJavascriptRequirement' */
    private java.lang.CharSequence class$;
    /** Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.
 */
    private java.util.List<java.lang.CharSequence> expressionLib;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(InlineJavascriptRequirement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.expressionLib)) {
        this.expressionLib = data().deepCopy(fields()[1].schema(), other.expressionLib);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InlineJavascriptRequirement instance
     * @param other The existing instance to copy.
     */
    private Builder(InlineJavascriptRequirement other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.class$)) {
        this.class$ = data().deepCopy(fields()[0].schema(), other.class$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.expressionLib)) {
        this.expressionLib = data().deepCopy(fields()[1].schema(), other.expressionLib);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'class$' field.
      * Always 'InlineJavascriptRequirement'
      * @return The value.
      */
    public java.lang.CharSequence getClass$() {
      return class$;
    }

    /**
      * Sets the value of the 'class$' field.
      * Always 'InlineJavascriptRequirement'
      * @param value The value of 'class$'.
      * @return This builder.
      */
    public InlineJavascriptRequirement.Builder setClass$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.class$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'class$' field has been set.
      * Always 'InlineJavascriptRequirement'
      * @return True if the 'class$' field has been set, false otherwise.
      */
    public boolean hasClass$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'class$' field.
      * Always 'InlineJavascriptRequirement'
      * @return This builder.
      */
    public InlineJavascriptRequirement.Builder clearClass$() {
      class$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'expressionLib' field.
      * Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getExpressionLib() {
      return expressionLib;
    }

    /**
      * Sets the value of the 'expressionLib' field.
      * Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

      * @param value The value of 'expressionLib'.
      * @return This builder.
      */
    public InlineJavascriptRequirement.Builder setExpressionLib(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.expressionLib = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'expressionLib' field has been set.
      * Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

      * @return True if the 'expressionLib' field has been set, false otherwise.
      */
    public boolean hasExpressionLib() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'expressionLib' field.
      * Additional code fragments that will also be inserted
before executing the expression code.  Allows for function definitions that may
be called from CWL expressions.

      * @return This builder.
      */
    public InlineJavascriptRequirement.Builder clearExpressionLib() {
      expressionLib = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public InlineJavascriptRequirement build() {
      try {
        InlineJavascriptRequirement record = new InlineJavascriptRequirement();
        record.class$ = fieldSetFlags()[0] ? this.class$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.expressionLib = fieldSetFlags()[1] ? this.expressionLib : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
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
