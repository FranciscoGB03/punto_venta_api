package com.mishos.repositories;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mishos.entities.StockTax;

public interface RepositoryStockTax extends JpaRepository<StockTax, Integer> {
	
	@Query("from ImpuestoPrecio r inner join fetch r.precios where r.precio = :id")
	List<StockTax> findByStockPriceId(@Param("id") BigInteger id);

}
