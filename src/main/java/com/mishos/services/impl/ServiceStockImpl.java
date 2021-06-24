package com.mishos.services.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mishos.entities.StockPrice;
import com.mishos.entities.StockTax;
import com.mishos.repositories.RepositoryStockPrice;
import com.mishos.repositories.RepositoryStockTax;
import com.mishos.request.RequestFiltersStockPrice;
import com.mishos.services.ServiceStock;

@Service
public class ServiceStockImpl implements ServiceStock{

	@Autowired 
	private RepositoryStockPrice repositoryStockPrice;
	
	@Autowired
	private RepositoryStockTax repositoryStockTax;

	@Override
	public List<StockPrice> getStockPrices(){
		List<StockPrice> stockPrices = repositoryStockPrice.findAll();
		return stockPrices;
	}
	
	@Override
	public List<StockPrice> getStockPricesByFilters(RequestFiltersStockPrice infoStockPrice){
		List<StockPrice> listStockPrices = repositoryStockPrice.searchStockPricesByFilters(infoStockPrice);
		return listStockPrices;
	}

	@Override
	public StockPrice saveStockPrice(StockPrice stockPrice){
		StockPrice newStockPrice = repositoryStockPrice.saveAndFlush(stockPrice);
		return newStockPrice;		
	}

	@Override
	public List<StockPrice> saveStockPrices(List<StockPrice> stockPrices){
		List<StockPrice> listStockPrices = new ArrayList<StockPrice>();
		Iterator<StockPrice> ip = stockPrices.iterator();
		
		while(ip.hasNext()) {
			
			StockPrice newStockPrice = repositoryStockPrice.saveAndFlush((StockPrice) ip.next());
			listStockPrices.add(newStockPrice);
			
		}
		return listStockPrices;		
	}
	
	@Override
	public List<StockTax> getStockTaxes(){
		List<StockTax> stockTaxes = repositoryStockTax.findAll();
		return stockTaxes;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StockTax> getStockTaxesById(int id){
		BigInteger bigId = BigInteger.valueOf(id);
		List<StockTax> stockTaxes = (List<StockTax>) repositoryStockTax.findByStockPriceId(bigId);
		return stockTaxes;
	}
	
	@Override
	public StockTax saveStockTax(StockTax stockTax) {
		StockTax newStockTax = repositoryStockTax.saveAndFlush(stockTax);		
		return newStockTax;
	}
	
	@Override
	public List<StockTax> saveStockTaxes(List<StockTax> stockTaxes){
		List<StockTax> listStockTaxes = new ArrayList<StockTax>();
		Iterator<StockTax> ip = stockTaxes.iterator();
		
		while(ip.hasNext()) {
			
			StockTax newStockTax = repositoryStockTax.saveAndFlush((StockTax) ip.next());
			listStockTaxes.add(newStockTax);
			
		}
		return listStockTaxes;		
	}
	
}
