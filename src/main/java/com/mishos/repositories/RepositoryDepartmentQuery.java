package com.mishos.repositories;

import java.util.List;

import com.mishos.entities.Department;
import com.mishos.request.RequestFiltersDepartment;

public interface RepositoryDepartmentQuery {
	public List<Department> searchDepartmentsByFilters(RequestFiltersDepartment filtros);
}
