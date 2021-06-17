package com.mishos.services;

import java.util.List;

import com.mishos.entities.Presentation;
import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersImpuestos;
import com.mishos.request.RequestFiltersPresentation;

public interface ServiceProduct {

	public List<Presentation> getPresentation();
	
	public List<Presentation> getPresentationsByFilters( RequestFiltersPresentation infoPresentation);
	
	public Presentation savePresentation( Presentation presentation);
	
	public List<Presentation> savePresentations( List<Presentation> presentations);
	

	public List<Tax> getTax();
	
	public List<Tax> getTaxesByFilters( RequestFiltersImpuestos infoTax);
	
	public Tax saveTax(Tax tax);
	
	public List<Tax> saveTaxes( List<Tax> taxes);
	
}
