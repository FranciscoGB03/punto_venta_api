package com.mishos.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mishos.controllers.ControllerStock;
import com.mishos.entities.StockPrice;
import com.mishos.entities.StockTax;
import com.mishos.request.RequestFiltersStockPrice;
import com.mishos.services.ServiceStock;

@RestController
public class ControllerStockImpl implements ControllerStock{

	@Autowired
	private ServiceStock stockService;
	
	@Override
	public List<StockPrice> getStockPrices(){
		return this.stockService.getStockPrices();
	}
	
	@Override
	public List<StockPrice> getStockPricesByFilters(RequestFiltersStockPrice infoStockPrice){
		return this.stockService.getStockPricesByFilters(infoStockPrice);
	}
	
	@Override
	public StockPrice saveStockPrice(StockPrice stockPrice) {
		return this.stockService.saveStockPrice(stockPrice);
	}
	
	@Override
	public List<StockPrice> saveStockPrices(List<StockPrice> stockPrices){
		return this.stockService.saveStockPrices(stockPrices);
	}


	
	@Override
	public List<StockTax> getStockTaxes(){
		return this.stockService.getStockTaxes();
	}
	
	@Override
	public List<StockTax> getStockTaxesById(int infoStockTax){
		return this.stockService.getStockTaxesById(infoStockTax);
	}
	
	@Override
	public StockTax saveStockTax(StockTax stockTax) {
		return this.stockService.saveStockTax(stockTax);
	}
	
	@Override
	public List<StockTax> saveStockTaxes(List<StockTax> stockTaxes){
		return this.stockService.saveStockTaxes(stockTaxes);
	}
	
}
