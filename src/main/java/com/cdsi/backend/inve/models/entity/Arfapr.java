package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arfapr implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArfapr idArfa;
	private String moneda;
	
	public IdArfapr getIdArfa() {
		return idArfa;
	}
	public void setIdArfa(IdArfapr idArfa) {
		this.idArfa = idArfa;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
