package io.cwl.avro;
/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SoftwarePackage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3275994701128068149L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SoftwarePackage\",\"fields\":[{\"name\":\"package\",\"type\":\"string\",\"doc\":\"The common name of the software to be configured.\",\"jsonldPredicate\":\"@id\"},{\"name\":\"version\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"The (optional) version of the software to configured.\"},{\"name\":\"specs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"Must be one or more IRIs identifying resources for installing or\\nenabling the software.  Implementations may provide resolvers which map\\nwell-known software spec IRIs to some configuration action.\\n\\nFor example, an IRI `https://packages.debian.org/jessie/bowtie` could\\nbe resolved with `apt-get install bowtie`.  An IRI\\n`https://anaconda.org/bioconda/bowtie` could be resolved with `conda\\ninstall -c bioconda bowtie`.\\n\\nTools may also provide IRIs to index entries such as\\n[RRID](http://www.identifiers.org/rrid/), such as\\n`http://identifiers.org/rrid/RRID:SCR_005476`\\n\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The common name of the software to be configured. */
  @Deprecated public java.lang.CharSequence package$;
  /** The (optional) version of the software to configured. */
  @Deprecated public java.util.List<java.lang.CharSequence> version;
  /** Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`
 */
  @Deprecated public java.util.List<java.lang.CharSequence> specs;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SoftwarePackage() {}

  /**
   * All-args constructor.
   * @param package$ The common name of the software to be configured.
   * @param version The (optional) version of the software to configured.
   * @param specs Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

   */
  public SoftwarePackage(java.lang.CharSequence package$, java.util.List<java.lang.CharSequence> version, java.util.List<java.lang.CharSequence> specs) {
    this.package$ = package$;
    this.version = version;
    this.specs = specs;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return package$;
    case 1: return version;
    case 2: return specs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: package$ = (java.lang.CharSequence)value$; break;
    case 1: version = (java.util.List<java.lang.CharSequence>)value$; break;
    case 2: specs = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'package$' field.
   * @return The common name of the software to be configured.
   */
  public java.lang.CharSequence getPackage$() {
    return package$;
  }

  /**
   * Sets the value of the 'package$' field.
   * The common name of the software to be configured.
   * @param value the value to set.
   */
  public void setPackage$(java.lang.CharSequence value) {
    this.package$ = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The (optional) version of the software to configured.
   */
  public java.util.List<java.lang.CharSequence> getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * The (optional) version of the software to configured.
   * @param value the value to set.
   */
  public void setVersion(java.util.List<java.lang.CharSequence> value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'specs' field.
   * @return Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

   */
  public java.util.List<java.lang.CharSequence> getSpecs() {
    return specs;
  }

  /**
   * Sets the value of the 'specs' field.
   * Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

   * @param value the value to set.
   */
  public void setSpecs(java.util.List<java.lang.CharSequence> value) {
    this.specs = value;
  }

  /**
   * Creates a new SoftwarePackage RecordBuilder.
   * @return A new SoftwarePackage RecordBuilder
   */
  public static SoftwarePackage.Builder newBuilder() {
    return new SoftwarePackage.Builder();
  }

  /**
   * Creates a new SoftwarePackage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SoftwarePackage RecordBuilder
   */
  public static SoftwarePackage.Builder newBuilder(SoftwarePackage.Builder other) {
    return new SoftwarePackage.Builder(other);
  }

  /**
   * Creates a new SoftwarePackage RecordBuilder by copying an existing SoftwarePackage instance.
   * @param other The existing instance to copy.
   * @return A new SoftwarePackage RecordBuilder
   */
  public static SoftwarePackage.Builder newBuilder(SoftwarePackage other) {
    return new SoftwarePackage.Builder(other);
  }

  /**
   * RecordBuilder for SoftwarePackage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SoftwarePackage>
    implements org.apache.avro.data.RecordBuilder<SoftwarePackage> {

    /** The common name of the software to be configured. */
    private java.lang.CharSequence package$;
    /** The (optional) version of the software to configured. */
    private java.util.List<java.lang.CharSequence> version;
    /** Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`
 */
    private java.util.List<java.lang.CharSequence> specs;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(SoftwarePackage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.package$)) {
        this.package$ = data().deepCopy(fields()[0].schema(), other.package$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specs)) {
        this.specs = data().deepCopy(fields()[2].schema(), other.specs);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SoftwarePackage instance
     * @param other The existing instance to copy.
     */
    private Builder(SoftwarePackage other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.package$)) {
        this.package$ = data().deepCopy(fields()[0].schema(), other.package$);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.version)) {
        this.version = data().deepCopy(fields()[1].schema(), other.version);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specs)) {
        this.specs = data().deepCopy(fields()[2].schema(), other.specs);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'package$' field.
      * The common name of the software to be configured.
      * @return The value.
      */
    public java.lang.CharSequence getPackage$() {
      return package$;
    }

    /**
      * Sets the value of the 'package$' field.
      * The common name of the software to be configured.
      * @param value The value of 'package$'.
      * @return This builder.
      */
    public SoftwarePackage.Builder setPackage$(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.package$ = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'package$' field has been set.
      * The common name of the software to be configured.
      * @return True if the 'package$' field has been set, false otherwise.
      */
    public boolean hasPackage$() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'package$' field.
      * The common name of the software to be configured.
      * @return This builder.
      */
    public SoftwarePackage.Builder clearPackage$() {
      package$ = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * The (optional) version of the software to configured.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * The (optional) version of the software to configured.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public SoftwarePackage.Builder setVersion(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.version = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * The (optional) version of the software to configured.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'version' field.
      * The (optional) version of the software to configured.
      * @return This builder.
      */
    public SoftwarePackage.Builder clearVersion() {
      version = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'specs' field.
      * Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getSpecs() {
      return specs;
    }

    /**
      * Sets the value of the 'specs' field.
      * Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

      * @param value The value of 'specs'.
      * @return This builder.
      */
    public SoftwarePackage.Builder setSpecs(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.specs = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'specs' field has been set.
      * Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

      * @return True if the 'specs' field has been set, false otherwise.
      */
    public boolean hasSpecs() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'specs' field.
      * Must be one or more IRIs identifying resources for installing or
enabling the software.  Implementations may provide resolvers which map
well-known software spec IRIs to some configuration action.

For example, an IRI `https://packages.debian.org/jessie/bowtie` could
be resolved with `apt-get install bowtie`.  An IRI
`https://anaconda.org/bioconda/bowtie` could be resolved with `conda
install -c bioconda bowtie`.

Tools may also provide IRIs to index entries such as
[RRID](http://www.identifiers.org/rrid/), such as
`http://identifiers.org/rrid/RRID:SCR_005476`

      * @return This builder.
      */
    public SoftwarePackage.Builder clearSpecs() {
      specs = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public SoftwarePackage build() {
      try {
        SoftwarePackage record = new SoftwarePackage();
        record.package$ = fieldSetFlags()[0] ? this.package$ : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.version = fieldSetFlags()[1] ? this.version : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        record.specs = fieldSetFlags()[2] ? this.specs : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
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
