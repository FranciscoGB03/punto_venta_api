package com.mishos.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mishos.entities.Presentation;
import com.mishos.entities.Tax;
import com.mishos.repositories.RepositoryPresentation;
import com.mishos.repositories.RepositoryTax;
import com.mishos.request.RequestFiltersImpuestos;
import com.mishos.request.RequestFiltersPresentation;
import com.mishos.services.ServiceProduct;

@Service
public class ServiceProductImpl implements ServiceProduct {
	
	@Autowired
	RepositoryPresentation repositoryPresentation;
	
	@Autowired
	RepositoryTax repositoryTax;

	@Override
	public List<Presentation> getPresentation() {
		List<Presentation> presentation = repositoryPresentation.findAll();
		return presentation;
	}

	@Override
	public List<Presentation> getPresentationsByFilters(RequestFiltersPresentation infoPresentation) {
		List<Presentation> presentation = repositoryPresentation.buscaPresentationsPorFiltros(infoPresentation);
		return presentation;
	}

	@Override
	public Presentation savePresentation(Presentation presentation) {
		Presentation newPresentation = repositoryPresentation.saveAndFlush(presentation);
		return newPresentation;
	}
	
	@Override
	public List<Presentation> savePresentations(List<Presentation> presentations) {
		List<Presentation> listPresentations = new ArrayList<Presentation>();
		Iterator<Presentation> ip = presentations.iterator();
		
		while(ip.hasNext()) {
			
			Presentation nuevo = repositoryPresentation.saveAndFlush((Presentation) ip.next());
			listPresentations.add(nuevo);
			
		}
		return listPresentations;
	}


	@Override
	public List<Tax> getTax() {
		List<Tax> tax = repositoryTax.findAll();
		return tax;
	}

	@Override
	public List<Tax> getTaxesByFilters(RequestFiltersImpuestos infoTax) {
		List<Tax> taxes = repositoryTax.buscaImpuestosPorFiltros(infoTax);
		return taxes;
	}

	@Override
	public Tax saveTax(Tax tax) {
		Tax newTax = repositoryTax.saveAndFlush(tax);
		return newTax;
	}
	
	@Override
	public List<Tax> saveTaxes(List<Tax> taxes) {
		List<Tax> listTaxes = new ArrayList<Tax>();
		Iterator<Tax> ip = taxes.iterator();
		
		while(ip.hasNext()) {
			
			Tax nuevo = repositoryTax.saveAndFlush((Tax) ip.next());
			listTaxes.add(nuevo);
			
		}
		return listTaxes;
	}
}
