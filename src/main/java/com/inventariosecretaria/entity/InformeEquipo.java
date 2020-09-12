package com.inventariosecretaria.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="informeequipo")
public class InformeEquipo implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idinformeequipo ;
	private String fecharequerimiento ;
	private String fechaatencion;
	private String personaencargada;
	private String novedadessolicitud ;
	private String actividades ;
	private String conclusiones ;
	private String archivos ;
	

	@OneToMany
	@JoinColumn(name="idequipo")
	private Equipo idequipo;


	public Long getIdinformeequipo() {
		return idinformeequipo;
	}


	public void setIdinformeequipo(Long idinformeequipo) {
		this.idinformeequipo = idinformeequipo;
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


	public Equipo getIdequipo() {
		return idequipo;
	}


	public void setIdequipo(Equipo idequipo) {
		this.idequipo = idequipo;
	}


	@Override
	public String toString() {
		return "InformeEquipo [idinformeequipo=" + idinformeequipo + ", fecharequerimiento=" + fecharequerimiento
				+ ", fechaatencion=" + fechaatencion + ", personaencargada=" + personaencargada
				+ ", novedadessolicitud=" + novedadessolicitud + ", actividades=" + actividades + ", conclusiones="
				+ conclusiones + ", archivos=" + archivos + ", idequipo=" + idequipo + "]";
	}

}
	