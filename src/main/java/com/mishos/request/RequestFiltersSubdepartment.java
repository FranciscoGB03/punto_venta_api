package com.mishos.request;

import java.math.BigInteger;

public class RequestFiltersSubdepartment {

	private String nombre;
	private String estatus;
	private BigInteger departamento;
	
	public RequestFiltersSubdepartment(String nombre, String estatus, BigInteger departamento) {
		super();
		this.nombre = nombre;
		this.estatus = estatus;
		this.setDepartamento(departamento);
	}

	public RequestFiltersSubdepartment() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public BigInteger getDepartamento() {
		return departamento;
	}

	public void setDepartamento(BigInteger departamento) {
		this.departamento = departamento;
	}
}
