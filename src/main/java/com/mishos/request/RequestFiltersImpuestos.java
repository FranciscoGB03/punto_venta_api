package com.mishos.request;

public class RequestFiltersImpuestos {

	private String nombre;
	private String vigencia;
	private String estatus;
		
	public RequestFiltersImpuestos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestFiltersImpuestos(String nombre, String vigencia, String estatus) {
		super();
		this.nombre = nombre;
		this.vigencia = vigencia;
		this.estatus = estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
}
