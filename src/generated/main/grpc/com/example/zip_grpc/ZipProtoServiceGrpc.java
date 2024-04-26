package com.example.zip_grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: zip.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZipProtoServiceGrpc {

  private ZipProtoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "zip.ZipProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipIdRequest,
      com.example.zip_grpc.ZipIdResponse> getGetZipInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipInfo",
      requestType = com.example.zip_grpc.ZipIdRequest.class,
      responseType = com.example.zip_grpc.ZipIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipIdRequest,
      com.example.zip_grpc.ZipIdResponse> getGetZipInfoMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipIdRequest, com.example.zip_grpc.ZipIdResponse> getGetZipInfoMethod;
    if ((getGetZipInfoMethod = ZipProtoServiceGrpc.getGetZipInfoMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipInfoMethod = ZipProtoServiceGrpc.getGetZipInfoMethod) == null) {
          ZipProtoServiceGrpc.getGetZipInfoMethod = getGetZipInfoMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipIdRequest, com.example.zip_grpc.ZipIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipInfo"))
              .build();
        }
      }
    }
    return getGetZipInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAllRequest,
      com.example.zip_grpc.ZipAllResponse> getGetZipAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipAll",
      requestType = com.example.zip_grpc.ZipAllRequest.class,
      responseType = com.example.zip_grpc.ZipAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAllRequest,
      com.example.zip_grpc.ZipAllResponse> getGetZipAllMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAllRequest, com.example.zip_grpc.ZipAllResponse> getGetZipAllMethod;
    if ((getGetZipAllMethod = ZipProtoServiceGrpc.getGetZipAllMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipAllMethod = ZipProtoServiceGrpc.getGetZipAllMethod) == null) {
          ZipProtoServiceGrpc.getGetZipAllMethod = getGetZipAllMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipAllRequest, com.example.zip_grpc.ZipAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipAll"))
              .build();
        }
      }
    }
    return getGetZipAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowYesRequest,
      com.example.zip_grpc.ZipShowYesResponse> getGetZipShowYesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipShowYes",
      requestType = com.example.zip_grpc.ZipShowYesRequest.class,
      responseType = com.example.zip_grpc.ZipShowYesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowYesRequest,
      com.example.zip_grpc.ZipShowYesResponse> getGetZipShowYesMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowYesRequest, com.example.zip_grpc.ZipShowYesResponse> getGetZipShowYesMethod;
    if ((getGetZipShowYesMethod = ZipProtoServiceGrpc.getGetZipShowYesMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipShowYesMethod = ZipProtoServiceGrpc.getGetZipShowYesMethod) == null) {
          ZipProtoServiceGrpc.getGetZipShowYesMethod = getGetZipShowYesMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipShowYesRequest, com.example.zip_grpc.ZipShowYesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipShowYes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipShowYesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipShowYesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipShowYes"))
              .build();
        }
      }
    }
    return getGetZipShowYesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowNoRequest,
      com.example.zip_grpc.ZipShowNoResponse> getGetZipShowNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipShowNo",
      requestType = com.example.zip_grpc.ZipShowNoRequest.class,
      responseType = com.example.zip_grpc.ZipShowNoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowNoRequest,
      com.example.zip_grpc.ZipShowNoResponse> getGetZipShowNoMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipShowNoRequest, com.example.zip_grpc.ZipShowNoResponse> getGetZipShowNoMethod;
    if ((getGetZipShowNoMethod = ZipProtoServiceGrpc.getGetZipShowNoMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipShowNoMethod = ZipProtoServiceGrpc.getGetZipShowNoMethod) == null) {
          ZipProtoServiceGrpc.getGetZipShowNoMethod = getGetZipShowNoMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipShowNoRequest, com.example.zip_grpc.ZipShowNoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipShowNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipShowNoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipShowNoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipShowNo"))
              .build();
        }
      }
    }
    return getGetZipShowNoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAgentIdRequest,
      com.example.zip_grpc.ZipAgentIdResponse> getGetZipByAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipByAgent",
      requestType = com.example.zip_grpc.ZipAgentIdRequest.class,
      responseType = com.example.zip_grpc.ZipAgentIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAgentIdRequest,
      com.example.zip_grpc.ZipAgentIdResponse> getGetZipByAgentMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipAgentIdRequest, com.example.zip_grpc.ZipAgentIdResponse> getGetZipByAgentMethod;
    if ((getGetZipByAgentMethod = ZipProtoServiceGrpc.getGetZipByAgentMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipByAgentMethod = ZipProtoServiceGrpc.getGetZipByAgentMethod) == null) {
          ZipProtoServiceGrpc.getGetZipByAgentMethod = getGetZipByAgentMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipAgentIdRequest, com.example.zip_grpc.ZipAgentIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipByAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipAgentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipAgentIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipByAgent"))
              .build();
        }
      }
    }
    return getGetZipByAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipEsateIdRequest,
      com.example.zip_grpc.ZipEstateIdResponse> getGetZipByEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZipByEstate",
      requestType = com.example.zip_grpc.ZipEsateIdRequest.class,
      responseType = com.example.zip_grpc.ZipEstateIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipEsateIdRequest,
      com.example.zip_grpc.ZipEstateIdResponse> getGetZipByEstateMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipEsateIdRequest, com.example.zip_grpc.ZipEstateIdResponse> getGetZipByEstateMethod;
    if ((getGetZipByEstateMethod = ZipProtoServiceGrpc.getGetZipByEstateMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getGetZipByEstateMethod = ZipProtoServiceGrpc.getGetZipByEstateMethod) == null) {
          ZipProtoServiceGrpc.getGetZipByEstateMethod = getGetZipByEstateMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipEsateIdRequest, com.example.zip_grpc.ZipEstateIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZipByEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipEsateIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipEstateIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("GetZipByEstate"))
              .build();
        }
      }
    }
    return getGetZipByEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipInsertRequest,
      com.example.zip_grpc.ZipInsertResponse> getSaveZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveZip",
      requestType = com.example.zip_grpc.ZipInsertRequest.class,
      responseType = com.example.zip_grpc.ZipInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipInsertRequest,
      com.example.zip_grpc.ZipInsertResponse> getSaveZipMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipInsertRequest, com.example.zip_grpc.ZipInsertResponse> getSaveZipMethod;
    if ((getSaveZipMethod = ZipProtoServiceGrpc.getSaveZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getSaveZipMethod = ZipProtoServiceGrpc.getSaveZipMethod) == null) {
          ZipProtoServiceGrpc.getSaveZipMethod = getSaveZipMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipInsertRequest, com.example.zip_grpc.ZipInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipInsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("SaveZip"))
              .build();
        }
      }
    }
    return getSaveZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipUpdateRequest,
      com.example.zip_grpc.ZipUpdateResponse> getUpdateZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateZip",
      requestType = com.example.zip_grpc.ZipUpdateRequest.class,
      responseType = com.example.zip_grpc.ZipUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipUpdateRequest,
      com.example.zip_grpc.ZipUpdateResponse> getUpdateZipMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipUpdateRequest, com.example.zip_grpc.ZipUpdateResponse> getUpdateZipMethod;
    if ((getUpdateZipMethod = ZipProtoServiceGrpc.getUpdateZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getUpdateZipMethod = ZipProtoServiceGrpc.getUpdateZipMethod) == null) {
          ZipProtoServiceGrpc.getUpdateZipMethod = getUpdateZipMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipUpdateRequest, com.example.zip_grpc.ZipUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("UpdateZip"))
              .build();
        }
      }
    }
    return getUpdateZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipDeleteRequest,
      com.example.zip_grpc.ZipDeleteResponse> getDeleteZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteZip",
      requestType = com.example.zip_grpc.ZipDeleteRequest.class,
      responseType = com.example.zip_grpc.ZipDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipDeleteRequest,
      com.example.zip_grpc.ZipDeleteResponse> getDeleteZipMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipDeleteRequest, com.example.zip_grpc.ZipDeleteResponse> getDeleteZipMethod;
    if ((getDeleteZipMethod = ZipProtoServiceGrpc.getDeleteZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getDeleteZipMethod = ZipProtoServiceGrpc.getDeleteZipMethod) == null) {
          ZipProtoServiceGrpc.getDeleteZipMethod = getDeleteZipMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipDeleteRequest, com.example.zip_grpc.ZipDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("DeleteZip"))
              .build();
        }
      }
    }
    return getDeleteZipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.zip_grpc.ZipSearchRequest,
      com.example.zip_grpc.ZipSearchResponse> getSearchZipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchZip",
      requestType = com.example.zip_grpc.ZipSearchRequest.class,
      responseType = com.example.zip_grpc.ZipSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.zip_grpc.ZipSearchRequest,
      com.example.zip_grpc.ZipSearchResponse> getSearchZipMethod() {
    io.grpc.MethodDescriptor<com.example.zip_grpc.ZipSearchRequest, com.example.zip_grpc.ZipSearchResponse> getSearchZipMethod;
    if ((getSearchZipMethod = ZipProtoServiceGrpc.getSearchZipMethod) == null) {
      synchronized (ZipProtoServiceGrpc.class) {
        if ((getSearchZipMethod = ZipProtoServiceGrpc.getSearchZipMethod) == null) {
          ZipProtoServiceGrpc.getSearchZipMethod = getSearchZipMethod =
              io.grpc.MethodDescriptor.<com.example.zip_grpc.ZipSearchRequest, com.example.zip_grpc.ZipSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchZip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.zip_grpc.ZipSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ZipProtoServiceMethodDescriptorSupplier("SearchZip"))
              .build();
        }
      }
    }
    return getSearchZipMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZipProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceStub>() {
        @java.lang.Override
        public ZipProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceStub(channel, callOptions);
        }
      };
    return ZipProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZipProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceBlockingStub>() {
        @java.lang.Override
        public ZipProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return ZipProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZipProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZipProtoServiceFutureStub>() {
        @java.lang.Override
        public ZipProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZipProtoServiceFutureStub(channel, callOptions);
        }
      };
    return ZipProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getZipInfo(com.example.zip_grpc.ZipIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipInfoMethod(), responseObserver);
    }

    /**
     */
    default void getZipAll(com.example.zip_grpc.ZipAllRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipAllMethod(), responseObserver);
    }

    /**
     */
    default void getZipShowYes(com.example.zip_grpc.ZipShowYesRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowYesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipShowYesMethod(), responseObserver);
    }

    /**
     */
    default void getZipShowNo(com.example.zip_grpc.ZipShowNoRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowNoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipShowNoMethod(), responseObserver);
    }

    /**
     */
    default void getZipByAgent(com.example.zip_grpc.ZipAgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAgentIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipByAgentMethod(), responseObserver);
    }

    /**
     */
    default void getZipByEstate(com.example.zip_grpc.ZipEsateIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipEstateIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZipByEstateMethod(), responseObserver);
    }

    /**
     */
    default void saveZip(com.example.zip_grpc.ZipInsertRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipInsertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveZipMethod(), responseObserver);
    }

    /**
     */
    default void updateZip(com.example.zip_grpc.ZipUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateZipMethod(), responseObserver);
    }

    /**
     */
    default void deleteZip(com.example.zip_grpc.ZipDeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteZipMethod(), responseObserver);
    }

    /**
     */
    default void searchZip(com.example.zip_grpc.ZipSearchRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchZipMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ZipProtoService.
   */
  public static abstract class ZipProtoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ZipProtoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ZipProtoServiceStub> {
    private ZipProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getZipInfo(com.example.zip_grpc.ZipIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipAll(com.example.zip_grpc.ZipAllRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipShowYes(com.example.zip_grpc.ZipShowYesRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowYesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipShowYesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipShowNo(com.example.zip_grpc.ZipShowNoRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowNoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipShowNoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipByAgent(com.example.zip_grpc.ZipAgentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAgentIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipByAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getZipByEstate(com.example.zip_grpc.ZipEsateIdRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipEstateIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZipByEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveZip(com.example.zip_grpc.ZipInsertRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipInsertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateZip(com.example.zip_grpc.ZipUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteZip(com.example.zip_grpc.ZipDeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteZipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchZip(com.example.zip_grpc.ZipSearchRequest request,
        io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchZipMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ZipProtoServiceBlockingStub> {
    private ZipProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.zip_grpc.ZipIdResponse getZipInfo(com.example.zip_grpc.ZipIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipAllResponse getZipAll(com.example.zip_grpc.ZipAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipShowYesResponse getZipShowYes(com.example.zip_grpc.ZipShowYesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipShowYesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipShowNoResponse getZipShowNo(com.example.zip_grpc.ZipShowNoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipShowNoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipAgentIdResponse getZipByAgent(com.example.zip_grpc.ZipAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipByAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipEstateIdResponse getZipByEstate(com.example.zip_grpc.ZipEsateIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZipByEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipInsertResponse saveZip(com.example.zip_grpc.ZipInsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipUpdateResponse updateZip(com.example.zip_grpc.ZipUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipDeleteResponse deleteZip(com.example.zip_grpc.ZipDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteZipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.zip_grpc.ZipSearchResponse searchZip(com.example.zip_grpc.ZipSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchZipMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ZipProtoService.
   */
  public static final class ZipProtoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ZipProtoServiceFutureStub> {
    private ZipProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZipProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZipProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipIdResponse> getZipInfo(
        com.example.zip_grpc.ZipIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipAllResponse> getZipAll(
        com.example.zip_grpc.ZipAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipShowYesResponse> getZipShowYes(
        com.example.zip_grpc.ZipShowYesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipShowYesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipShowNoResponse> getZipShowNo(
        com.example.zip_grpc.ZipShowNoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipShowNoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipAgentIdResponse> getZipByAgent(
        com.example.zip_grpc.ZipAgentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipByAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipEstateIdResponse> getZipByEstate(
        com.example.zip_grpc.ZipEsateIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZipByEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipInsertResponse> saveZip(
        com.example.zip_grpc.ZipInsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipUpdateResponse> updateZip(
        com.example.zip_grpc.ZipUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipDeleteResponse> deleteZip(
        com.example.zip_grpc.ZipDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteZipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.zip_grpc.ZipSearchResponse> searchZip(
        com.example.zip_grpc.ZipSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchZipMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZIP_INFO = 0;
  private static final int METHODID_GET_ZIP_ALL = 1;
  private static final int METHODID_GET_ZIP_SHOW_YES = 2;
  private static final int METHODID_GET_ZIP_SHOW_NO = 3;
  private static final int METHODID_GET_ZIP_BY_AGENT = 4;
  private static final int METHODID_GET_ZIP_BY_ESTATE = 5;
  private static final int METHODID_SAVE_ZIP = 6;
  private static final int METHODID_UPDATE_ZIP = 7;
  private static final int METHODID_DELETE_ZIP = 8;
  private static final int METHODID_SEARCH_ZIP = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZIP_INFO:
          serviceImpl.getZipInfo((com.example.zip_grpc.ZipIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipIdResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_ALL:
          serviceImpl.getZipAll((com.example.zip_grpc.ZipAllRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAllResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_SHOW_YES:
          serviceImpl.getZipShowYes((com.example.zip_grpc.ZipShowYesRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowYesResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_SHOW_NO:
          serviceImpl.getZipShowNo((com.example.zip_grpc.ZipShowNoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipShowNoResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_BY_AGENT:
          serviceImpl.getZipByAgent((com.example.zip_grpc.ZipAgentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipAgentIdResponse>) responseObserver);
          break;
        case METHODID_GET_ZIP_BY_ESTATE:
          serviceImpl.getZipByEstate((com.example.zip_grpc.ZipEsateIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipEstateIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_ZIP:
          serviceImpl.saveZip((com.example.zip_grpc.ZipInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipInsertResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ZIP:
          serviceImpl.updateZip((com.example.zip_grpc.ZipUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ZIP:
          serviceImpl.deleteZip((com.example.zip_grpc.ZipDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipDeleteResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ZIP:
          serviceImpl.searchZip((com.example.zip_grpc.ZipSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.example.zip_grpc.ZipSearchResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetZipInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipIdRequest,
              com.example.zip_grpc.ZipIdResponse>(
                service, METHODID_GET_ZIP_INFO)))
        .addMethod(
          getGetZipAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipAllRequest,
              com.example.zip_grpc.ZipAllResponse>(
                service, METHODID_GET_ZIP_ALL)))
        .addMethod(
          getGetZipShowYesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipShowYesRequest,
              com.example.zip_grpc.ZipShowYesResponse>(
                service, METHODID_GET_ZIP_SHOW_YES)))
        .addMethod(
          getGetZipShowNoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipShowNoRequest,
              com.example.zip_grpc.ZipShowNoResponse>(
                service, METHODID_GET_ZIP_SHOW_NO)))
        .addMethod(
          getGetZipByAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipAgentIdRequest,
              com.example.zip_grpc.ZipAgentIdResponse>(
                service, METHODID_GET_ZIP_BY_AGENT)))
        .addMethod(
          getGetZipByEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipEsateIdRequest,
              com.example.zip_grpc.ZipEstateIdResponse>(
                service, METHODID_GET_ZIP_BY_ESTATE)))
        .addMethod(
          getSaveZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipInsertRequest,
              com.example.zip_grpc.ZipInsertResponse>(
                service, METHODID_SAVE_ZIP)))
        .addMethod(
          getUpdateZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipUpdateRequest,
              com.example.zip_grpc.ZipUpdateResponse>(
                service, METHODID_UPDATE_ZIP)))
        .addMethod(
          getDeleteZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipDeleteRequest,
              com.example.zip_grpc.ZipDeleteResponse>(
                service, METHODID_DELETE_ZIP)))
        .addMethod(
          getSearchZipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.zip_grpc.ZipSearchRequest,
              com.example.zip_grpc.ZipSearchResponse>(
                service, METHODID_SEARCH_ZIP)))
        .build();
  }

  private static abstract class ZipProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZipProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.zip_grpc.ZipProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZipProtoService");
    }
  }

  private static final class ZipProtoServiceFileDescriptorSupplier
      extends ZipProtoServiceBaseDescriptorSupplier {
    ZipProtoServiceFileDescriptorSupplier() {}
  }

  private static final class ZipProtoServiceMethodDescriptorSupplier
      extends ZipProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ZipProtoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ZipProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZipProtoServiceFileDescriptorSupplier())
              .addMethod(getGetZipInfoMethod())
              .addMethod(getGetZipAllMethod())
              .addMethod(getGetZipShowYesMethod())
              .addMethod(getGetZipShowNoMethod())
              .addMethod(getGetZipByAgentMethod())
              .addMethod(getGetZipByEstateMethod())
              .addMethod(getSaveZipMethod())
              .addMethod(getUpdateZipMethod())
              .addMethod(getDeleteZipMethod())
              .addMethod(getSearchZipMethod())
              .build();
        }
      }
    }
    return result;
  }
}
