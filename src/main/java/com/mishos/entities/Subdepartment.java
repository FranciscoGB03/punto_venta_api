package com.mishos.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cat_subDepartamento")
public class Subdepartment  implements Serializable{

    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private BigInteger id;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "estatus")
    private int estatus;
	
	@ManyToOne
	@JsonIgnoreProperties({"subdepartamento"})
	@JoinColumn(name = "departamento", referencedColumnName="id", foreignKey = @ForeignKey(name = "cat_subDepartamento_FK"), insertable=true, updatable=false)
	private Department departamento;
	
	public Subdepartment(BigInteger id, String nombre, int estatus, Department departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estatus = estatus;
		this.departamento = departamento;
	}
	public Subdepartment() {
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
	public Department getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}	
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
}
