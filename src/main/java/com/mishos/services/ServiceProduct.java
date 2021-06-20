package com.mishos.services;

import java.util.List;

import com.mishos.entities.Presentation;
import com.mishos.entities.Product;
import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersTaxes;
import com.mishos.request.RequestFiltersPresentation;
import com.mishos.request.RequestFiltersProducts;

public interface ServiceProduct {

	public List<Presentation> getPresentation();
	
	public List<Presentation> getPresentationsByFilters( RequestFiltersPresentation infoPresentation);
	
	public Presentation savePresentation( Presentation presentation);
	
	public List<Presentation> savePresentations( List<Presentation> presentations);
	

	public List<Tax> getTax();
	
	public List<Tax> getTaxesByFilters( RequestFiltersTaxes infoTax);
	
	public Tax saveTax(Tax tax);
	
	public List<Tax> saveTaxes( List<Tax> taxes);
	
	
	public List<Product> getProduct();
	
	public List<Product> getProductsByFilters( RequestFiltersProducts infoProduct);
	
	public Product saveProduct(Product product);
	
	public List<Product> saveProducts( List<Product> products);
	
}
