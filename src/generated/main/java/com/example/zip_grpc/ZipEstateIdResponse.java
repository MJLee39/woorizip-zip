// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zip.proto

package com.example.zip_grpc;

/**
 * Protobuf type {@code zip.ZipEstateIdResponse}
 */
public final class ZipEstateIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zip.ZipEstateIdResponse)
    ZipEstateIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ZipEstateIdResponse.newBuilder() to construct.
  private ZipEstateIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ZipEstateIdResponse() {
    zips_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ZipEstateIdResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.zip_grpc.ZipProto.internal_static_zip_ZipEstateIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.zip_grpc.ZipProto.internal_static_zip_ZipEstateIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.zip_grpc.ZipEstateIdResponse.class, com.example.zip_grpc.ZipEstateIdResponse.Builder.class);
  }

  public static final int ZIPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.example.zip_grpc.Zip> zips_;
  /**
   * <code>repeated .zip.Zip Zips = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.zip_grpc.Zip> getZipsList() {
    return zips_;
  }
  /**
   * <code>repeated .zip.Zip Zips = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.zip_grpc.ZipOrBuilder> 
      getZipsOrBuilderList() {
    return zips_;
  }
  /**
   * <code>repeated .zip.Zip Zips = 1;</code>
   */
  @java.lang.Override
  public int getZipsCount() {
    return zips_.size();
  }
  /**
   * <code>repeated .zip.Zip Zips = 1;</code>
   */
  @java.lang.Override
  public com.example.zip_grpc.Zip getZips(int index) {
    return zips_.get(index);
  }
  /**
   * <code>repeated .zip.Zip Zips = 1;</code>
   */
  @java.lang.Override
  public com.example.zip_grpc.ZipOrBuilder getZipsOrBuilder(
      int index) {
    return zips_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < zips_.size(); i++) {
      output.writeMessage(1, zips_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < zips_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, zips_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.zip_grpc.ZipEstateIdResponse)) {
      return super.equals(obj);
    }
    com.example.zip_grpc.ZipEstateIdResponse other = (com.example.zip_grpc.ZipEstateIdResponse) obj;

    if (!getZipsList()
        .equals(other.getZipsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getZipsCount() > 0) {
      hash = (37 * hash) + ZIPS_FIELD_NUMBER;
      hash = (53 * hash) + getZipsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.zip_grpc.ZipEstateIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.zip_grpc.ZipEstateIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.zip_grpc.ZipEstateIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.zip_grpc.ZipEstateIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code zip.ZipEstateIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zip.ZipEstateIdResponse)
      com.example.zip_grpc.ZipEstateIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.zip_grpc.ZipProto.internal_static_zip_ZipEstateIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.zip_grpc.ZipProto.internal_static_zip_ZipEstateIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.zip_grpc.ZipEstateIdResponse.class, com.example.zip_grpc.ZipEstateIdResponse.Builder.class);
    }

    // Construct using com.example.zip_grpc.ZipEstateIdResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (zipsBuilder_ == null) {
        zips_ = java.util.Collections.emptyList();
      } else {
        zips_ = null;
        zipsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.zip_grpc.ZipProto.internal_static_zip_ZipEstateIdResponse_descriptor;
    }

    @java.lang.Override
    public com.example.zip_grpc.ZipEstateIdResponse getDefaultInstanceForType() {
      return com.example.zip_grpc.ZipEstateIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.zip_grpc.ZipEstateIdResponse build() {
      com.example.zip_grpc.ZipEstateIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.zip_grpc.ZipEstateIdResponse buildPartial() {
      com.example.zip_grpc.ZipEstateIdResponse result = new com.example.zip_grpc.ZipEstateIdResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.example.zip_grpc.ZipEstateIdResponse result) {
      if (zipsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          zips_ = java.util.Collections.unmodifiableList(zips_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.zips_ = zips_;
      } else {
        result.zips_ = zipsBuilder_.build();
      }
    }

    private void buildPartial0(com.example.zip_grpc.ZipEstateIdResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.zip_grpc.ZipEstateIdResponse) {
        return mergeFrom((com.example.zip_grpc.ZipEstateIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.zip_grpc.ZipEstateIdResponse other) {
      if (other == com.example.zip_grpc.ZipEstateIdResponse.getDefaultInstance()) return this;
      if (zipsBuilder_ == null) {
        if (!other.zips_.isEmpty()) {
          if (zips_.isEmpty()) {
            zips_ = other.zips_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureZipsIsMutable();
            zips_.addAll(other.zips_);
          }
          onChanged();
        }
      } else {
        if (!other.zips_.isEmpty()) {
          if (zipsBuilder_.isEmpty()) {
            zipsBuilder_.dispose();
            zipsBuilder_ = null;
            zips_ = other.zips_;
            bitField0_ = (bitField0_ & ~0x00000001);
            zipsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getZipsFieldBuilder() : null;
          } else {
            zipsBuilder_.addAllMessages(other.zips_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.example.zip_grpc.Zip m =
                  input.readMessage(
                      com.example.zip_grpc.Zip.parser(),
                      extensionRegistry);
              if (zipsBuilder_ == null) {
                ensureZipsIsMutable();
                zips_.add(m);
              } else {
                zipsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.zip_grpc.Zip> zips_ =
      java.util.Collections.emptyList();
    private void ensureZipsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        zips_ = new java.util.ArrayList<com.example.zip_grpc.Zip>(zips_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.zip_grpc.Zip, com.example.zip_grpc.Zip.Builder, com.example.zip_grpc.ZipOrBuilder> zipsBuilder_;

    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public java.util.List<com.example.zip_grpc.Zip> getZipsList() {
      if (zipsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(zips_);
      } else {
        return zipsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public int getZipsCount() {
      if (zipsBuilder_ == null) {
        return zips_.size();
      } else {
        return zipsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public com.example.zip_grpc.Zip getZips(int index) {
      if (zipsBuilder_ == null) {
        return zips_.get(index);
      } else {
        return zipsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder setZips(
        int index, com.example.zip_grpc.Zip value) {
      if (zipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureZipsIsMutable();
        zips_.set(index, value);
        onChanged();
      } else {
        zipsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder setZips(
        int index, com.example.zip_grpc.Zip.Builder builderForValue) {
      if (zipsBuilder_ == null) {
        ensureZipsIsMutable();
        zips_.set(index, builderForValue.build());
        onChanged();
      } else {
        zipsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder addZips(com.example.zip_grpc.Zip value) {
      if (zipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureZipsIsMutable();
        zips_.add(value);
        onChanged();
      } else {
        zipsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder addZips(
        int index, com.example.zip_grpc.Zip value) {
      if (zipsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureZipsIsMutable();
        zips_.add(index, value);
        onChanged();
      } else {
        zipsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder addZips(
        com.example.zip_grpc.Zip.Builder builderForValue) {
      if (zipsBuilder_ == null) {
        ensureZipsIsMutable();
        zips_.add(builderForValue.build());
        onChanged();
      } else {
        zipsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder addZips(
        int index, com.example.zip_grpc.Zip.Builder builderForValue) {
      if (zipsBuilder_ == null) {
        ensureZipsIsMutable();
        zips_.add(index, builderForValue.build());
        onChanged();
      } else {
        zipsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder addAllZips(
        java.lang.Iterable<? extends com.example.zip_grpc.Zip> values) {
      if (zipsBuilder_ == null) {
        ensureZipsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, zips_);
        onChanged();
      } else {
        zipsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder clearZips() {
      if (zipsBuilder_ == null) {
        zips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        zipsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public Builder removeZips(int index) {
      if (zipsBuilder_ == null) {
        ensureZipsIsMutable();
        zips_.remove(index);
        onChanged();
      } else {
        zipsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public com.example.zip_grpc.Zip.Builder getZipsBuilder(
        int index) {
      return getZipsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public com.example.zip_grpc.ZipOrBuilder getZipsOrBuilder(
        int index) {
      if (zipsBuilder_ == null) {
        return zips_.get(index);  } else {
        return zipsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public java.util.List<? extends com.example.zip_grpc.ZipOrBuilder> 
         getZipsOrBuilderList() {
      if (zipsBuilder_ != null) {
        return zipsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(zips_);
      }
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public com.example.zip_grpc.Zip.Builder addZipsBuilder() {
      return getZipsFieldBuilder().addBuilder(
          com.example.zip_grpc.Zip.getDefaultInstance());
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public com.example.zip_grpc.Zip.Builder addZipsBuilder(
        int index) {
      return getZipsFieldBuilder().addBuilder(
          index, com.example.zip_grpc.Zip.getDefaultInstance());
    }
    /**
     * <code>repeated .zip.Zip Zips = 1;</code>
     */
    public java.util.List<com.example.zip_grpc.Zip.Builder> 
         getZipsBuilderList() {
      return getZipsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.zip_grpc.Zip, com.example.zip_grpc.Zip.Builder, com.example.zip_grpc.ZipOrBuilder> 
        getZipsFieldBuilder() {
      if (zipsBuilder_ == null) {
        zipsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.zip_grpc.Zip, com.example.zip_grpc.Zip.Builder, com.example.zip_grpc.ZipOrBuilder>(
                zips_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        zips_ = null;
      }
      return zipsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zip.ZipEstateIdResponse)
  }

  // @@protoc_insertion_point(class_scope:zip.ZipEstateIdResponse)
  private static final com.example.zip_grpc.ZipEstateIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.zip_grpc.ZipEstateIdResponse();
  }

  public static com.example.zip_grpc.ZipEstateIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ZipEstateIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<ZipEstateIdResponse>() {
    @java.lang.Override
    public ZipEstateIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ZipEstateIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ZipEstateIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.zip_grpc.ZipEstateIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

