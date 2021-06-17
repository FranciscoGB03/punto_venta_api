package com.mishos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mishos.entities.Presentation;
import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersImpuestos;
import com.mishos.request.RequestFiltersPresentation;

@RequestMapping("/api/product")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface ControllerProduct {

	@RequestMapping(value = "/getPresentation", method = RequestMethod.GET)
    @ResponseBody
	public List<Presentation> getPresentation();
	
	@RequestMapping(value = "/getPresentationsByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<Presentation> getPresentationsByFilters(@RequestBody RequestFiltersPresentation infoPresentation);
	
	@RequestMapping(value = "/savePresentation", method = RequestMethod.POST)
	@ResponseBody
	public Presentation savePresentation(@RequestBody Presentation presentation);
	
	@RequestMapping(value = "/savePresentations", method = RequestMethod.POST)
	@ResponseBody
	public List<Presentation> savePresentations(@RequestBody List<Presentation> presentations);
	

	@RequestMapping(value = "/getTax", method = RequestMethod.GET)
    @ResponseBody
	public List<Tax> getTax();

	@RequestMapping(value = "/getTaxesByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<Tax> getTaxesByFilters(@RequestBody RequestFiltersImpuestos infoTax);

	@RequestMapping(value = "/saveTax", method = RequestMethod.POST)
	@ResponseBody
	public Tax saveTax(@RequestBody Tax tax);

	@RequestMapping(value = "/saveTaxes", method = RequestMethod.POST)
	@ResponseBody
	public List<Tax> saveTaxes(@RequestBody List<Tax> taxes);
}
