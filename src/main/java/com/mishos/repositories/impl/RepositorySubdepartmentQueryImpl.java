package com.mishos.repositories.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.mishos.entities.Subdepartment;
import com.mishos.repositories.RepositorySubdepartmentQuery;
import com.mishos.request.RequestFiltersSubdepartment;

@Repository
public class RepositorySubdepartmentQueryImpl implements RepositorySubdepartmentQuery{

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Subdepartment> searchSubdepartmentsByFilters(RequestFiltersSubdepartment filtros){

	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Subdepartment> subdepartment = cq.from(Subdepartment.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getNombre() != null && !filtros.getNombre().equals("")) { 
	    	predicates.add(qb.like(subdepartment.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(subdepartment.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    if (filtros.getDepartamento() != null && BigInteger.valueOf(0).compareTo(filtros.getDepartamento()) < 0) { 
	    	predicates.add(qb.equal(subdepartment.get("departamento"), filtros.getDepartamento()));
	    }
	    
	    //query itself 
	    cq.select(subdepartment).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
	}
}
