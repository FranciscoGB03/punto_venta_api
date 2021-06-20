package com.mishos.request;

import java.math.BigInteger;

public class RequestFiltersProducts {
	

	private String codigoBarras;
	private String nombre;
	private BigInteger subDepartamento;
	private BigInteger proveedor;
	private String estatus;

	
	public RequestFiltersProducts(String codigoBarras, String nombre, BigInteger subDepartamento, BigInteger proveedor) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.subDepartamento = subDepartamento;
		this.proveedor = proveedor;
	}

	public RequestFiltersProducts() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigInteger getSubDepartamento() {
		return subDepartamento;
	}

	public void setSubDepartamento(BigInteger subDepartamento) {
		this.subDepartamento = subDepartamento;
	}

	public BigInteger getProveedor() {
		return proveedor;
	}

	public void setProveedor(BigInteger proveedor) {
		this.proveedor = proveedor;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
