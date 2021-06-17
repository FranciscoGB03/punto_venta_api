package com.mishos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mishos.entities.Provider;
import com.mishos.request.RequestFiltersProvider;

@RequestMapping("/api/providers")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface ControllerProvider {
	
	@RequestMapping(value = "/getProviders", method = RequestMethod.GET)
    @ResponseBody
	public List<Provider> getProveedores();
	
	@RequestMapping(value = "/getProvidersByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<Provider> getProvidersByFilters(@RequestBody RequestFiltersProvider infoProvider);
	
	@RequestMapping(value = "/saveProvider", method = RequestMethod.POST)
	@ResponseBody
	public Provider saveProvider(@RequestBody Provider provider);
	
	@RequestMapping(value = "/saveProviders", method = RequestMethod.POST)
	@ResponseBody
	public List<Provider> saveProviders(@RequestBody List<Provider> providers);
	

}
