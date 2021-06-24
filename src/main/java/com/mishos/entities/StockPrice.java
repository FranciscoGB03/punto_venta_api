package com.mishos.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inv_precio")
public class StockPrice implements Serializable{

    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private BigInteger id;
	
	@Column(name = "costo")
    private BigDecimal costo;
	@Column(name = "ganancia")
    private BigDecimal ganancia;
	@Column(name = "precio")
    private BigDecimal precio;
	@Column(name = "inventario")
    private BigDecimal inventario;
	@Column(name = "estatus")
    private int estatus;
	@Column(name = "inicioVigencia")
    private Timestamp inicioVigencia;
	@Column(name = "finVigencia")
    private Timestamp finVigencia;
	
	
	@ManyToOne
	@JoinColumn(name = "producto", referencedColumnName="id", foreignKey = @ForeignKey(name = "inv_precio_FK"), insertable=true, updatable=true)
    private Product producto;
	

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "precios")  
    private List<StockTax> impuestos = new ArrayList<>();
	
	public StockPrice() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public BigDecimal getGanancia() {
		return ganancia;
	}

	public void setGanancia(BigDecimal ganancia) {
		this.ganancia = ganancia;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getInventario() {
		return inventario;
	}

	public void setInventario(BigDecimal inventario) {
		this.inventario = inventario;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public Timestamp getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Timestamp inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Timestamp getFinVigencia() {
		return finVigencia;
	}

	public void setFinVigencia(Timestamp finVigencia) {
		this.finVigencia = finVigencia;
	}

	public Product getProducto() {
		return producto;
	}

	public void setProducto(Product producto) {
		this.producto = producto;
	}

}
