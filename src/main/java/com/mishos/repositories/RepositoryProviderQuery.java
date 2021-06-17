package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Provider;
import com.mishos.request.RequestFiltersProvider;

public interface RepositoryProviderQuery {
	public List<Provider> buscaProveedorPorFiltros(RequestFiltersProvider filtros);
}
