package com.mishos.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_presentacion")
public class Presentation implements Serializable{
	

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private int id;
	@Column(name = "codigo")
    private String codigo;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "estatus")
    private int estatus;
	
	
	public Presentation() {
		super();
	}
	
	public Presentation(int id, String codigo, String nombre, int estatus) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
		
}
