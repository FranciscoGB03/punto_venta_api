package com.mishos.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mishos.controllers.ControllerProduct;
import com.mishos.entities.Presentation;
import com.mishos.entities.Product;
import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersTaxes;
import com.mishos.request.RequestFiltersPresentation;
import com.mishos.request.RequestFiltersProducts;
import com.mishos.services.ServiceProduct;

@RestController
public class ControllerProductImpl implements ControllerProduct{
	
	@Autowired
	private ServiceProduct productService;

	@Override
	public List<Presentation> getPresentation() {
		return productService.getPresentation();
	}
	
	@Override
	public List<Presentation> getPresentationsByFilters(RequestFiltersPresentation infoPresentation){
		return productService.getPresentationsByFilters(infoPresentation);
	}
	
	@Override
	public Presentation savePresentation(Presentation presentation) {
		return productService.savePresentation(presentation);
	}
	
	@Override
	public List<Presentation> savePresentations(List<Presentation> presentations){
		return productService.savePresentations(presentations);
	}
	
	

	@Override
	public List<Tax> getTax(){
		return productService.getTax();
	}
	
	@Override
	public List<Tax> getTaxesByFilters( RequestFiltersTaxes infoTax){
		return productService.getTaxesByFilters(infoTax);
	}
	
	@Override
	public Tax saveTax(Tax tax) {
		return productService.saveTax(tax);
	}
	
	@Override
	public List<Tax> saveTaxes( List<Tax> taxes){
		return productService.saveTaxes(taxes);
	}
	

	@Override
	public List<Product> getProduct(){
		return productService.getProduct();
	}
	
	@Override
	public List<Product> getProductsByFilters( RequestFiltersProducts infoProduct){
		return productService.getProductsByFilters(infoProduct);
	}
	
	@Override
	public Product saveProduct(Product product) {
		return productService.saveProduct(product);
	}
	
	@Override
	public List<Product> saveProducts( List<Product> products){
		return productService.saveProducts(products);
	}
}
