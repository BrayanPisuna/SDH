package com.inventariosecretaria.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="zona")
public class Zona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idzonal ;
	private String tipo ;
	private String nombre ;
	private String provincia ;
	private String canton ;
	private String parroquia ;
	private String direccion ;
	public Long getIdzonal() {
		return idzonal;
	}
	public void setIdzonal(Long idzonal) {
		this.idzonal = idzonal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getParroquia() {
		return parroquia;
	}
	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Zona [idzonal=" + idzonal + ", tipo=" + tipo + ", nombre=" + nombre + ", provincia=" + provincia
				+ ", canton=" + canton + ", parroquia=" + parroquia + ", direccion=" + direccion + "]";
	}
	
	
	
}
