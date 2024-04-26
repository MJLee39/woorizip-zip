// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chatRoomProto.proto

package teamwaf.app.grpc.chat;

/**
 * Protobuf type {@code token.ChatRoomIdRequest}
 */
public final class ChatRoomIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:token.ChatRoomIdRequest)
    ChatRoomIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatRoomIdRequest.newBuilder() to construct.
  private ChatRoomIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatRoomIdRequest() {
    chatRoomId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatRoomIdRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return teamwaf.app.grpc.chat.ChatRoomProto.internal_static_token_ChatRoomIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return teamwaf.app.grpc.chat.ChatRoomProto.internal_static_token_ChatRoomIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            teamwaf.app.grpc.chat.ChatRoomIdRequest.class, teamwaf.app.grpc.chat.ChatRoomIdRequest.Builder.class);
  }

  public static final int CHATROOMID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chatRoomId_ = "";
  /**
   * <code>string chatRoomId = 1;</code>
   * @return The chatRoomId.
   */
  @java.lang.Override
  public java.lang.String getChatRoomId() {
    java.lang.Object ref = chatRoomId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chatRoomId_ = s;
      return s;
    }
  }
  /**
   * <code>string chatRoomId = 1;</code>
   * @return The bytes for chatRoomId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChatRoomIdBytes() {
    java.lang.Object ref = chatRoomId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chatRoomId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chatRoomId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, chatRoomId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chatRoomId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, chatRoomId_);
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
    if (!(obj instanceof teamwaf.app.grpc.chat.ChatRoomIdRequest)) {
      return super.equals(obj);
    }
    teamwaf.app.grpc.chat.ChatRoomIdRequest other = (teamwaf.app.grpc.chat.ChatRoomIdRequest) obj;

    if (!getChatRoomId()
        .equals(other.getChatRoomId())) return false;
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
    hash = (37 * hash) + CHATROOMID_FIELD_NUMBER;
    hash = (53 * hash) + getChatRoomId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static teamwaf.app.grpc.chat.ChatRoomIdRequest parseFrom(
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
  public static Builder newBuilder(teamwaf.app.grpc.chat.ChatRoomIdRequest prototype) {
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
   * Protobuf type {@code token.ChatRoomIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:token.ChatRoomIdRequest)
      teamwaf.app.grpc.chat.ChatRoomIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return teamwaf.app.grpc.chat.ChatRoomProto.internal_static_token_ChatRoomIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return teamwaf.app.grpc.chat.ChatRoomProto.internal_static_token_ChatRoomIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              teamwaf.app.grpc.chat.ChatRoomIdRequest.class, teamwaf.app.grpc.chat.ChatRoomIdRequest.Builder.class);
    }

    // Construct using teamwaf.app.grpc.chat.ChatRoomIdRequest.newBuilder()
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
      chatRoomId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return teamwaf.app.grpc.chat.ChatRoomProto.internal_static_token_ChatRoomIdRequest_descriptor;
    }

    @java.lang.Override
    public teamwaf.app.grpc.chat.ChatRoomIdRequest getDefaultInstanceForType() {
      return teamwaf.app.grpc.chat.ChatRoomIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public teamwaf.app.grpc.chat.ChatRoomIdRequest build() {
      teamwaf.app.grpc.chat.ChatRoomIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public teamwaf.app.grpc.chat.ChatRoomIdRequest buildPartial() {
      teamwaf.app.grpc.chat.ChatRoomIdRequest result = new teamwaf.app.grpc.chat.ChatRoomIdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(teamwaf.app.grpc.chat.ChatRoomIdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chatRoomId_ = chatRoomId_;
      }
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
      if (other instanceof teamwaf.app.grpc.chat.ChatRoomIdRequest) {
        return mergeFrom((teamwaf.app.grpc.chat.ChatRoomIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(teamwaf.app.grpc.chat.ChatRoomIdRequest other) {
      if (other == teamwaf.app.grpc.chat.ChatRoomIdRequest.getDefaultInstance()) return this;
      if (!other.getChatRoomId().isEmpty()) {
        chatRoomId_ = other.chatRoomId_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              chatRoomId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object chatRoomId_ = "";
    /**
     * <code>string chatRoomId = 1;</code>
     * @return The chatRoomId.
     */
    public java.lang.String getChatRoomId() {
      java.lang.Object ref = chatRoomId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chatRoomId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chatRoomId = 1;</code>
     * @return The bytes for chatRoomId.
     */
    public com.google.protobuf.ByteString
        getChatRoomIdBytes() {
      java.lang.Object ref = chatRoomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chatRoomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chatRoomId = 1;</code>
     * @param value The chatRoomId to set.
     * @return This builder for chaining.
     */
    public Builder setChatRoomId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chatRoomId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string chatRoomId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChatRoomId() {
      chatRoomId_ = getDefaultInstance().getChatRoomId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string chatRoomId = 1;</code>
     * @param value The bytes for chatRoomId to set.
     * @return This builder for chaining.
     */
    public Builder setChatRoomIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chatRoomId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:token.ChatRoomIdRequest)
  }

  // @@protoc_insertion_point(class_scope:token.ChatRoomIdRequest)
  private static final teamwaf.app.grpc.chat.ChatRoomIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new teamwaf.app.grpc.chat.ChatRoomIdRequest();
  }

  public static teamwaf.app.grpc.chat.ChatRoomIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatRoomIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChatRoomIdRequest>() {
    @java.lang.Override
    public ChatRoomIdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChatRoomIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatRoomIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public teamwaf.app.grpc.chat.ChatRoomIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

