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

import com.mishos.entities.Presentation;
import com.mishos.repositories.RepositoryPresentationQuery;
import com.mishos.request.RequestFiltersPresentation;

@Repository
public class RepositoryPresentationQueryImpl implements RepositoryPresentationQuery {

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Presentation> buscaPresentationsPorFiltros(RequestFiltersPresentation filtros) {

	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Presentation> presentation = cq.from(Presentation.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getNombre() != null && !filtros.getNombre() .equals("")) { 
	    	predicates.add(qb.like(presentation.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    if (filtros.getCodigo() != null  && !filtros.getCodigo().equals("")) { 
	    	predicates.add(qb.like(presentation.get("codigo"),  "%" + filtros.getCodigo() + "%"));
		} 
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(presentation.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    //query itself 
	    cq.select(presentation).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
	}

}
