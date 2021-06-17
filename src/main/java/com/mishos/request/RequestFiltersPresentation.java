package com.mishos.request;

public class RequestFiltersPresentation {

	private String nombre;
	private String codigo;
	private String estatus;
	
	
	public RequestFiltersPresentation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestFiltersPresentation(String nombre, String codigo, String estatus) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.estatus = estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
