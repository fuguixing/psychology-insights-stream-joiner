/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.psychology.rating.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RatingMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8972805313240756535L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RatingMessage\",\"namespace\":\"com.psychology.rating.avro\",\"fields\":[{\"name\":\"RATING_ID\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"PREDICTION_ID\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"PRED_SOPEN\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"RATING\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"CREATED_AT\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RatingMessage> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RatingMessage> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RatingMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RatingMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RatingMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RatingMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RatingMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RatingMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RatingMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Long RATING_ID;
  private java.lang.Long PREDICTION_ID;
  private java.lang.CharSequence RATING;
  private java.lang.CharSequence PRED_SOPEN;
  private java.lang.Long CREATED_AT;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RatingMessage() {}

  /**
   * All-args constructor.
   * @param RATING_ID The new value for RATING_ID
   * @param PREDICTION_ID The new value for PREDICTION_ID
   * @param RATING The new value for RATING
   * @param PRED_SOPEN The new value for PRED_SOPEN
   * @param CREATED_AT The new value for CREATED_AT
   */
  public RatingMessage(java.lang.Long RATING_ID, java.lang.Long PREDICTION_ID, java.lang.CharSequence RATING, java.lang.CharSequence PRED_SOPEN, java.lang.Long CREATED_AT) {
    this.RATING_ID = RATING_ID;
    this.PREDICTION_ID = PREDICTION_ID;
    this.RATING = RATING;
    this.PRED_SOPEN = PRED_SOPEN;
    this.CREATED_AT = CREATED_AT;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return RATING_ID;
    case 1: return PREDICTION_ID;
    case 2: return RATING;
    case 3: return PRED_SOPEN;
    case 4: return CREATED_AT;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: RATING_ID = (java.lang.Long)value$; break;
    case 1: PREDICTION_ID = (java.lang.Long)value$; break;
    case 2: RATING = (java.lang.CharSequence)value$; break;
    case 3: PRED_SOPEN = (java.lang.CharSequence)value$; break;
    case 4: CREATED_AT = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'RATING_ID' field.
   * @return The value of the 'RATING_ID' field.
   */
  public java.lang.Long getRATINGID() {
    return RATING_ID;
  }


  /**
   * Sets the value of the 'RATING_ID' field.
   * @param value the value to set.
   */
  public void setRATINGID(java.lang.Long value) {
    this.RATING_ID = value;
  }

  /**
   * Gets the value of the 'PREDICTION_ID' field.
   * @return The value of the 'PREDICTION_ID' field.
   */
  public java.lang.Long getPREDICTIONID() {
    return PREDICTION_ID;
  }


  /**
   * Sets the value of the 'PREDICTION_ID' field.
   * @param value the value to set.
   */
  public void setPREDICTIONID(java.lang.Long value) {
    this.PREDICTION_ID = value;
  }

  /**
   * Gets the value of the 'RATING' field.
   * @return The value of the 'RATING' field.
   */
  public java.lang.CharSequence getRATING() {
    return RATING;
  }


  /**
   * Sets the value of the 'RATING' field.
   * @param value the value to set.
   */
  public void setRATING(java.lang.CharSequence value) {
    this.RATING = value;
  }


  /**
   * Gets the value of the 'PRED_SOPEN' field.
   * @return The value of the 'PRED_SOPEN' field.
   */
  public java.lang.CharSequence getRPREDSOPEN() {
    return PRED_SOPEN;
  }


  /**
   * Sets the value of the 'PRED_SOPEN' field.
   * @param value the value to set.
   */
  public void setRPREDSOPEN(java.lang.CharSequence value) {
    this.PRED_SOPEN = value;
  }


  /**
   * Gets the value of the 'CREATED_AT' field.
   * @return The value of the 'CREATED_AT' field.
   */
  public java.lang.Long getCREATEDAT() {
    return CREATED_AT;
  }


  /**
   * Sets the value of the 'CREATED_AT' field.
   * @param value the value to set.
   */
  public void setCREATEDAT(java.lang.Long value) {
    this.CREATED_AT = value;
  }

  /**
   * Creates a new RatingMessage RecordBuilder.
   * @return A new RatingMessage RecordBuilder
   */
  public static RatingMessage.Builder newBuilder() {
    return new RatingMessage.Builder();
  }

  /**
   * Creates a new RatingMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RatingMessage RecordBuilder
   */
  public static RatingMessage.Builder newBuilder(RatingMessage.Builder other) {
    if (other == null) {
      return new RatingMessage.Builder();
    } else {
      return new RatingMessage.Builder(other);
    }
  }

  /**
   * Creates a new RatingMessage RecordBuilder by copying an existing RatingMessage instance.
   * @param other The existing instance to copy.
   * @return A new RatingMessage RecordBuilder
   */
  public static RatingMessage.Builder newBuilder(RatingMessage other) {
    if (other == null) {
      return new RatingMessage.Builder();
    } else {
      return new RatingMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for RatingMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RatingMessage>
    implements org.apache.avro.data.RecordBuilder<RatingMessage> {

    private java.lang.Long RATING_ID;
    private java.lang.Long PREDICTION_ID;
    private java.lang.CharSequence RATING;
    private java.lang.CharSequence PRED_SOPEN;
    private java.lang.Long CREATED_AT;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(RatingMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.RATING_ID)) {
        this.RATING_ID = data().deepCopy(fields()[0].schema(), other.RATING_ID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.PREDICTION_ID)) {
        this.PREDICTION_ID = data().deepCopy(fields()[1].schema(), other.PREDICTION_ID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.PRED_SOPEN)) {
        this.PRED_SOPEN = data().deepCopy(fields()[2].schema(), other.PRED_SOPEN);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.RATING)) {
        this.RATING = data().deepCopy(fields()[3].schema(), other.RATING);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.CREATED_AT)) {
        this.CREATED_AT = data().deepCopy(fields()[4].schema(), other.CREATED_AT);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing RatingMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(RatingMessage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.RATING_ID)) {
        this.RATING_ID = data().deepCopy(fields()[0].schema(), other.RATING_ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.PREDICTION_ID)) {
        this.PREDICTION_ID = data().deepCopy(fields()[1].schema(), other.PREDICTION_ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.PRED_SOPEN)) {
        this.RATING = data().deepCopy(fields()[2].schema(), other.PRED_SOPEN);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.RATING)) {
        this.RATING = data().deepCopy(fields()[3].schema(), other.RATING);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.CREATED_AT)) {
        this.CREATED_AT = data().deepCopy(fields()[4].schema(), other.CREATED_AT);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'RATING_ID' field.
      * @return The value.
      */
    public java.lang.Long getRATINGID() {
      return RATING_ID;
    }


    /**
      * Sets the value of the 'RATING_ID' field.
      * @param value The value of 'RATING_ID'.
      * @return This builder.
      */
    public RatingMessage.Builder setRATINGID(java.lang.Long value) {
      validate(fields()[0], value);
      this.RATING_ID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'RATING_ID' field has been set.
      * @return True if the 'RATING_ID' field has been set, false otherwise.
      */
    public boolean hasRATINGID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'RATING_ID' field.
      * @return This builder.
      */
    public RatingMessage.Builder clearRATINGID() {
      RATING_ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'PREDICTION_ID' field.
      * @return The value.
      */
    public java.lang.Long getPREDICTIONID() {
      return PREDICTION_ID;
    }


    /**
      * Sets the value of the 'PREDICTION_ID' field.
      * @param value The value of 'PREDICTION_ID'.
      * @return This builder.
      */
    public RatingMessage.Builder setPREDICTIONID(java.lang.Long value) {
      validate(fields()[1], value);
      this.PREDICTION_ID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'PREDICTION_ID' field has been set.
      * @return True if the 'PREDICTION_ID' field has been set, false otherwise.
      */
    public boolean hasPREDICTIONID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'PREDICTION_ID' field.
      * @return This builder.
      */
    public RatingMessage.Builder clearPREDICTIONID() {
      PREDICTION_ID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'PRED_SOPEN' field.
      * @return The value.
      */
    public java.lang.CharSequence getPREDSOPEN() {
      return PRED_SOPEN;
    }


    /**
      * Sets the value of the 'PRED_SOPEN' field.
      * @param value The value of 'PRED_SOPEN'.
      * @return This builder.
      */
    public RatingMessage.Builder setPREDSOPEN(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.PRED_SOPEN = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'PRED_SOPEN' field has been set.
      * @return True if the 'PRED_SOPEN' field has been set, false otherwise.
      */
    public boolean hasPREDSOPEN() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'PRED_SOPEN' field.
      * @return This builder.
      */
    public RatingMessage.Builder clearPREDSOPEN() {
      PRED_SOPEN = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'RATING' field.
      * @return The value.
      */
    public java.lang.CharSequence getRATING() {
      return RATING;
    }


    /**
      * Sets the value of the 'RATING' field.
      * @param value The value of 'RATING'.
      * @return This builder.
      */
    public RatingMessage.Builder setRATING(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.RATING = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'RATING' field has been set.
      * @return True if the 'RATING' field has been set, false otherwise.
      */
    public boolean hasRATING() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'RATING' field.
      * @return This builder.
      */
    public RatingMessage.Builder clearRATING() {
      RATING = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'CREATED_AT' field.
      * @return The value.
      */
    public java.lang.Long getCREATEDAT() {
      return CREATED_AT;
    }


    /**
      * Sets the value of the 'CREATED_AT' field.
      * @param value The value of 'CREATED_AT'.
      * @return This builder.
      */
    public RatingMessage.Builder setCREATEDAT(java.lang.Long value) {
      validate(fields()[4], value);
      this.CREATED_AT = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'CREATED_AT' field has been set.
      * @return True if the 'CREATED_AT' field has been set, false otherwise.
      */
    public boolean hasCREATEDAT() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'CREATED_AT' field.
      * @return This builder.
      */
    public RatingMessage.Builder clearCREATEDAT() {
      CREATED_AT = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RatingMessage build() {
      try {
        RatingMessage record = new RatingMessage();
        record.RATING_ID = fieldSetFlags()[0] ? this.RATING_ID : (java.lang.Long) defaultValue(fields()[0]);
        record.PREDICTION_ID = fieldSetFlags()[1] ? this.PREDICTION_ID : (java.lang.Long) defaultValue(fields()[1]);
        record.RATING = fieldSetFlags()[2] ? this.RATING : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.PRED_SOPEN = fieldSetFlags()[3] ? this.PRED_SOPEN : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.CREATED_AT = fieldSetFlags()[4] ? this.CREATED_AT : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RatingMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<RatingMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RatingMessage>
    READER$ = (org.apache.avro.io.DatumReader<RatingMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.RATING_ID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.RATING_ID);
    }

    if (this.PREDICTION_ID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.PREDICTION_ID);
    }

    if (this.PRED_SOPEN == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.PRED_SOPEN);
    }

    if (this.RATING == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.RATING);
    }

    if (this.CREATED_AT == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.CREATED_AT);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.RATING_ID = null;
      } else {
        this.RATING_ID = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.PREDICTION_ID = null;
      } else {
        this.PREDICTION_ID = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.RATING = null;
      } else {
        this.RATING = in.readString(this.RATING instanceof Utf8 ? (Utf8)this.RATING : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.PRED_SOPEN = null;
      } else {
        this.PRED_SOPEN = in.readString(this.PRED_SOPEN instanceof Utf8 ? (Utf8)this.PRED_SOPEN : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.CREATED_AT = null;
      } else {
        this.CREATED_AT = in.readLong();
      }

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.RATING_ID = null;
          } else {
            this.RATING_ID = in.readLong();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.PREDICTION_ID = null;
          } else {
            this.PREDICTION_ID = in.readLong();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.PRED_SOPEN = null;
          } else {
            this.PRED_SOPEN = in.readString(this.PRED_SOPEN instanceof Utf8 ? (Utf8)this.PRED_SOPEN : null);
          }
          break;

          case 3:
            if (in.readIndex() != 1) {
              in.readNull();
              this.RATING = null;
            } else {
              this.RATING = in.readString(this.RATING instanceof Utf8 ? (Utf8)this.RATING : null);
            }
            break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.CREATED_AT = null;
          } else {
            this.CREATED_AT = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









