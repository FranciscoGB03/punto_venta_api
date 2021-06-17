package com.mishos.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mishos.entities.Provider;
import com.mishos.repositories.RepositoryProvider;
import com.mishos.request.RequestFiltersProvider;
import com.mishos.services.ServiceProvider;


@Service
public class ServiceProviderImpl implements ServiceProvider {
	
	@Autowired
	private RepositoryProvider repositoryProvider;
	
	@Override
	public List<Provider> getProveedores() {
		//comenzando busqueda de proveedor
		List<Provider> proveedor = repositoryProvider.findAll();
		return proveedor;
	}
	
	@Override
	public List<Provider> getProvidersByFilters(RequestFiltersProvider infoProvider){
		//comenzando busqueda de proveedor por filtros 
    
		List<Provider> provider = repositoryProvider.buscaProveedorPorFiltros(infoProvider);
		return provider;
	}
	
	@Override
	public Provider saveProvider(Provider provider){
		//comenzando registro de proveedor 
	    
		Provider newProvider = repositoryProvider.saveAndFlush(provider);
		return newProvider;
	}
	
	@Override
	public List<Provider> saveProviders(List<Provider> providers){
		//comenzando registro de proveedor 
		List<Provider> listProviders = new ArrayList<Provider>();
		Iterator<Provider> ip = providers.iterator();
		
		while(ip.hasNext()) {
			
			Provider nuevo = repositoryProvider.saveAndFlush((Provider) ip.next());
			listProviders.add(nuevo);
			
		}
		return listProviders;
	}
}
