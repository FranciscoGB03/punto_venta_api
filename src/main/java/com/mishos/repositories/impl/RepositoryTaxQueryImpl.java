package com.mishos.repositories.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.mishos.entities.Tax;
import com.mishos.repositories.RepositoryTaxQuery;
import com.mishos.request.RequestFiltersImpuestos;

@Repository
public class RepositoryTaxQueryImpl implements RepositoryTaxQuery {

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Tax> buscaImpuestosPorFiltros(RequestFiltersImpuestos filtros){

	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Tax> tax = cq.from(Tax.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getNombre() != null && !filtros.getNombre() .equals("")) { 
	    	predicates.add(qb.like(tax.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    /*if (filtros.getVigencia() != null  && !filtros.getVigencia().equals("")) { 
	    	predicates.add(qb.literal(Timestamp.valueOf(LocalDateTime.now().compareTo(null))),
                    criteriaBuilder.currentTimestamp()));
		} */
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(tax.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    //query itself 
	    cq.select(tax).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
		
	}

}
