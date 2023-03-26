package com.teecafe.stock.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: stock/stock.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StockServiceGrpc {

  private StockServiceGrpc() {}

  public static final String SERVICE_NAME = "stock.StockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest,
      com.teecafe.stock.proto.GetAllStockResponse> getGetAllStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStock",
      requestType = com.teecafe.stock.proto.BlankRequest.class,
      responseType = com.teecafe.stock.proto.GetAllStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest,
      com.teecafe.stock.proto.GetAllStockResponse> getGetAllStockMethod() {
    io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest, com.teecafe.stock.proto.GetAllStockResponse> getGetAllStockMethod;
    if ((getGetAllStockMethod = StockServiceGrpc.getGetAllStockMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getGetAllStockMethod = StockServiceGrpc.getGetAllStockMethod) == null) {
          StockServiceGrpc.getGetAllStockMethod = getGetAllStockMethod =
              io.grpc.MethodDescriptor.<com.teecafe.stock.proto.BlankRequest, com.teecafe.stock.proto.GetAllStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.BlankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.GetAllStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("GetAllStock"))
              .build();
        }
      }
    }
    return getGetAllStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest,
      com.teecafe.stock.proto.GetAllUnitResponse> getGetAllUnitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUnit",
      requestType = com.teecafe.stock.proto.BlankRequest.class,
      responseType = com.teecafe.stock.proto.GetAllUnitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest,
      com.teecafe.stock.proto.GetAllUnitResponse> getGetAllUnitMethod() {
    io.grpc.MethodDescriptor<com.teecafe.stock.proto.BlankRequest, com.teecafe.stock.proto.GetAllUnitResponse> getGetAllUnitMethod;
    if ((getGetAllUnitMethod = StockServiceGrpc.getGetAllUnitMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getGetAllUnitMethod = StockServiceGrpc.getGetAllUnitMethod) == null) {
          StockServiceGrpc.getGetAllUnitMethod = getGetAllUnitMethod =
              io.grpc.MethodDescriptor.<com.teecafe.stock.proto.BlankRequest, com.teecafe.stock.proto.GetAllUnitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUnit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.BlankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.GetAllUnitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("GetAllUnit"))
              .build();
        }
      }
    }
    return getGetAllUnitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teecafe.stock.proto.SaveStockRequest,
      com.teecafe.stock.proto.SaveStockResponse> getSaveStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveStock",
      requestType = com.teecafe.stock.proto.SaveStockRequest.class,
      responseType = com.teecafe.stock.proto.SaveStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teecafe.stock.proto.SaveStockRequest,
      com.teecafe.stock.proto.SaveStockResponse> getSaveStockMethod() {
    io.grpc.MethodDescriptor<com.teecafe.stock.proto.SaveStockRequest, com.teecafe.stock.proto.SaveStockResponse> getSaveStockMethod;
    if ((getSaveStockMethod = StockServiceGrpc.getSaveStockMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getSaveStockMethod = StockServiceGrpc.getSaveStockMethod) == null) {
          StockServiceGrpc.getSaveStockMethod = getSaveStockMethod =
              io.grpc.MethodDescriptor.<com.teecafe.stock.proto.SaveStockRequest, com.teecafe.stock.proto.SaveStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.SaveStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.SaveStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("SaveStock"))
              .build();
        }
      }
    }
    return getSaveStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.teecafe.stock.proto.DeleteStockRequest,
      com.teecafe.stock.proto.DeleteStockResponse> getDeleteStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStock",
      requestType = com.teecafe.stock.proto.DeleteStockRequest.class,
      responseType = com.teecafe.stock.proto.DeleteStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.teecafe.stock.proto.DeleteStockRequest,
      com.teecafe.stock.proto.DeleteStockResponse> getDeleteStockMethod() {
    io.grpc.MethodDescriptor<com.teecafe.stock.proto.DeleteStockRequest, com.teecafe.stock.proto.DeleteStockResponse> getDeleteStockMethod;
    if ((getDeleteStockMethod = StockServiceGrpc.getDeleteStockMethod) == null) {
      synchronized (StockServiceGrpc.class) {
        if ((getDeleteStockMethod = StockServiceGrpc.getDeleteStockMethod) == null) {
          StockServiceGrpc.getDeleteStockMethod = getDeleteStockMethod =
              io.grpc.MethodDescriptor.<com.teecafe.stock.proto.DeleteStockRequest, com.teecafe.stock.proto.DeleteStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.DeleteStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.teecafe.stock.proto.DeleteStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockServiceMethodDescriptorSupplier("DeleteStock"))
              .build();
        }
      }
    }
    return getDeleteStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockServiceStub>() {
        @java.lang.Override
        public StockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockServiceStub(channel, callOptions);
        }
      };
    return StockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockServiceBlockingStub>() {
        @java.lang.Override
        public StockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockServiceBlockingStub(channel, callOptions);
        }
      };
    return StockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockServiceFutureStub>() {
        @java.lang.Override
        public StockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockServiceFutureStub(channel, callOptions);
        }
      };
    return StockServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StockServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllStock(com.teecafe.stock.proto.BlankRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStockMethod(), responseObserver);
    }

    /**
     */
    public void getAllUnit(com.teecafe.stock.proto.BlankRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllUnitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUnitMethod(), responseObserver);
    }

    /**
     */
    public void saveStock(com.teecafe.stock.proto.SaveStockRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.SaveStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveStockMethod(), responseObserver);
    }

    /**
     */
    public void deleteStock(com.teecafe.stock.proto.DeleteStockRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.DeleteStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllStockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.teecafe.stock.proto.BlankRequest,
                com.teecafe.stock.proto.GetAllStockResponse>(
                  this, METHODID_GET_ALL_STOCK)))
          .addMethod(
            getGetAllUnitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.teecafe.stock.proto.BlankRequest,
                com.teecafe.stock.proto.GetAllUnitResponse>(
                  this, METHODID_GET_ALL_UNIT)))
          .addMethod(
            getSaveStockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.teecafe.stock.proto.SaveStockRequest,
                com.teecafe.stock.proto.SaveStockResponse>(
                  this, METHODID_SAVE_STOCK)))
          .addMethod(
            getDeleteStockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.teecafe.stock.proto.DeleteStockRequest,
                com.teecafe.stock.proto.DeleteStockResponse>(
                  this, METHODID_DELETE_STOCK)))
          .build();
    }
  }

  /**
   */
  public static final class StockServiceStub extends io.grpc.stub.AbstractAsyncStub<StockServiceStub> {
    private StockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllStock(com.teecafe.stock.proto.BlankRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUnit(com.teecafe.stock.proto.BlankRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllUnitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUnitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveStock(com.teecafe.stock.proto.SaveStockRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.SaveStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStock(com.teecafe.stock.proto.DeleteStockRequest request,
        io.grpc.stub.StreamObserver<com.teecafe.stock.proto.DeleteStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StockServiceBlockingStub> {
    private StockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.teecafe.stock.proto.GetAllStockResponse getAllStock(com.teecafe.stock.proto.BlankRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.teecafe.stock.proto.GetAllUnitResponse getAllUnit(com.teecafe.stock.proto.BlankRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUnitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.teecafe.stock.proto.SaveStockResponse saveStock(com.teecafe.stock.proto.SaveStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.teecafe.stock.proto.DeleteStockResponse deleteStock(com.teecafe.stock.proto.DeleteStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StockServiceFutureStub> {
    private StockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teecafe.stock.proto.GetAllStockResponse> getAllStock(
        com.teecafe.stock.proto.BlankRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teecafe.stock.proto.GetAllUnitResponse> getAllUnit(
        com.teecafe.stock.proto.BlankRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUnitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teecafe.stock.proto.SaveStockResponse> saveStock(
        com.teecafe.stock.proto.SaveStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.teecafe.stock.proto.DeleteStockResponse> deleteStock(
        com.teecafe.stock.proto.DeleteStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_STOCK = 0;
  private static final int METHODID_GET_ALL_UNIT = 1;
  private static final int METHODID_SAVE_STOCK = 2;
  private static final int METHODID_DELETE_STOCK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_STOCK:
          serviceImpl.getAllStock((com.teecafe.stock.proto.BlankRequest) request,
              (io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllStockResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_UNIT:
          serviceImpl.getAllUnit((com.teecafe.stock.proto.BlankRequest) request,
              (io.grpc.stub.StreamObserver<com.teecafe.stock.proto.GetAllUnitResponse>) responseObserver);
          break;
        case METHODID_SAVE_STOCK:
          serviceImpl.saveStock((com.teecafe.stock.proto.SaveStockRequest) request,
              (io.grpc.stub.StreamObserver<com.teecafe.stock.proto.SaveStockResponse>) responseObserver);
          break;
        case METHODID_DELETE_STOCK:
          serviceImpl.deleteStock((com.teecafe.stock.proto.DeleteStockRequest) request,
              (io.grpc.stub.StreamObserver<com.teecafe.stock.proto.DeleteStockResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.teecafe.stock.proto.StockOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockService");
    }
  }

  private static final class StockServiceFileDescriptorSupplier
      extends StockServiceBaseDescriptorSupplier {
    StockServiceFileDescriptorSupplier() {}
  }

  private static final class StockServiceMethodDescriptorSupplier
      extends StockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockServiceFileDescriptorSupplier())
              .addMethod(getGetAllStockMethod())
              .addMethod(getGetAllUnitMethod())
              .addMethod(getSaveStockMethod())
              .addMethod(getDeleteStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
