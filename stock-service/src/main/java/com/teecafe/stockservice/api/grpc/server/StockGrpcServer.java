package com.teecafe.stockservice.api.grpc.server;

import com.teecafe.stock.proto.*;
import com.teecafe.stock.proto.common.StockGrpcError;
import com.teecafe.stockservice.api.grpc.service.StockGrpcService;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.http.HttpStatus;

@GrpcService
@AllArgsConstructor
public class StockGrpcServer extends StockServiceGrpc.StockServiceImplBase {

	private final StockGrpcService stockGrpcService;
	@Override
	public void getAllStock(BlankRequest request, StreamObserver<GetAllStockResponse> responseObserver) {
		try {
			responseObserver.onNext(stockGrpcService.getAllStock(request));
			responseObserver.onCompleted();

		}catch (Exception ex){
			responseObserver.onNext(GetAllStockResponse.newBuilder()
				.setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
					.setMessage(ex.getMessage())
					.build())
				.build());
			responseObserver.onCompleted();
			throw ex;
		}
	}

	@Override
	public void getAllUnit(BlankRequest request, StreamObserver<GetAllUnitResponse> responseObserver) {
		try {
			responseObserver.onNext(stockGrpcService.getAllUnit(request));
			responseObserver.onCompleted();

		}catch (Exception ex){
			responseObserver.onNext(GetAllUnitResponse.newBuilder()
				.setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
					.setMessage(ex.getMessage())
					.build())
				.build());
			responseObserver.onCompleted();
			throw ex;
		}
	}

	@Override
	public void saveStock(SaveStockRequest request, StreamObserver<SaveStockResponse> responseObserver) {
		try {
			responseObserver.onNext(stockGrpcService.saveStock(request));
			responseObserver.onCompleted();

		}catch (Exception ex){
			responseObserver.onNext(SaveStockResponse.newBuilder()
				.setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
					.setMessage(ex.getMessage())
					.build())
				.build());
			responseObserver.onCompleted();
			throw ex;
		}
	}
}
