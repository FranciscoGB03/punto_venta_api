package com.mishos.services;

import java.util.List;

import com.mishos.entities.StockPrice;
import com.mishos.entities.StockTax;
import com.mishos.request.RequestFiltersStockPrice;

public interface ServiceStock {
	

	public List<StockPrice> getStockPrices();
	
	public List<StockPrice> getStockPricesByFilters(RequestFiltersStockPrice infoStockPrice);
	
	public StockPrice saveStockPrice(StockPrice stockPrice);
	
	public List<StockPrice> saveStockPrices(List<StockPrice> stockPrices);
	
	
	public List<StockTax> getStockTaxes();
	
	public List<StockTax> getStockTaxesById(int id);
	
	public StockTax saveStockTax(StockTax stockTax);
	
	public List<StockTax> saveStockTaxes(List<StockTax> stockTaxes);
}
