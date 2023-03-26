// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock/stock.proto

package com.teecafe.stock.proto;

public final class StockOuterClass {
  private StockOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_BlankRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_BlankRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_GetAllStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_GetAllStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_GetAllStockResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_GetAllStockResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_Stock_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_Stock_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_GetAllUnitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_GetAllUnitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_GetAllUnitResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_GetAllUnitResponse_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_Unit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_Unit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_SaveStockRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_SaveStockRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_SaveStockResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_SaveStockResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stock_SaveStockResponse_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stock_SaveStockResponse_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021stock/stock.proto\022\005stock\032\033google/proto" +
      "buf/empty.proto\032\030stock/common/error.prot" +
      "o\"\016\n\014BlankRequest\"\267\001\n\023GetAllStockRespons" +
      "e\022\017\n\007success\030\001 \001(\010\022/\n\004data\030\002 \001(\0132\037.stock" +
      ".GetAllStockResponse.DataH\000\022-\n\005error\030\003 \001" +
      "(\0132\034.stock.common.StockGrpcErrorH\000\032#\n\004Da" +
      "ta\022\033\n\005stock\030\001 \003(\0132\014.stock.StockB\n\n\010respo" +
      "nse\"\255\001\n\005Stock\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022" +
      "\016\n\006number\030\003 \001(\002\022\014\n\004unit\030\004 \001(\t\022\r\n\005price\030\005" +
      " \001(\002\022\023\n\013create_date\030\006 \001(\t\022\020\n\010exp_date\030\007 " +
      "\001(\t\022\023\n\013description\030\010 \001(\t\022\r\n\005money\030\t \001(\002\022" +
      "\022\n\ncreated_by\030\n \001(\t\"\263\001\n\022GetAllUnitRespon" +
      "se\022\017\n\007success\030\001 \001(\010\022.\n\004data\030\002 \001(\0132\036.stoc" +
      "k.GetAllUnitResponse.DataH\000\022-\n\005error\030\003 \001" +
      "(\0132\034.stock.common.StockGrpcErrorH\000\032!\n\004Da" +
      "ta\022\031\n\004unit\030\001 \003(\0132\013.stock.UnitB\n\n\010respons" +
      "e\"%\n\004Unit\022\n\n\002id\030\001 \001(\003\022\021\n\tname_unit\030\002 \001(\t" +
      "\"/\n\020SaveStockRequest\022\033\n\005stock\030\001 \001(\0132\014.st" +
      "ock.Stock\"\334\001\n\021SaveStockResponse\022\017\n\007succe" +
      "ss\030\001 \001(\010\022-\n\004data\030\002 \001(\0132\035.stock.SaveStock" +
      "Response.DataH\000\022-\n\005error\030\003 \001(\0132\034.stock.c" +
      "ommon.StockGrpcErrorH\000\032L\n\004Data\022\021\n\tstock_" +
      "add\030\001 \001(\005\022\031\n\021stock_add_success\030\002 \001(\005\022\026\n\016" +
      "stock_add_fail\030\003 \001(\005B\n\n\010response2\322\001\n\014Sto" +
      "ckService\022@\n\013GetAllStock\022\023.stock.BlankRe" +
      "quest\032\032.stock.GetAllStockResponse\"\000\022>\n\nG" +
      "etAllUnit\022\023.stock.BlankRequest\032\031.stock.G" +
      "etAllUnitResponse\"\000\022@\n\tSaveStock\022\027.stock" +
      ".SaveStockRequest\032\030.stock.SaveStockRespo" +
      "nse\"\000B\033\n\027com.teecafe.stock.protoP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.teecafe.stock.proto.common.Error.getDescriptor(),
        });
    internal_static_stock_BlankRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stock_BlankRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_BlankRequest_descriptor,
        new java.lang.String[] { });
    internal_static_stock_GetAllStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stock_GetAllStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_GetAllStockResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Error", "Response", });
    internal_static_stock_GetAllStockResponse_Data_descriptor =
      internal_static_stock_GetAllStockResponse_descriptor.getNestedTypes().get(0);
    internal_static_stock_GetAllStockResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_GetAllStockResponse_Data_descriptor,
        new java.lang.String[] { "Stock", });
    internal_static_stock_Stock_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stock_Stock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_Stock_descriptor,
        new java.lang.String[] { "Id", "Name", "Number", "Unit", "Price", "CreateDate", "ExpDate", "Description", "Money", "CreatedBy", });
    internal_static_stock_GetAllUnitResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stock_GetAllUnitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_GetAllUnitResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Error", "Response", });
    internal_static_stock_GetAllUnitResponse_Data_descriptor =
      internal_static_stock_GetAllUnitResponse_descriptor.getNestedTypes().get(0);
    internal_static_stock_GetAllUnitResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_GetAllUnitResponse_Data_descriptor,
        new java.lang.String[] { "Unit", });
    internal_static_stock_Unit_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_stock_Unit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_Unit_descriptor,
        new java.lang.String[] { "Id", "NameUnit", });
    internal_static_stock_SaveStockRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_stock_SaveStockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_SaveStockRequest_descriptor,
        new java.lang.String[] { "Stock", });
    internal_static_stock_SaveStockResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_stock_SaveStockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_SaveStockResponse_descriptor,
        new java.lang.String[] { "Success", "Data", "Error", "Response", });
    internal_static_stock_SaveStockResponse_Data_descriptor =
      internal_static_stock_SaveStockResponse_descriptor.getNestedTypes().get(0);
    internal_static_stock_SaveStockResponse_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stock_SaveStockResponse_Data_descriptor,
        new java.lang.String[] { "StockAdd", "StockAddSuccess", "StockAddFail", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.teecafe.stock.proto.common.Error.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
