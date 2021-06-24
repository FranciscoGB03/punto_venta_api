package com.mishos.entities;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity(name = "ImpuestoPrecio")
@Table(name = "inv_precio_impuesto")
@IdClass(StockTaxId.class)
public class StockTax{
	
	@Id
    private BigInteger precio;
    
    @Id
    private BigInteger impuesto;
    
    @ManyToOne
    @JoinColumn(name = "precio", referencedColumnName = "id", insertable = false, updatable = false)
    private StockPrice precios;

    @ManyToOne
    @JoinColumn(name = "impuesto", referencedColumnName = "id", insertable = false, updatable = false)
    private Tax impuestos;

	public StockTax() {
		// TODO Auto-generated constructor stub
	}

	public StockTax(BigInteger precio, BigInteger impuesto, StockPrice precios, Tax impuestos) {
		super();
		this.precio = precio;
		this.impuesto = impuesto;
		this.precios = precios;
		this.impuestos = impuestos;
	}

	public BigInteger getPrecio() {
		return precio;
	}

	public void setPrecio(BigInteger precio) {
		this.precio = precio;
	}

	public BigInteger getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigInteger impuesto) {
		this.impuesto = impuesto;
	}

	public StockPrice getPrecios() {
		return precios;
	}

	public void setPrecios(StockPrice precios) {
		this.precios = precios;
	}

	public Tax getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(Tax impuestos) {
		this.impuestos = impuestos;
	}
	
	

}
