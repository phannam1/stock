package com.teecafe.stockservice.api.grpc.service;

import com.teecafe.stock.proto.*;

public interface StockGrpcService {

	GetAllStockResponse getAllStock(BlankRequest request);

	GetAllUnitResponse getAllUnit(BlankRequest request);

	SaveStockResponse saveStock(SaveStockRequest request);

    DeleteStockResponse deleteStock(DeleteStockRequest request);
}
