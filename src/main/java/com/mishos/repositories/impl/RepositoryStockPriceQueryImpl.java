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

import com.mishos.entities.StockPrice;
import com.mishos.repositories.RepositoryStockPriceQuery;
import com.mishos.request.RequestFiltersStockPrice;

@Repository
public class RepositoryStockPriceQueryImpl implements RepositoryStockPriceQuery{

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })	
	public List<StockPrice> searchStockPricesByFilters(RequestFiltersStockPrice filtros){

	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<StockPrice> stock = cq.from(StockPrice.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getProducto()!= null) { 
	    	predicates.add(qb.equal(stock.get("producto"), filtros.getProducto() )); 
	    } 

	    //query itself 
	    cq.select(stock).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
		
	}

}
