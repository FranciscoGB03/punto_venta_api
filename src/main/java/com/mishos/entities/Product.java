package com.mishos.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cat_producto")
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private BigInteger id;
	@Column(name = "codigoBarras")
    private String codigoBarras;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "estatus")
    private int estatus;
	@Column(name = "fechaAlta")
    private Timestamp fechaAlta;
	@Column(name = "fechaBaja")
    private Timestamp fechaBaja;
	

	@ManyToOne
	@JoinColumn(name = "presentacion", referencedColumnName="id", foreignKey = @ForeignKey(name = "cat_producto_FK_2"), insertable=true, updatable=true)
	private Presentation presentacion;
	

	@ManyToOne
	@JoinColumn(name = "subDepartamento", referencedColumnName="id", foreignKey = @ForeignKey(name = "cat_producto_FK_1"), insertable=true, updatable=true)
	private Subdepartment subDepartamento;
	

	@ManyToOne
	@JoinColumn(name = "proveedor", referencedColumnName="id", foreignKey = @ForeignKey(name = "cat_producto_FK"), insertable=true, updatable=true)
	private Provider proveedor;
	
	public Product() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
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

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Timestamp getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Presentation getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(Presentation presentacion) {
		this.presentacion = presentacion;
	}

	public Subdepartment getSubDepartamento() {
		return subDepartamento;
	}

	public void setSubDepartamento(Subdepartment subDepartamento) {
		this.subDepartamento = subDepartamento;
	}

	public Provider getProveedor() {
		return proveedor;
	}

	public void setProveedor(Provider proveedor) {
		this.proveedor = proveedor;
	}
	
}
