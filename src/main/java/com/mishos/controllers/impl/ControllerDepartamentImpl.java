package com.mishos.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mishos.controllers.ControllerDepartment;
import com.mishos.entities.Department;
import com.mishos.entities.Subdepartment;
import com.mishos.request.RequestFiltersDepartment;
import com.mishos.request.RequestFiltersSubdepartment;
import com.mishos.services.ServiceDepartament;

@RestController
public class ControllerDepartamentImpl implements ControllerDepartment{
	
	@Autowired
	private ServiceDepartament departamentoService;
	
	@Override
	public List<Department> getDepartments(){
		return this.departamentoService.getDepartments();
	}
	
	@Override
	public List<Department> getDepartmentsByFilters(RequestFiltersDepartment infoDepartment){
		return this.departamentoService.getDepartmentsByFilters(infoDepartment);
	}
	
	@Override
	public Department saveDepartment(Department department) {
		return this.departamentoService.saveDepartment(department);
	}
	
	@Override
	public List<Department> saveDepartments(List<Department> departments){
		return this.departamentoService.saveDepartments(departments);
	}

	@Override
	public List<Subdepartment> getSubdepartments(){
		return this.departamentoService.getSubdepartments();
	}
	
	@Override
	public List<Subdepartment> getSubdepartmentsByFilters(RequestFiltersSubdepartment infoSubdepartment){
		return this.departamentoService.getSubdepartmentsByFilters(infoSubdepartment);
	}
	
	@Override
	public Subdepartment saveSubdepartment(Subdepartment subdepartment) {
		return this.departamentoService.saveSubdepartment(subdepartment);
	}
	
	@Override
	public List<Subdepartment> saveSubdepartments(List<Subdepartment> subdepartments){
		return this.departamentoService.saveSubdepartments(subdepartments);
	}
}
