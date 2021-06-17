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

import com.mishos.entities.Provider;
import com.mishos.repositories.RepositoryProviderQuery;
import com.mishos.request.RequestFiltersProvider;

@Repository
class RepositoryProviderQueryImpl implements RepositoryProviderQuery{
	
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Provider> buscaProveedorPorFiltros(RequestFiltersProvider filtros){
		
	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Provider> proveedor = cq.from(Provider.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getNombre() != null && !filtros.getNombre() .equals("")) { 
	    	predicates.add(qb.like(proveedor.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    if (filtros.getRazon() != null  && !filtros.getRazon().equals("")) { 
	    	predicates.add(qb.like(proveedor.get("razonsocial"), "%" + filtros.getRazon() + "%")); 
	    } 
	    if (filtros.getRfc() != null  && !filtros.getRfc().equals("")) { 
	    	predicates.add(qb.like(proveedor.get("rfc"),  "%" + filtros.getRfc() + "%"));
		} 
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(proveedor.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    //query itself 
	    cq.select(proveedor).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
	}
}
