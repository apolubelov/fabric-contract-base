// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package org.enterprisedlt.fabric.proto;

public final class Example {
  private Example() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_contract_TestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_contract_TestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rexample.proto\022\010contract\"4\n\013TestMessage" +
      "\022\023\n\013stringValue\030\001 \001(\t\022\020\n\010intValue\030\002 \001(\005B" +
      "\"\n\036org.enterprisedlt.fabric.protoP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_contract_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_contract_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_contract_TestMessage_descriptor,
        new java.lang.String[] { "StringValue", "IntValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
