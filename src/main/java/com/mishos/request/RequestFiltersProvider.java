package com.mishos.request;

public class RequestFiltersProvider {
	
	private String nombre;
	private String razon;
	private String rfc;
	private String estatus;
	
	public RequestFiltersProvider(String nombre, String razon, String rfc, String estatus) {
		super();
		this.nombre = nombre;
		this.razon = razon;
		this.rfc = rfc;
		this.estatus = estatus;
	}
	
	public RequestFiltersProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
