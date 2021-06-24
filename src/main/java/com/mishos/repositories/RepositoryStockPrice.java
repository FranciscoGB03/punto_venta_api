package com.mishos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mishos.entities.StockPrice;

public interface RepositoryStockPrice extends JpaRepository<StockPrice, Integer>, RepositoryStockPriceQuery  {

}
