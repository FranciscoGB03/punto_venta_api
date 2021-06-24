package com.mishos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mishos.entities.StockPrice;
import com.mishos.entities.StockTax;
import com.mishos.request.RequestFiltersStockPrice;

@RequestMapping("/api/stock")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface ControllerStock {

	@RequestMapping(value = "/getStockPrice", method = RequestMethod.GET)
    @ResponseBody
	public List<StockPrice> getStockPrices();

	@RequestMapping(value = "/getStockPricesByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<StockPrice> getStockPricesByFilters(@RequestBody RequestFiltersStockPrice infoStockPrice);

	@RequestMapping(value = "/saveStockPrice", method = RequestMethod.POST)
    @ResponseBody
	public StockPrice saveStockPrice(@RequestBody StockPrice stockPrice);

	@RequestMapping(value = "/saveStockPrices", method = RequestMethod.POST)
    @ResponseBody
	public List<StockPrice> saveStockPrices(@RequestBody List<StockPrice> stockPrices);
	


	@RequestMapping(value = "/getStockTax", method = RequestMethod.GET)
    @ResponseBody
	public List<StockTax> getStockTaxes();

	@RequestMapping(value = "/getStockTaxesById", method = RequestMethod.POST)
    @ResponseBody
	public List<StockTax> getStockTaxesById(@RequestBody int id);

	@RequestMapping(value = "/saveStockTax", method = RequestMethod.POST)
    @ResponseBody
	public StockTax saveStockTax(@RequestBody StockTax stockTax);

	@RequestMapping(value = "/saveStockTaxes", method = RequestMethod.POST)
    @ResponseBody
	public List<StockTax> saveStockTaxes(@RequestBody List<StockTax> stockTaxes);
}
