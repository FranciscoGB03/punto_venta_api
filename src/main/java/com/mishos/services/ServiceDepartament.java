package com.mishos.services;

import java.util.List;

import com.mishos.entities.Department;
import com.mishos.entities.Subdepartment;
import com.mishos.request.RequestFiltersDepartment;
import com.mishos.request.RequestFiltersSubdepartment;

public interface ServiceDepartament {
	
	public List<Department> getDepartments();
	
	public List<Department> getDepartmentsByFilters(RequestFiltersDepartment infoDepartment);
	
	public Department saveDepartment(Department department);
	
	public List<Department> saveDepartments(List<Department> departments);
	

	public List<Subdepartment> getSubdepartments();
	
	public List<Subdepartment> getSubdepartmentsByFilters(RequestFiltersSubdepartment infoSubdepartment);
	
	public Subdepartment saveSubdepartment(Subdepartment subdepartment);
	
	public List<Subdepartment> saveSubdepartments(List<Subdepartment> subdepartments);
}
