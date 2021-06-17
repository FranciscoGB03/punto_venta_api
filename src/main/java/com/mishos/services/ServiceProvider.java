package com.mishos.services;

import java.util.List;

import com.mishos.entities.Provider;
import com.mishos.request.RequestFiltersProvider;


public interface ServiceProvider {
	
	public List<Provider> getProveedores();
	
	public List<Provider> getProvidersByFilters(RequestFiltersProvider infoProvider);
	
	public Provider saveProvider(Provider provider);
	
	public List<Provider> saveProviders(List<Provider> providers);
}
