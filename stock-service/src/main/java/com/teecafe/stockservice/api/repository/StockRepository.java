package com.teecafe.stockservice.api.repository;

import com.teecafe.stockservice.api.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<StockEntity,Long> {
	@Query("Select st from StockEntity st join fetch st.unit ")
	List<StockEntity> findAllStock();
}
