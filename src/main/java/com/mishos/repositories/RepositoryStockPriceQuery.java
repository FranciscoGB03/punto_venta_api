package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.StockPrice;
import com.mishos.request.RequestFiltersStockPrice;

public interface RepositoryStockPriceQuery {
	public List<StockPrice> searchStockPricesByFilters(RequestFiltersStockPrice filtros);

}
