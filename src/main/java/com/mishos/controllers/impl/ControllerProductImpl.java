package com.mishos.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mishos.controllers.ControllerProduct;
import com.mishos.entities.Presentation;
import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersImpuestos;
import com.mishos.request.RequestFiltersPresentation;
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
	public List<Tax> getTaxesByFilters( RequestFiltersImpuestos infoTax){
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
}
