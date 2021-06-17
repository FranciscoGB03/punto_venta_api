package com.mishos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mishos.entities.Department;
import com.mishos.entities.Subdepartment;
import com.mishos.request.RequestFiltersDepartment;
import com.mishos.request.RequestFiltersSubdepartment;

@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public interface ControllerDepartment {

	@RequestMapping(value = "/departments/getDepartments", method = RequestMethod.GET)
    @ResponseBody
	public List<Department> getDepartments();
	
	@RequestMapping(value = "/departments/getDepartmentsByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<Department> getDepartmentsByFilters(@RequestBody RequestFiltersDepartment infoDepartment);
	
	@RequestMapping(value = "/departments/saveDepartment", method = RequestMethod.POST)
	@ResponseBody
	public Department saveDepartment(@RequestBody Department department);
	
	@RequestMapping(value = "/departments/saveDepartments", method = RequestMethod.POST)
	@ResponseBody
	public List<Department> saveDepartments(@RequestBody List<Department> departments);
	
	
	
	@RequestMapping(value = "/subdepartments/getSubdepartments", method = RequestMethod.GET)
    @ResponseBody
	public List<Subdepartment> getSubdepartments();
	
	@RequestMapping(value = "/subdepartments/getSubdepartmentsByFilters", method = RequestMethod.POST)
    @ResponseBody
	public List<Subdepartment> getSubdepartmentsByFilters(@RequestBody RequestFiltersSubdepartment infoSubdepartment);
	
	@RequestMapping(value = "/subdepartments/saveSubdepartment", method = RequestMethod.POST)
	@ResponseBody
	public Subdepartment saveSubdepartment(@RequestBody Subdepartment subdepartment);
	
	@RequestMapping(value = "/subdepartments/saveSubdepartments", method = RequestMethod.POST)
	@ResponseBody
	public List<Subdepartment> saveSubdepartments(@RequestBody List<Subdepartment> subdepartments);
}
