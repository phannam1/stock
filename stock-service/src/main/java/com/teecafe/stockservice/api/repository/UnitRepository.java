package com.teecafe.stockservice.api.repository;

import com.teecafe.stockservice.api.entity.UnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<UnitEntity,Long> {
}
