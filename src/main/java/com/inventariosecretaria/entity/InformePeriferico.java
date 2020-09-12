package com.inventariosecretaria.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="informeperiferico")
public class InformePeriferico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idinforme ;
	private String fecharequerimiento ;
	private String fechaatencion;
	private String personaencargada;
	private String novedadessolicitud ;
	private String actividades ;
	private String conclusiones ;
	private String archivos ;
	
	
	@ManyToOne
	@JoinColumn(name="idperiferico")
	private Periferico idperiferico;


	public Long getIdinforme() {
		return idinforme;
	}


	public void setIdinforme(Long idinforme) {
		this.idinforme = idinforme;
	}


	public String getFecharequerimiento() {
		return fecharequerimiento;
	}


	public void setFecharequerimiento(String fecharequerimiento) {
		this.fecharequerimiento = fecharequerimiento;
	}


	public String getFechaatencion() {
		return fechaatencion;
	}


	public void setFechaatencion(String fechaatencion) {
		this.fechaatencion = fechaatencion;
	}


	public String getPersonaencargada() {
		return personaencargada;
	}


	public void setPersonaencargada(String personaencargada) {
		this.personaencargada = personaencargada;
	}


	public String getNovedadessolicitud() {
		return novedadessolicitud;
	}


	public void setNovedadessolicitud(String novedadessolicitud) {
		this.novedadessolicitud = novedadessolicitud;
	}


	public String getActividades() {
		return actividades;
	}


	public void setActividades(String actividades) {
		this.actividades = actividades;
	}


	public String getConclusiones() {
		return conclusiones;
	}


	public void setConclusiones(String conclusiones) {
		this.conclusiones = conclusiones;
	}


	public String getArchivos() {
		return archivos;
	}


	public void setArchivos(String archivos) {
		this.archivos = archivos;
	}


	public Periferico getIdperiferico() {
		return idperiferico;
	}


	public void setIdperiferico(Periferico idperiferico) {
		this.idperiferico = idperiferico;
	}


	@Override
	public String toString() {
		return "InformePeriferico [idinforme=" + idinforme + ", fecharequerimiento=" + fecharequerimiento
				+ ", fechaatencion=" + fechaatencion + ", personaencargada=" + personaencargada
				+ ", novedadessolicitud=" + novedadessolicitud + ", actividades=" + actividades + ", conclusiones="
				+ conclusiones + ", archivos=" + archivos + ", idperiferico=" + idperiferico + "]";
	}


	
}
