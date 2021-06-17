package com.mishos.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mishos.controllers.ControllerProvider;
import com.mishos.entities.Provider;
import com.mishos.request.RequestFiltersProvider;
import com.mishos.services.ServiceProvider;


@RestController
public class ControllerProviderImpl implements ControllerProvider {
	
	@Autowired
	private ServiceProvider providerService;
	
	@Override
	public List<Provider> getProveedores() {
		return providerService.getProveedores();
	}
	
	@Override
	public List<Provider> getProvidersByFilters(RequestFiltersProvider infoProvider){
		return providerService.getProvidersByFilters(infoProvider);
	}
	
	@Override
	public Provider saveProvider(Provider provider) {
		return providerService.saveProvider(provider);
	}
	
	@Override
	public List<Provider> saveProviders(@RequestBody List<Provider> providers){
		return providerService.saveProviders(providers);
	}
}
