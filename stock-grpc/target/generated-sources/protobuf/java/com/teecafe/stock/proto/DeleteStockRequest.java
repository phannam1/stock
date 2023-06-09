// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock/stock.proto

package com.teecafe.stock.proto;

/**
 * Protobuf type {@code stock.DeleteStockRequest}
 */
public final class DeleteStockRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stock.DeleteStockRequest)
    DeleteStockRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteStockRequest.newBuilder() to construct.
  private DeleteStockRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteStockRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteStockRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteStockRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            stockId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.teecafe.stock.proto.StockOuterClass.internal_static_stock_DeleteStockRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.teecafe.stock.proto.StockOuterClass.internal_static_stock_DeleteStockRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.teecafe.stock.proto.DeleteStockRequest.class, com.teecafe.stock.proto.DeleteStockRequest.Builder.class);
  }

  public static final int STOCK_ID_FIELD_NUMBER = 1;
  private long stockId_;
  /**
   * <code>int64 stock_id = 1;</code>
   * @return The stockId.
   */
  @java.lang.Override
  public long getStockId() {
    return stockId_;
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
    if (stockId_ != 0L) {
      output.writeInt64(1, stockId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stockId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, stockId_);
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
    if (!(obj instanceof com.teecafe.stock.proto.DeleteStockRequest)) {
      return super.equals(obj);
    }
    com.teecafe.stock.proto.DeleteStockRequest other = (com.teecafe.stock.proto.DeleteStockRequest) obj;

    if (getStockId()
        != other.getStockId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STOCK_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStockId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.teecafe.stock.proto.DeleteStockRequest parseFrom(
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
  public static Builder newBuilder(com.teecafe.stock.proto.DeleteStockRequest prototype) {
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
   * Protobuf type {@code stock.DeleteStockRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stock.DeleteStockRequest)
      com.teecafe.stock.proto.DeleteStockRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.teecafe.stock.proto.StockOuterClass.internal_static_stock_DeleteStockRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.teecafe.stock.proto.StockOuterClass.internal_static_stock_DeleteStockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.teecafe.stock.proto.DeleteStockRequest.class, com.teecafe.stock.proto.DeleteStockRequest.Builder.class);
    }

    // Construct using com.teecafe.stock.proto.DeleteStockRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stockId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.teecafe.stock.proto.StockOuterClass.internal_static_stock_DeleteStockRequest_descriptor;
    }

    @java.lang.Override
    public com.teecafe.stock.proto.DeleteStockRequest getDefaultInstanceForType() {
      return com.teecafe.stock.proto.DeleteStockRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.teecafe.stock.proto.DeleteStockRequest build() {
      com.teecafe.stock.proto.DeleteStockRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.teecafe.stock.proto.DeleteStockRequest buildPartial() {
      com.teecafe.stock.proto.DeleteStockRequest result = new com.teecafe.stock.proto.DeleteStockRequest(this);
      result.stockId_ = stockId_;
      onBuilt();
      return result;
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
      if (other instanceof com.teecafe.stock.proto.DeleteStockRequest) {
        return mergeFrom((com.teecafe.stock.proto.DeleteStockRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.teecafe.stock.proto.DeleteStockRequest other) {
      if (other == com.teecafe.stock.proto.DeleteStockRequest.getDefaultInstance()) return this;
      if (other.getStockId() != 0L) {
        setStockId(other.getStockId());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.teecafe.stock.proto.DeleteStockRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.teecafe.stock.proto.DeleteStockRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long stockId_ ;
    /**
     * <code>int64 stock_id = 1;</code>
     * @return The stockId.
     */
    @java.lang.Override
    public long getStockId() {
      return stockId_;
    }
    /**
     * <code>int64 stock_id = 1;</code>
     * @param value The stockId to set.
     * @return This builder for chaining.
     */
    public Builder setStockId(long value) {
      
      stockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 stock_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStockId() {
      
      stockId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:stock.DeleteStockRequest)
  }

  // @@protoc_insertion_point(class_scope:stock.DeleteStockRequest)
  private static final com.teecafe.stock.proto.DeleteStockRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.teecafe.stock.proto.DeleteStockRequest();
  }

  public static com.teecafe.stock.proto.DeleteStockRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteStockRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteStockRequest>() {
    @java.lang.Override
    public DeleteStockRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteStockRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteStockRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteStockRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.teecafe.stock.proto.DeleteStockRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

