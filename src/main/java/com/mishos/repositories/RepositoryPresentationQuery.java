package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Presentation;
import com.mishos.request.RequestFiltersPresentation;

public interface RepositoryPresentationQuery {
	public List<Presentation> buscaPresentationsPorFiltros(RequestFiltersPresentation filtros);

}
