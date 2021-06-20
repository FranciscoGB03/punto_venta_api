package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Product;
import com.mishos.request.RequestFiltersProducts;

public interface RepositoryProductQuery {
	
	public List<Product> buscaProductosPorFiltros(RequestFiltersProducts filtros);

}
