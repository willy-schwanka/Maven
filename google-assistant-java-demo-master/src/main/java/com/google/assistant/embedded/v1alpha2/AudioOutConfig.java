// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha2/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha2;

/**
 * <pre>
 * Specifies the desired format for the server to use when it returns
 * `audio_out` messages.
 * </pre>
 *
 * Protobuf type {@code google.assistant.embedded.v1alpha2.AudioOutConfig}
 */
public  final class AudioOutConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.assistant.embedded.v1alpha2.AudioOutConfig)
    AudioOutConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudioOutConfig.newBuilder() to construct.
  private AudioOutConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudioOutConfig() {
    encoding_ = 0;
    sampleRateHertz_ = 0;
    volumePercentage_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AudioOutConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            encoding_ = rawValue;
            break;
          }
          case 16: {

            sampleRateHertz_ = input.readInt32();
            break;
          }
          case 24: {

            volumePercentage_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.assistant.embedded.v1alpha2.AssistantProto.internal_static_google_assistant_embedded_v1alpha2_AudioOutConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.assistant.embedded.v1alpha2.AssistantProto.internal_static_google_assistant_embedded_v1alpha2_AudioOutConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.assistant.embedded.v1alpha2.AudioOutConfig.class, com.google.assistant.embedded.v1alpha2.AudioOutConfig.Builder.class);
  }

  /**
   * <pre>
   * Audio encoding of the data returned in the audio message. All encodings are
   * raw audio bytes with no header, except as indicated below.
   * </pre>
   *
   * Protobuf enum {@code google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding}
   */
  public enum Encoding
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
     * </pre>
     *
     * <code>ENCODING_UNSPECIFIED = 0;</code>
     */
    ENCODING_UNSPECIFIED(0),
    /**
     * <pre>
     * Uncompressed 16-bit signed little-endian samples (Linear PCM).
     * </pre>
     *
     * <code>LINEAR16 = 1;</code>
     */
    LINEAR16(1),
    /**
     * <pre>
     * MP3 audio encoding. The sample rate is encoded in the payload.
     * </pre>
     *
     * <code>MP3 = 2;</code>
     */
    MP3(2),
    /**
     * <pre>
     * Opus-encoded audio wrapped in an ogg container. The result will be a
     * file which can be played natively on Android and in some browsers (such
     * as Chrome). The quality of the encoding is considerably higher than MP3
     * while using the same bitrate. The sample rate is encoded in the payload.
     * </pre>
     *
     * <code>OPUS_IN_OGG = 3;</code>
     */
    OPUS_IN_OGG(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
     * </pre>
     *
     * <code>ENCODING_UNSPECIFIED = 0;</code>
     */
    public static final int ENCODING_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Uncompressed 16-bit signed little-endian samples (Linear PCM).
     * </pre>
     *
     * <code>LINEAR16 = 1;</code>
     */
    public static final int LINEAR16_VALUE = 1;
    /**
     * <pre>
     * MP3 audio encoding. The sample rate is encoded in the payload.
     * </pre>
     *
     * <code>MP3 = 2;</code>
     */
    public static final int MP3_VALUE = 2;
    /**
     * <pre>
     * Opus-encoded audio wrapped in an ogg container. The result will be a
     * file which can be played natively on Android and in some browsers (such
     * as Chrome). The quality of the encoding is considerably higher than MP3
     * while using the same bitrate. The sample rate is encoded in the payload.
     * </pre>
     *
     * <code>OPUS_IN_OGG = 3;</code>
     */
    public static final int OPUS_IN_OGG_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Encoding valueOf(int value) {
      return forNumber(value);
    }

    public static Encoding forNumber(int value) {
      switch (value) {
        case 0: return ENCODING_UNSPECIFIED;
        case 1: return LINEAR16;
        case 2: return MP3;
        case 3: return OPUS_IN_OGG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Encoding>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Encoding> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Encoding>() {
            public Encoding findValueByNumber(int number) {
              return Encoding.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.assistant.embedded.v1alpha2.AudioOutConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Encoding[] VALUES = values();

    public static Encoding valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Encoding(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding)
  }

  public static final int ENCODING_FIELD_NUMBER = 1;
  private int encoding_;
  /**
   * <pre>
   * *Required* The encoding of audio data to be returned in all `audio_out`
   * messages.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
   */
  public int getEncodingValue() {
    return encoding_;
  }
  /**
   * <pre>
   * *Required* The encoding of audio data to be returned in all `audio_out`
   * messages.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
   */
  public com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding getEncoding() {
    com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding result = com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.valueOf(encoding_);
    return result == null ? com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.UNRECOGNIZED : result;
  }

  public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
  private int sampleRateHertz_;
  /**
   * <pre>
   * *Required* The sample rate in Hertz of the audio data returned in
   * `audio_out` messages. Valid values are: 16000-24000.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  public int getSampleRateHertz() {
    return sampleRateHertz_;
  }

  public static final int VOLUME_PERCENTAGE_FIELD_NUMBER = 3;
  private int volumePercentage_;
  /**
   * <pre>
   * *Required* Current volume setting of the device's audio output.
   * Valid values are 1 to 100 (corresponding to 1% to 100%).
   * </pre>
   *
   * <code>int32 volume_percentage = 3;</code>
   */
  public int getVolumePercentage() {
    return volumePercentage_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (encoding_ != com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.ENCODING_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, encoding_);
    }
    if (sampleRateHertz_ != 0) {
      output.writeInt32(2, sampleRateHertz_);
    }
    if (volumePercentage_ != 0) {
      output.writeInt32(3, volumePercentage_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encoding_ != com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.ENCODING_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, encoding_);
    }
    if (sampleRateHertz_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sampleRateHertz_);
    }
    if (volumePercentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, volumePercentage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.assistant.embedded.v1alpha2.AudioOutConfig)) {
      return super.equals(obj);
    }
    com.google.assistant.embedded.v1alpha2.AudioOutConfig other = (com.google.assistant.embedded.v1alpha2.AudioOutConfig) obj;

    boolean result = true;
    result = result && encoding_ == other.encoding_;
    result = result && (getSampleRateHertz()
        == other.getSampleRateHertz());
    result = result && (getVolumePercentage()
        == other.getVolumePercentage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + encoding_;
    hash = (37 * hash) + SAMPLE_RATE_HERTZ_FIELD_NUMBER;
    hash = (53 * hash) + getSampleRateHertz();
    hash = (37 * hash) + VOLUME_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getVolumePercentage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.assistant.embedded.v1alpha2.AudioOutConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Specifies the desired format for the server to use when it returns
   * `audio_out` messages.
   * </pre>
   *
   * Protobuf type {@code google.assistant.embedded.v1alpha2.AudioOutConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.assistant.embedded.v1alpha2.AudioOutConfig)
      com.google.assistant.embedded.v1alpha2.AudioOutConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.assistant.embedded.v1alpha2.AssistantProto.internal_static_google_assistant_embedded_v1alpha2_AudioOutConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.assistant.embedded.v1alpha2.AssistantProto.internal_static_google_assistant_embedded_v1alpha2_AudioOutConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.assistant.embedded.v1alpha2.AudioOutConfig.class, com.google.assistant.embedded.v1alpha2.AudioOutConfig.Builder.class);
    }

    // Construct using com.google.assistant.embedded.v1alpha2.AudioOutConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      encoding_ = 0;

      sampleRateHertz_ = 0;

      volumePercentage_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.assistant.embedded.v1alpha2.AssistantProto.internal_static_google_assistant_embedded_v1alpha2_AudioOutConfig_descriptor;
    }

    public com.google.assistant.embedded.v1alpha2.AudioOutConfig getDefaultInstanceForType() {
      return com.google.assistant.embedded.v1alpha2.AudioOutConfig.getDefaultInstance();
    }

    public com.google.assistant.embedded.v1alpha2.AudioOutConfig build() {
      com.google.assistant.embedded.v1alpha2.AudioOutConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.assistant.embedded.v1alpha2.AudioOutConfig buildPartial() {
      com.google.assistant.embedded.v1alpha2.AudioOutConfig result = new com.google.assistant.embedded.v1alpha2.AudioOutConfig(this);
      result.encoding_ = encoding_;
      result.sampleRateHertz_ = sampleRateHertz_;
      result.volumePercentage_ = volumePercentage_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.assistant.embedded.v1alpha2.AudioOutConfig) {
        return mergeFrom((com.google.assistant.embedded.v1alpha2.AudioOutConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.assistant.embedded.v1alpha2.AudioOutConfig other) {
      if (other == com.google.assistant.embedded.v1alpha2.AudioOutConfig.getDefaultInstance()) return this;
      if (other.encoding_ != 0) {
        setEncodingValue(other.getEncodingValue());
      }
      if (other.getSampleRateHertz() != 0) {
        setSampleRateHertz(other.getSampleRateHertz());
      }
      if (other.getVolumePercentage() != 0) {
        setVolumePercentage(other.getVolumePercentage());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.assistant.embedded.v1alpha2.AudioOutConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.assistant.embedded.v1alpha2.AudioOutConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int encoding_ = 0;
    /**
     * <pre>
     * *Required* The encoding of audio data to be returned in all `audio_out`
     * messages.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
     */
    public int getEncodingValue() {
      return encoding_;
    }
    /**
     * <pre>
     * *Required* The encoding of audio data to be returned in all `audio_out`
     * messages.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
     */
    public Builder setEncodingValue(int value) {
      encoding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* The encoding of audio data to be returned in all `audio_out`
     * messages.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
     */
    public com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding getEncoding() {
      com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding result = com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.valueOf(encoding_);
      return result == null ? com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * *Required* The encoding of audio data to be returned in all `audio_out`
     * messages.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
     */
    public Builder setEncoding(com.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* The encoding of audio data to be returned in all `audio_out`
     * messages.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha2.AudioOutConfig.Encoding encoding = 1;</code>
     */
    public Builder clearEncoding() {
      
      encoding_ = 0;
      onChanged();
      return this;
    }

    private int sampleRateHertz_ ;
    /**
     * <pre>
     * *Required* The sample rate in Hertz of the audio data returned in
     * `audio_out` messages. Valid values are: 16000-24000.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public int getSampleRateHertz() {
      return sampleRateHertz_;
    }
    /**
     * <pre>
     * *Required* The sample rate in Hertz of the audio data returned in
     * `audio_out` messages. Valid values are: 16000-24000.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public Builder setSampleRateHertz(int value) {
      
      sampleRateHertz_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* The sample rate in Hertz of the audio data returned in
     * `audio_out` messages. Valid values are: 16000-24000.
     * </pre>
     *
     * <code>int32 sample_rate_hertz = 2;</code>
     */
    public Builder clearSampleRateHertz() {
      
      sampleRateHertz_ = 0;
      onChanged();
      return this;
    }

    private int volumePercentage_ ;
    /**
     * <pre>
     * *Required* Current volume setting of the device's audio output.
     * Valid values are 1 to 100 (corresponding to 1% to 100%).
     * </pre>
     *
     * <code>int32 volume_percentage = 3;</code>
     */
    public int getVolumePercentage() {
      return volumePercentage_;
    }
    /**
     * <pre>
     * *Required* Current volume setting of the device's audio output.
     * Valid values are 1 to 100 (corresponding to 1% to 100%).
     * </pre>
     *
     * <code>int32 volume_percentage = 3;</code>
     */
    public Builder setVolumePercentage(int value) {
      
      volumePercentage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* Current volume setting of the device's audio output.
     * Valid values are 1 to 100 (corresponding to 1% to 100%).
     * </pre>
     *
     * <code>int32 volume_percentage = 3;</code>
     */
    public Builder clearVolumePercentage() {
      
      volumePercentage_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.assistant.embedded.v1alpha2.AudioOutConfig)
  }

  // @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha2.AudioOutConfig)
  private static final com.google.assistant.embedded.v1alpha2.AudioOutConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.assistant.embedded.v1alpha2.AudioOutConfig();
  }

  public static com.google.assistant.embedded.v1alpha2.AudioOutConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudioOutConfig>
      PARSER = new com.google.protobuf.AbstractParser<AudioOutConfig>() {
    public AudioOutConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AudioOutConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AudioOutConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudioOutConfig> getParserForType() {
    return PARSER;
  }

  public com.google.assistant.embedded.v1alpha2.AudioOutConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

