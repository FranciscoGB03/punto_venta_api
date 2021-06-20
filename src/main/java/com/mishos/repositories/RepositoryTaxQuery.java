package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Tax;
import com.mishos.request.RequestFiltersTaxes;

public interface RepositoryTaxQuery {
	
	public List<Tax> buscaImpuestosPorFiltros(RequestFiltersTaxes filtros);

}
