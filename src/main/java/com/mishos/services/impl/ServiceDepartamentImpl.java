package com.mishos.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mishos.entities.Department;
import com.mishos.entities.Subdepartment;
import com.mishos.repositories.RepositoryDepartament;
import com.mishos.repositories.RepositorySubdepartment;
import com.mishos.request.RequestFiltersDepartment;
import com.mishos.request.RequestFiltersSubdepartment;
import com.mishos.services.ServiceDepartament;


@Service
public class ServiceDepartamentImpl implements ServiceDepartament{
	
	@Autowired 
	private RepositoryDepartament repositoryDepartment;
	
	@Autowired
	private RepositorySubdepartment repositorySubdepartment;
	
	@Override
	public List<Department> getDepartments(){
		List<Department> departments = repositoryDepartment.findAll();
		return departments;
	}
	
	@Override
	public List<Department> getDepartmentsByFilters(RequestFiltersDepartment infoDepartment){
		List<Department> listDepartments = repositoryDepartment.searchDepartmentsByFilters(infoDepartment);
		return listDepartments;
	}
	
	@Override
	public Department saveDepartment(Department department) {
		Department newDepartment = repositoryDepartment.saveAndFlush(department);
		return newDepartment;
	}
	
	@Override
	public List<Department> saveDepartments(List<Department> departments){
		List<Department> listDepartments = new ArrayList<Department>();
		Iterator<Department> ip = departments.iterator();
		
		while(ip.hasNext()) {
			
			Department newDepartment = repositoryDepartment.saveAndFlush((Department) ip.next());
			listDepartments.add(newDepartment);
			
		}
		return listDepartments;
	}
	

	
	@Override
	public List<Subdepartment> getSubdepartments(){
		List<Subdepartment> subdepartments = repositorySubdepartment.findAll();
		return subdepartments;
	}
	
	@Override
	public List<Subdepartment> getSubdepartmentsByFilters(RequestFiltersSubdepartment infoSubdepartment){
		List<Subdepartment> listDepartments = repositorySubdepartment.searchSubdepartmentsByFilters(infoSubdepartment);
		return listDepartments;
	}
	
	@Override
	public Subdepartment saveSubdepartment(Subdepartment subdepartment) {
		Subdepartment newDepartment = repositorySubdepartment.saveAndFlush(subdepartment);
		return newDepartment;
	}
	
	@Override
	public List<Subdepartment> saveSubdepartments(List<Subdepartment> subdepartments){
		List<Subdepartment> listSubdepartments = new ArrayList<Subdepartment>();
		Iterator<Subdepartment> ip = subdepartments.iterator();
		
		while(ip.hasNext()) {
			
			Subdepartment newDepartment = repositorySubdepartment.saveAndFlush((Subdepartment) ip.next());
			listSubdepartments.add(newDepartment);
			
		}
		return listSubdepartments;
	}
}
