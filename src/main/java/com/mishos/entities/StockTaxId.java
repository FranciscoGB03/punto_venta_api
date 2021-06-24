package com.mishos.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;

public class StockTaxId  implements Serializable {

    private static final long serialVersionUID = 1L;

	@Column(name = "precio")
    private BigInteger precio;

    @Column(name = "impuesto")
    private BigInteger impuesto;

	public StockTaxId() {
	}

	public StockTaxId(BigInteger precio, BigInteger impuesto) {
		this.precio = precio;
		this.impuesto = impuesto;
	}

	public BigInteger getPrecio() {
		return precio;
	}

	public void setPrecio(BigInteger precio) {
		this.precio = precio;
	}

	public BigInteger getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigInteger impuesto) {
		this.impuesto = impuesto;
	}

}
