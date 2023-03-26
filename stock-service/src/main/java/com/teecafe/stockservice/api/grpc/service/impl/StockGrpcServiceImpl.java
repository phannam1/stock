package com.teecafe.stockservice.api.grpc.service.impl;

import com.teecafe.stock.proto.*;
import com.teecafe.stock.proto.common.StockGrpcError;
import com.teecafe.stockservice.api.entity.StockEntity;
import com.teecafe.stockservice.api.entity.UnitEntity;
import com.teecafe.stockservice.api.grpc.service.StockGrpcService;
import com.teecafe.stockservice.api.repository.StockRepository;
import com.teecafe.stockservice.api.repository.UnitRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StockGrpcServiceImpl implements StockGrpcService {
	private final StockRepository stockRepository;
	private final UnitRepository unitRepository;
	@Override
	public GetAllStockResponse getAllStock(BlankRequest request) {
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		List<StockEntity> stockEntities = stockRepository.findAllStock();
		if(stockEntities==null ||stockEntities.size()==0){
			return GetAllStockResponse.newBuilder().setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.NOT_FOUND.toString())
					.setMessage("Stock Clean")
					.build()).build();
		}

		return GetAllStockResponse.newBuilder().setSuccess(true)
			.setData(GetAllStockResponse.Data.newBuilder()
				.addAllStock(stockEntities.stream().map(stock-> Stock
					.newBuilder()
						.setId(stock.getId())
						.setName(stock.getName())
						.setNumber(stock.getNumber())
						.setUnit(stock.getUnit().getNameUnit())
						.setPrice(stock.getPrice())
						.setCreateDate(simpleDateFormat.format(stock.getCreatedDate()))
						.setExpDate(simpleDateFormat.format(stock.getExpiryDate()))
						.setDescription(stock.getDescription() == null ? "" : stock.getDescription())
						.setMoney(stock.getPrice()*stock.getNumber())
					.build())
					.collect(Collectors.toList()))
				.build())
			.build();
	}

	@Override
	public GetAllUnitResponse getAllUnit(BlankRequest request) {
		List<UnitEntity> unitEntities = unitRepository.findAll();
		if(unitEntities==null ||unitEntities.size()==0){
			return GetAllUnitResponse.newBuilder().setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.NOT_FOUND.toString())
					.setMessage("Unit not found")
					.build()).build();
		}
		return GetAllUnitResponse.newBuilder()
			.setSuccess(true)
			.setData(GetAllUnitResponse.Data.newBuilder()
				.addAllUnit(unitEntities.stream()
					.map(unit -> Unit.newBuilder()
						.setId(unit.getId())
						.setNameUnit(unit.getNameUnit())
						.build())
					.collect(Collectors.toList()))
				.build())
			.build();
	}

	@Override
	public SaveStockResponse saveStock(SaveStockRequest request) {
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		StockEntity stockEntity = new StockEntity();

		if(request.hasStock()){
			try {
				Stock stock = request.getStock();
				UnitEntity unitEntity = new UnitEntity();
				unitEntity.setId(Long.valueOf(stock.getUnit()));
				stockEntity.setName(stock.getName());
				stockEntity.setNumber(stock.getNumber());
				stockEntity.setUnit(unitEntity);
				stockEntity.setPrice(stock.getPrice());
				stockEntity.setCreatedBy(stock.getCreatedBy());
				stockEntity.setUpdatedBy(stock.getCreatedBy());
				stockEntity.setCreatedDate(simpleDateFormat.format(new Date()));
				stockEntity.setExpiryDate(stock.getExpDate());
				stockEntity.setDescription(stock.getDescription());
				stockRepository.save(stockEntity);
			}catch (Exception ex){
				return SaveStockResponse.newBuilder()
					.setSuccess(false)
					.setError(StockGrpcError.newBuilder()
						.setCode(HttpStatus.BAD_REQUEST.toString())
						.setMessage(ex.getMessage())
						.build())
					.build();
			}
		}else{
			return SaveStockResponse.newBuilder()
				.setSuccess(false)
				.setError(StockGrpcError.newBuilder()
					.setCode(HttpStatus.BAD_REQUEST.toString())
					.setMessage(HttpStatus.BAD_REQUEST.toString())
					.build())
				.build();
		}
		return SaveStockResponse.newBuilder()
			.setSuccess(true)
			.setData(SaveStockResponse.Data
				.newBuilder()
				.setStockAdd(1)
				.setStockAddSuccess(1)
				.setStockAddFail(0)
				.build())
			.build();
	}
}
