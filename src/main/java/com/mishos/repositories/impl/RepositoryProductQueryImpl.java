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

import com.mishos.entities.Product;
import com.mishos.repositories.RepositoryProductQuery;
import com.mishos.request.RequestFiltersProducts;

@Repository
public class RepositoryProductQueryImpl implements RepositoryProductQuery{

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Product> buscaProductosPorFiltros(RequestFiltersProducts filtros){
		
	    CriteriaBuilder qb = em.getCriteriaBuilder(); 
	    CriteriaQuery cq = qb.createQuery(); 
	    Root<Product> product = cq.from(Product.class); 

	    //Constructing list of parameters 
	    List<Predicate> predicates = new ArrayList<Predicate>(); 

	    //Adding predicates in case of parameter not being null 
	    if (filtros.getCodigoBarras() != null  && !filtros.getCodigoBarras().equals("")) { 
	    	predicates.add(qb.equal(product.get("codigoBarras"), filtros.getCodigoBarras())); 
	    } 
	    if (filtros.getNombre() != null && !filtros.getNombre() .equals("")) { 
	    	predicates.add(qb.like(product.get("nombre"), "%" + filtros.getNombre() + "%" )); 
	    } 
	    if (filtros.getProveedor() != null) { 
	    	predicates.add(qb.equal(product.get("proveedor"), filtros.getProveedor())); 
	    } 
	    if (filtros.getSubDepartamento() != null) { 
	    	predicates.add(qb.equal(product.get("subDepartamento"), filtros.getSubDepartamento()));
		} 
	    if (filtros.getEstatus() != null) { 
	    	predicates.add(qb.equal(product.get("estatus"), Integer.valueOf(filtros.getEstatus()))); 
		} 
	    //query itself 
	    cq.select(product).where(predicates.toArray(new Predicate[]{})); 
	    //execute query and do something with result 
	    return em.createQuery(cq).getResultList(); 
		
	}

}
