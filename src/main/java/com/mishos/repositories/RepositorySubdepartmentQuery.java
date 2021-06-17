package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Subdepartment;
import com.mishos.request.RequestFiltersSubdepartment;

public interface RepositorySubdepartmentQuery {
	public List<Subdepartment> searchSubdepartmentsByFilters(RequestFiltersSubdepartment filtros);

}
