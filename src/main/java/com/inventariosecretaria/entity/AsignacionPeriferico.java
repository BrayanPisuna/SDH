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
@Table(name="asignacionperiferico")
public class AsignacionPeriferico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idasignacion;
	
	private String fechainicio;
	private String fechafin;
	private String observaciones;
	private String archivos;
	
	public String getArchivos() {
		return archivos;
	}

	public void setArchivos(String archivos) {
		this.archivos = archivos;
	}

	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario idfuncionario;
	
	@ManyToOne
	@JoinColumn(name="idperiferico")
	private Periferico idperiferico;

	public Long getIdasignacion() {
		return idasignacion;
	}

	public void setIdasignacion(Long idasignacion) {
		this.idasignacion = idasignacion;
	}

	public String getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}

	public String getFechafin() {
		return fechafin;
	}

	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Funcionario getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(Funcionario idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public Periferico getIdperiferico() {
		return idperiferico;
	}

	public void setIdperiferico(Periferico idperiferico) {
		this.idperiferico = idperiferico;
	}

	@Override
	public String toString() {
		return "AsignacionPeriferico [idasignacion=" + idasignacion + ", fechainicio=" + fechainicio + ", fechafin="
				+ fechafin + ", observaciones=" + observaciones + ", archivos=" + archivos + ", idfuncionario="
				+ idfuncionario + ", idperiferico=" + idperiferico + "]";
	}

	
	
	
	
	
}
