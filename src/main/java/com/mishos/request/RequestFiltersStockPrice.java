package com.mishos.request;

import java.math.BigInteger;

public class RequestFiltersStockPrice {

	private BigInteger producto;
	private BigInteger subdepartamento;
	
	public RequestFiltersStockPrice() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BigInteger getProducto() {
		return producto;
	}

	public void setProducto(BigInteger producto) {
		this.producto = producto;
	}

	public BigInteger getSubdepartamento() {
		return subdepartamento;
	}

	public void setSubdepartamento(BigInteger subdepartamento) {
		this.subdepartamento = subdepartamento;
	}
	
	
}
