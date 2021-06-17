package com.mishos.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.mishos.entities.Department;
import com.mishos.repositories.RepositoryDepartmentQuery;
import com.mishos.request.RequestFiltersDepartment;

@Repository
public class RepositoryDepartmentQueryImpl implements RepositoryDepartmentQuery{

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Department> searchDepartmentsByFilters(RequestFiltersDepartment filtros){

	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Department> department = cq.from(Department.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getNombre() != null && !filtros.getNombre() .equals("")) { 
	    	predicates.add(qb.like(department.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(department.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    //query itself 
	    cq.select(department).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
	}
}
