package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersImpuestos;

public interface RepositoryTaxQuery {
	
	public List<Tax> buscaImpuestosPorFiltros(RequestFiltersImpuestos filtros);

}
