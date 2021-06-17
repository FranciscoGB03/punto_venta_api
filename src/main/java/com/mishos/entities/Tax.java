package com.mishos.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_impuesto")
public class Tax{
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private BigInteger id;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "porcentaje")
    private BigDecimal porcentaje;
	@Column(name = "cantidad")
    private BigDecimal cantidad;
	@Column(name = "estatus")
    private int estatus;
	@Column(name = "vigenciaInicio")
    private Timestamp vigenciaInicio;
	@Column(name = "vigenciaFin")
    private Timestamp vigenciaFin;
	
	public Tax() {
		super();
	}

	public Tax(BigInteger id, String nombre, BigDecimal porcentaje, BigDecimal cantidad, int estatus, Timestamp vigenciaInicio, Timestamp vigenciaFin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.cantidad = cantidad;
		this.estatus = estatus;
		this.vigenciaInicio = vigenciaInicio;
		this.vigenciaFin = vigenciaFin;
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

	public BigDecimal getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getVigenciaInicio() {
		return vigenciaInicio;
	}

	public void setVigenciaInicio(Timestamp vigenciaInicio) {
		this.vigenciaInicio = vigenciaInicio;
	}

	public Timestamp getVigenciaFin() {
		return vigenciaFin;
	}

	public void setVigenciaFin(Timestamp vigenciaFin) {
		this.vigenciaFin = vigenciaFin;
	}

}
