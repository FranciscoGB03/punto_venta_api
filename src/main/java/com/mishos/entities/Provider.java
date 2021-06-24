package com.mishos.entities;
import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "cat_proveedor")
public class Provider implements Serializable{
	

    private static final long serialVersionUID = 1L;
		
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private BigInteger id;
	@Column(name = "rfc")
    private String rfc;
	@Column(name = "nombre")
    private String nombre;
	@Column(name = "razonsocial")
    private String razonsocial;
	@Column(name = "contacto")
    private String contacto;
	@Column(name = "emailcontacto")
    private String emailcontacto;
	@Column(name = "telefonocontacto")
    private String telefonocontacto;
	@Column(name = "estatus")
    private int estatus;
	
	
    
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEmailcontacto() {
		return emailcontacto;
	}

	public void setEmailContacto(String emailcontacto) {
		this.emailcontacto = emailcontacto;
	}

	public String getTelefonocontacto() {
		return telefonocontacto;
	}

	public void setTelefonoContacto(String telefonocontacto) {
		this.telefonocontacto = telefonocontacto;
	}
	
	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
    
}
