// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

// Protobuf Java Version: 3.25.1
package org.jetstreamDrop.examples.protobuf;

public final class PersonProtos {
  private PersonProtos() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface PersonOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:protobuf.Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     *
     * @return The id.
     */
    int getId();

    /**
     * <code>string name = 2;</code>
     *
     * @return The name.
     */
    java.lang.String getName();

    /**
     * <code>string name = 2;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @return A list containing the numbers.
     */
    java.util.List<java.lang.String> getNumbersList();

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @return The count of numbers.
     */
    int getNumbersCount();

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The numbers at the given index.
     */
    java.lang.String getNumbers(int index);

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the numbers at the given index.
     */
    com.google.protobuf.ByteString getNumbersBytes(int index);

    /**
     * <code>optional string email = 4;</code>
     *
     * @return Whether the email field is set.
     */
    boolean hasEmail();

    /**
     * <code>optional string email = 4;</code>
     *
     * @return The email.
     */
    java.lang.String getEmail();

    /**
     * <code>optional string email = 4;</code>
     *
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString getEmailBytes();
  }

  /** Protobuf type {@code protobuf.Person} */
  public static final class Person extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:protobuf.Person)
      PersonOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Person() {
      name_ = "";
      numbers_ = com.google.protobuf.LazyStringArrayList.emptyList();
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
      return new Person();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return org.jetstreamDrop
          .examples
          .protobuf
          .PersonProtos
          .internal_static_protobuf_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.jetstreamDrop.examples.protobuf.PersonProtos
          .internal_static_protobuf_Person_fieldAccessorTable.ensureFieldAccessorsInitialized(
          org.jetstreamDrop.examples.protobuf.PersonProtos.Person.class,
          org.jetstreamDrop.examples.protobuf.PersonProtos.Person.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;

    /**
     * <code>int32 id = 1;</code>
     *
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";

    /**
     * <code>string name = 2;</code>
     *
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }

    /**
     * <code>string name = 2;</code>
     *
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NUMBERS_FIELD_NUMBER = 3;

    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList numbers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @return A list containing the numbers.
     */
    public com.google.protobuf.ProtocolStringList getNumbersList() {
      return numbers_;
    }

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @return The count of numbers.
     */
    public int getNumbersCount() {
      return numbers_.size();
    }

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The numbers at the given index.
     */
    public java.lang.String getNumbers(int index) {
      return numbers_.get(index);
    }

    /**
     * <code>repeated string numbers = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the numbers at the given index.
     */
    public com.google.protobuf.ByteString getNumbersBytes(int index) {
      return numbers_.getByteString(index);
    }

    public static final int EMAIL_FIELD_NUMBER = 4;

    @SuppressWarnings("serial")
    private volatile java.lang.Object email_ = "";

    /**
     * <code>optional string email = 4;</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional string email = 4;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }

    /**
     * <code>optional string email = 4;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        email_ = b;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      for (int i = 0; i < numbers_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, numbers_.getRaw(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < numbers_.size(); i++) {
          dataSize += computeStringSizeNoTag(numbers_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getNumbersList().size();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
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
      if (!(obj instanceof org.jetstreamDrop.examples.protobuf.PersonProtos.Person)) {
        return super.equals(obj);
      }
      org.jetstreamDrop.examples.protobuf.PersonProtos.Person other =
          (org.jetstreamDrop.examples.protobuf.PersonProtos.Person) obj;

      if (getId() != other.getId()) return false;
      if (!getName().equals(other.getName())) return false;
      if (!getNumbersList().equals(other.getNumbersList())) return false;
      if (hasEmail() != other.hasEmail()) return false;
      if (hasEmail()) {
        if (!getEmail().equals(other.getEmail())) return false;
      }
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      if (getNumbersCount() > 0) {
        hash = (37 * hash) + NUMBERS_FIELD_NUMBER;
        hash = (53 * hash) + getNumbersList().hashCode();
      }
      if (hasEmail()) {
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        org.jetstreamDrop.examples.protobuf.PersonProtos.Person prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /** Protobuf type {@code protobuf.Person} */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:protobuf.Person)
        org.jetstreamDrop.examples.protobuf.PersonProtos.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return org.jetstreamDrop
            .examples
            .protobuf
            .PersonProtos
            .internal_static_protobuf_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.jetstreamDrop.examples.protobuf.PersonProtos
            .internal_static_protobuf_Person_fieldAccessorTable.ensureFieldAccessorsInitialized(
            org.jetstreamDrop.examples.protobuf.PersonProtos.Person.class,
            org.jetstreamDrop.examples.protobuf.PersonProtos.Person.Builder.class);
      }

      // Construct using org.jetstreamDrop.examples.protobuf.PersonProtos.Person.newBuilder()
      private Builder() {}

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        name_ = "";
        numbers_ = com.google.protobuf.LazyStringArrayList.emptyList();
        email_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return org.jetstreamDrop
            .examples
            .protobuf
            .PersonProtos
            .internal_static_protobuf_Person_descriptor;
      }

      @java.lang.Override
      public org.jetstreamDrop.examples.protobuf.PersonProtos.Person getDefaultInstanceForType() {
        return org.jetstreamDrop.examples.protobuf.PersonProtos.Person.getDefaultInstance();
      }

      @java.lang.Override
      public org.jetstreamDrop.examples.protobuf.PersonProtos.Person build() {
        org.jetstreamDrop.examples.protobuf.PersonProtos.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.jetstreamDrop.examples.protobuf.PersonProtos.Person buildPartial() {
        org.jetstreamDrop.examples.protobuf.PersonProtos.Person result =
            new org.jetstreamDrop.examples.protobuf.PersonProtos.Person(this);
        if (bitField0_ != 0) {
          buildPartial0(result);
        }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.jetstreamDrop.examples.protobuf.PersonProtos.Person result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          numbers_.makeImmutable();
          result.numbers_ = numbers_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.email_ = email_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.jetstreamDrop.examples.protobuf.PersonProtos.Person) {
          return mergeFrom((org.jetstreamDrop.examples.protobuf.PersonProtos.Person) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.jetstreamDrop.examples.protobuf.PersonProtos.Person other) {
        if (other == org.jetstreamDrop.examples.protobuf.PersonProtos.Person.getDefaultInstance())
          return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.numbers_.isEmpty()) {
          if (numbers_.isEmpty()) {
            numbers_ = other.numbers_;
            bitField0_ |= 0x00000004;
          } else {
            ensureNumbersIsMutable();
            numbers_.addAll(other.numbers_);
          }
          onChanged();
        }
        if (other.hasEmail()) {
          email_ = other.email_;
          bitField0_ |= 0x00000008;
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
              case 8:
                {
                  id_ = input.readInt32();
                  bitField0_ |= 0x00000001;
                  break;
                } // case 8
              case 18:
                {
                  name_ = input.readStringRequireUtf8();
                  bitField0_ |= 0x00000002;
                  break;
                } // case 18
              case 26:
                {
                  java.lang.String s = input.readStringRequireUtf8();
                  ensureNumbersIsMutable();
                  numbers_.add(s);
                  break;
                } // case 26
              case 34:
                {
                  email_ = input.readStringRequireUtf8();
                  bitField0_ |= 0x00000008;
                  break;
                } // case 34
              default:
                {
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

      private int id_;

      /**
       * <code>int32 id = 1;</code>
       *
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }

      /**
       * <code>int32 id = 1;</code>
       *
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      /**
       * <code>int32 id = 1;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";

      /**
       * <code>string name = 2;</code>
       *
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>string name = 2;</code>
       *
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>string name = 2;</code>
       *
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      /**
       * <code>string name = 2;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      /**
       * <code>string name = 2;</code>
       *
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList numbers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();

      private void ensureNumbersIsMutable() {
        if (!numbers_.isModifiable()) {
          numbers_ = new com.google.protobuf.LazyStringArrayList(numbers_);
        }
        bitField0_ |= 0x00000004;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @return A list containing the numbers.
       */
      public com.google.protobuf.ProtocolStringList getNumbersList() {
        numbers_.makeImmutable();
        return numbers_;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @return The count of numbers.
       */
      public int getNumbersCount() {
        return numbers_.size();
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param index The index of the element to return.
       * @return The numbers at the given index.
       */
      public java.lang.String getNumbers(int index) {
        return numbers_.get(index);
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param index The index of the value to return.
       * @return The bytes of the numbers at the given index.
       */
      public com.google.protobuf.ByteString getNumbersBytes(int index) {
        return numbers_.getByteString(index);
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param index The index to set the value at.
       * @param value The numbers to set.
       * @return This builder for chaining.
       */
      public Builder setNumbers(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNumbersIsMutable();
        numbers_.set(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param value The numbers to add.
       * @return This builder for chaining.
       */
      public Builder addNumbers(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNumbersIsMutable();
        numbers_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param values The numbers to add.
       * @return This builder for chaining.
       */
      public Builder addAllNumbers(java.lang.Iterable<java.lang.String> values) {
        ensureNumbersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, numbers_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearNumbers() {
        numbers_ = com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        ;
        onChanged();
        return this;
      }

      /**
       * <code>repeated string numbers = 3;</code>
       *
       * @param value The bytes of the numbers to add.
       * @return This builder for chaining.
       */
      public Builder addNumbersBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);
        ensureNumbersIsMutable();
        numbers_.add(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";

      /**
       * <code>optional string email = 4;</code>
       *
       * @return Whether the email field is set.
       */
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000008) != 0);
      }

      /**
       * <code>optional string email = 4;</code>
       *
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string email = 4;</code>
       *
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string email = 4;</code>
       *
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        email_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      /**
       * <code>optional string email = 4;</code>
       *
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        email_ = getDefaultInstance().getEmail();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      /**
       * <code>optional string email = 4;</code>
       *
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        checkByteStringIsUtf8(value);
        email_ = value;
        bitField0_ |= 0x00000008;
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

      // @@protoc_insertion_point(builder_scope:protobuf.Person)
    }

    // @@protoc_insertion_point(class_scope:protobuf.Person)
    private static final org.jetstreamDrop.examples.protobuf.PersonProtos.Person DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.jetstreamDrop.examples.protobuf.PersonProtos.Person();
    }

    public static org.jetstreamDrop.examples.protobuf.PersonProtos.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person> PARSER =
        new com.google.protobuf.AbstractParser<Person>() {
          @java.lang.Override
          public Person parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
              builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
              throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
              throw e.asInvalidProtocolBufferException()
                  .setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
              throw new com.google.protobuf.InvalidProtocolBufferException(e)
                  .setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
          }
        };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.jetstreamDrop.examples.protobuf.PersonProtos.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_protobuf_Person_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\022\010protobuf\"Q\n\006Person\022\n\n\002id"
          + "\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\017\n\007numbers\030\003 \003(\t\022\022\n"
          + "\005email\030\004 \001(\tH\000\210\001\001B\010\n\006_emailB3\n#org.jetst"
          + "reamDrop.examples.protobufB\014PersonProtos"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_protobuf_Person_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_Person_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_protobuf_Person_descriptor,
            new java.lang.String[] {
              "Id", "Name", "Numbers", "Email",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
