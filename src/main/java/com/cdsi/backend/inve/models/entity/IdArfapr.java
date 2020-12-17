package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdArfapr implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="NO_CIA")
	private String cia;
	private String tipo;
	@Column(name="NO_ARTI")
	private String arti;
	public String getCia() {
		return cia;
	}
	public void setCia(String cia) {
		this.cia = cia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getArti() {
		return arti;
	}
	public void setArti(String arti) {
		this.arti = arti;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
