package accountpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "accountpb.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.CreateAccountReq,
      accountpb.AccountOuterClass.CreateAccountResp> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = accountpb.AccountOuterClass.CreateAccountReq.class,
      responseType = accountpb.AccountOuterClass.CreateAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.CreateAccountReq,
      accountpb.AccountOuterClass.CreateAccountResp> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.CreateAccountReq, accountpb.AccountOuterClass.CreateAccountResp> getCreateAccountMethod;
    if ((getCreateAccountMethod = AccountServiceGrpc.getCreateAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getCreateAccountMethod = AccountServiceGrpc.getCreateAccountMethod) == null) {
          AccountServiceGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.CreateAccountReq, accountpb.AccountOuterClass.CreateAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.CreateAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.CreateAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("CreateAccount"))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountReq,
      accountpb.AccountOuterClass.GetAccountResp> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = accountpb.AccountOuterClass.GetAccountReq.class,
      responseType = accountpb.AccountOuterClass.GetAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountReq,
      accountpb.AccountOuterClass.GetAccountResp> getGetAccountMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountReq, accountpb.AccountOuterClass.GetAccountResp> getGetAccountMethod;
    if ((getGetAccountMethod = AccountServiceGrpc.getGetAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountMethod = AccountServiceGrpc.getGetAccountMethod) == null) {
          AccountServiceGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.GetAccountReq, accountpb.AccountOuterClass.GetAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.GetAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.GetAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ListAccountReq,
      accountpb.AccountOuterClass.ListAccountResp> getListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccounts",
      requestType = accountpb.AccountOuterClass.ListAccountReq.class,
      responseType = accountpb.AccountOuterClass.ListAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ListAccountReq,
      accountpb.AccountOuterClass.ListAccountResp> getListAccountsMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ListAccountReq, accountpb.AccountOuterClass.ListAccountResp> getListAccountsMethod;
    if ((getListAccountsMethod = AccountServiceGrpc.getListAccountsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getListAccountsMethod = AccountServiceGrpc.getListAccountsMethod) == null) {
          AccountServiceGrpc.getListAccountsMethod = getListAccountsMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.ListAccountReq, accountpb.AccountOuterClass.ListAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.ListAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.ListAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ListAccounts"))
              .build();
        }
      }
    }
    return getListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.LockAccountReq,
      accountpb.AccountOuterClass.LockAccountResp> getLockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockAccount",
      requestType = accountpb.AccountOuterClass.LockAccountReq.class,
      responseType = accountpb.AccountOuterClass.LockAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.LockAccountReq,
      accountpb.AccountOuterClass.LockAccountResp> getLockAccountMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.LockAccountReq, accountpb.AccountOuterClass.LockAccountResp> getLockAccountMethod;
    if ((getLockAccountMethod = AccountServiceGrpc.getLockAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getLockAccountMethod = AccountServiceGrpc.getLockAccountMethod) == null) {
          AccountServiceGrpc.getLockAccountMethod = getLockAccountMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.LockAccountReq, accountpb.AccountOuterClass.LockAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.LockAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.LockAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("LockAccount"))
              .build();
        }
      }
    }
    return getLockAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.UnlockAccountReq,
      accountpb.AccountOuterClass.UnlockAccountResp> getUnlockAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockAccount",
      requestType = accountpb.AccountOuterClass.UnlockAccountReq.class,
      responseType = accountpb.AccountOuterClass.UnlockAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.UnlockAccountReq,
      accountpb.AccountOuterClass.UnlockAccountResp> getUnlockAccountMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.UnlockAccountReq, accountpb.AccountOuterClass.UnlockAccountResp> getUnlockAccountMethod;
    if ((getUnlockAccountMethod = AccountServiceGrpc.getUnlockAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUnlockAccountMethod = AccountServiceGrpc.getUnlockAccountMethod) == null) {
          AccountServiceGrpc.getUnlockAccountMethod = getUnlockAccountMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.UnlockAccountReq, accountpb.AccountOuterClass.UnlockAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.UnlockAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.UnlockAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("UnlockAccount"))
              .build();
        }
      }
    }
    return getUnlockAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ChangeRoleReq,
      accountpb.AccountOuterClass.ChangeRoleResp> getChangeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRole",
      requestType = accountpb.AccountOuterClass.ChangeRoleReq.class,
      responseType = accountpb.AccountOuterClass.ChangeRoleResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ChangeRoleReq,
      accountpb.AccountOuterClass.ChangeRoleResp> getChangeRoleMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.ChangeRoleReq, accountpb.AccountOuterClass.ChangeRoleResp> getChangeRoleMethod;
    if ((getChangeRoleMethod = AccountServiceGrpc.getChangeRoleMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getChangeRoleMethod = AccountServiceGrpc.getChangeRoleMethod) == null) {
          AccountServiceGrpc.getChangeRoleMethod = getChangeRoleMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.ChangeRoleReq, accountpb.AccountOuterClass.ChangeRoleResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.ChangeRoleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.ChangeRoleResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ChangeRole"))
              .build();
        }
      }
    }
    return getChangeRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.DeleteAccountReq,
      accountpb.AccountOuterClass.DeleteAccountResp> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = accountpb.AccountOuterClass.DeleteAccountReq.class,
      responseType = accountpb.AccountOuterClass.DeleteAccountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.DeleteAccountReq,
      accountpb.AccountOuterClass.DeleteAccountResp> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.DeleteAccountReq, accountpb.AccountOuterClass.DeleteAccountResp> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = AccountServiceGrpc.getDeleteAccountMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDeleteAccountMethod = AccountServiceGrpc.getDeleteAccountMethod) == null) {
          AccountServiceGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.DeleteAccountReq, accountpb.AccountOuterClass.DeleteAccountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.DeleteAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.DeleteAccountResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountByProviderReq,
      accountpb.AccountOuterClass.GetAccountByProviderResp> getGetAccountByProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountByProvider",
      requestType = accountpb.AccountOuterClass.GetAccountByProviderReq.class,
      responseType = accountpb.AccountOuterClass.GetAccountByProviderResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountByProviderReq,
      accountpb.AccountOuterClass.GetAccountByProviderResp> getGetAccountByProviderMethod() {
    io.grpc.MethodDescriptor<accountpb.AccountOuterClass.GetAccountByProviderReq, accountpb.AccountOuterClass.GetAccountByProviderResp> getGetAccountByProviderMethod;
    if ((getGetAccountByProviderMethod = AccountServiceGrpc.getGetAccountByProviderMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetAccountByProviderMethod = AccountServiceGrpc.getGetAccountByProviderMethod) == null) {
          AccountServiceGrpc.getGetAccountByProviderMethod = getGetAccountByProviderMethod =
              io.grpc.MethodDescriptor.<accountpb.AccountOuterClass.GetAccountByProviderReq, accountpb.AccountOuterClass.GetAccountByProviderResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountByProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.GetAccountByProviderReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  accountpb.AccountOuterClass.GetAccountByProviderResp.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetAccountByProvider"))
              .build();
        }
      }
    }
    return getGetAccountByProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createAccount(accountpb.AccountOuterClass.CreateAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.CreateAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccount(accountpb.AccountOuterClass.GetAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    default void listAccounts(accountpb.AccountOuterClass.ListAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ListAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccountsMethod(), responseObserver);
    }

    /**
     */
    default void lockAccount(accountpb.AccountOuterClass.LockAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.LockAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockAccountMethod(), responseObserver);
    }

    /**
     */
    default void unlockAccount(accountpb.AccountOuterClass.UnlockAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.UnlockAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockAccountMethod(), responseObserver);
    }

    /**
     */
    default void changeRole(accountpb.AccountOuterClass.ChangeRoleReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ChangeRoleResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeRoleMethod(), responseObserver);
    }

    /**
     */
    default void deleteAccount(accountpb.AccountOuterClass.DeleteAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.DeleteAccountResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    default void getAccountByProvider(accountpb.AccountOuterClass.GetAccountByProviderReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountByProviderResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountByProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountService.
   */
  public static abstract class AccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAccount(accountpb.AccountOuterClass.CreateAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.CreateAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(accountpb.AccountOuterClass.GetAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAccounts(accountpb.AccountOuterClass.ListAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ListAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockAccount(accountpb.AccountOuterClass.LockAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.LockAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlockAccount(accountpb.AccountOuterClass.UnlockAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.UnlockAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRole(accountpb.AccountOuterClass.ChangeRoleReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ChangeRoleResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(accountpb.AccountOuterClass.DeleteAccountReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.DeleteAccountResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountByProvider(accountpb.AccountOuterClass.GetAccountByProviderReq request,
        io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountByProviderResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountByProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public accountpb.AccountOuterClass.CreateAccountResp createAccount(accountpb.AccountOuterClass.CreateAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.GetAccountResp getAccount(accountpb.AccountOuterClass.GetAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.ListAccountResp listAccounts(accountpb.AccountOuterClass.ListAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.LockAccountResp lockAccount(accountpb.AccountOuterClass.LockAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.UnlockAccountResp unlockAccount(accountpb.AccountOuterClass.UnlockAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.ChangeRoleResp changeRole(accountpb.AccountOuterClass.ChangeRoleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.DeleteAccountResp deleteAccount(accountpb.AccountOuterClass.DeleteAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public accountpb.AccountOuterClass.GetAccountByProviderResp getAccountByProvider(accountpb.AccountOuterClass.GetAccountByProviderReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountByProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountService.
   */
  public static final class AccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.CreateAccountResp> createAccount(
        accountpb.AccountOuterClass.CreateAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.GetAccountResp> getAccount(
        accountpb.AccountOuterClass.GetAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.ListAccountResp> listAccounts(
        accountpb.AccountOuterClass.ListAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.LockAccountResp> lockAccount(
        accountpb.AccountOuterClass.LockAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.UnlockAccountResp> unlockAccount(
        accountpb.AccountOuterClass.UnlockAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.ChangeRoleResp> changeRole(
        accountpb.AccountOuterClass.ChangeRoleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.DeleteAccountResp> deleteAccount(
        accountpb.AccountOuterClass.DeleteAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<accountpb.AccountOuterClass.GetAccountByProviderResp> getAccountByProvider(
        accountpb.AccountOuterClass.GetAccountByProviderReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountByProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCOUNT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_LIST_ACCOUNTS = 2;
  private static final int METHODID_LOCK_ACCOUNT = 3;
  private static final int METHODID_UNLOCK_ACCOUNT = 4;
  private static final int METHODID_CHANGE_ROLE = 5;
  private static final int METHODID_DELETE_ACCOUNT = 6;
  private static final int METHODID_GET_ACCOUNT_BY_PROVIDER = 7;

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
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((accountpb.AccountOuterClass.CreateAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.CreateAccountResp>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((accountpb.AccountOuterClass.GetAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountResp>) responseObserver);
          break;
        case METHODID_LIST_ACCOUNTS:
          serviceImpl.listAccounts((accountpb.AccountOuterClass.ListAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ListAccountResp>) responseObserver);
          break;
        case METHODID_LOCK_ACCOUNT:
          serviceImpl.lockAccount((accountpb.AccountOuterClass.LockAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.LockAccountResp>) responseObserver);
          break;
        case METHODID_UNLOCK_ACCOUNT:
          serviceImpl.unlockAccount((accountpb.AccountOuterClass.UnlockAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.UnlockAccountResp>) responseObserver);
          break;
        case METHODID_CHANGE_ROLE:
          serviceImpl.changeRole((accountpb.AccountOuterClass.ChangeRoleReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.ChangeRoleResp>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((accountpb.AccountOuterClass.DeleteAccountReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.DeleteAccountResp>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_BY_PROVIDER:
          serviceImpl.getAccountByProvider((accountpb.AccountOuterClass.GetAccountByProviderReq) request,
              (io.grpc.stub.StreamObserver<accountpb.AccountOuterClass.GetAccountByProviderResp>) responseObserver);
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
          getCreateAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.CreateAccountReq,
              accountpb.AccountOuterClass.CreateAccountResp>(
                service, METHODID_CREATE_ACCOUNT)))
        .addMethod(
          getGetAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.GetAccountReq,
              accountpb.AccountOuterClass.GetAccountResp>(
                service, METHODID_GET_ACCOUNT)))
        .addMethod(
          getListAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.ListAccountReq,
              accountpb.AccountOuterClass.ListAccountResp>(
                service, METHODID_LIST_ACCOUNTS)))
        .addMethod(
          getLockAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.LockAccountReq,
              accountpb.AccountOuterClass.LockAccountResp>(
                service, METHODID_LOCK_ACCOUNT)))
        .addMethod(
          getUnlockAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.UnlockAccountReq,
              accountpb.AccountOuterClass.UnlockAccountResp>(
                service, METHODID_UNLOCK_ACCOUNT)))
        .addMethod(
          getChangeRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.ChangeRoleReq,
              accountpb.AccountOuterClass.ChangeRoleResp>(
                service, METHODID_CHANGE_ROLE)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.DeleteAccountReq,
              accountpb.AccountOuterClass.DeleteAccountResp>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getGetAccountByProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              accountpb.AccountOuterClass.GetAccountByProviderReq,
              accountpb.AccountOuterClass.GetAccountByProviderResp>(
                service, METHODID_GET_ACCOUNT_BY_PROVIDER)))
        .build();
  }

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return accountpb.AccountOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AccountServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getCreateAccountMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getListAccountsMethod())
              .addMethod(getLockAccountMethod())
              .addMethod(getUnlockAccountMethod())
              .addMethod(getChangeRoleMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getGetAccountByProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
