package com.mishos.entities;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cat_departamento")
public class Department {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private BigInteger id;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "estatus")
    private int estatus;
	
	@JsonIgnore
	@OneToMany(mappedBy="departamento")
    private Set<Subdepartment> subdepartamento;
	
	public Department(BigInteger id, String nombre, int estatus, Set<Subdepartment> subdepartamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estatus = estatus;
		this.subdepartamento = subdepartamento;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
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
    public Set<Subdepartment> getSubdepartamento() {
        return subdepartamento;
    }
    public void setSubdepartamento(Set<Subdepartment> subdepartamento) {
        this.subdepartamento = subdepartamento;
    }
	
}
