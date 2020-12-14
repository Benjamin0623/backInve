package com.cdsi.backend.inve.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cdsi.backend.inve.models.entity.IdArticulo;

@Entity
@Table(name = "ARINDA1_VIEW")
public class StockLibroDTO {
	
	@Column
	private String no_cia;
	@Id
	private String no_arti;
	@Column
	private String descripcion;
	@Column
	private String medida;
	@Column
	private String marca;
	@Column
	private Double precio;
	@Column
	private Integer stock;
	@Column
	private Integer compromiso;
	@Column
	private String Vigente;
	@Column
	private String tipo_arti;
	@Column
	private String almacen;
	@Column
	private LocalDateTime fecha;
	
	
	
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}
	public String getVigente() {
		return Vigente;
	}
	public void setVigente(String vigente) {
		Vigente = vigente;
	}
	public String getTipo_arti() {
		return tipo_arti;
	}
	public void setTipo_arti(String tipo_arti) {
		this.tipo_arti = tipo_arti;
	}
	
	public String getNO_CIA() {
		return no_cia;
	}
	public void setNO_CIA(String nO_CIA) {
		no_cia = nO_CIA;
	}
	public String getNO_arti() {
		return no_arti;
	}
	public void setNO_arti(String nO_arti) {
		no_arti = nO_arti;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getCompromiso() {
		return compromiso;
	}
	public void setCompromiso(Integer compromiso) {
		this.compromiso = compromiso;
	}
	
	
}
