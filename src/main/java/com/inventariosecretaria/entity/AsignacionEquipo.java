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
@Table(name="asignacionequipo", schema = "")
public class AsignacionEquipo implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idasignacionequipo;
	
	private String fechainicio;
	private String fechafin;
	private String observaciones;
	private String archivos ;
	
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
	@JoinColumn(name="idequipo")
	private Equipo idequipo;

	public Long getIdasignacionequipo() {
		return idasignacionequipo;
	}

	public void setIdasignacionequipo(Long idasignacionequipo) {
		this.idasignacionequipo = idasignacionequipo;
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

	public Equipo getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(Equipo idequipo) {
		this.idequipo = idequipo;
	}

	@Override
	public String toString() {
		return "AsignacionEquipo [idasignacionequipo=" + idasignacionequipo + ", fechainicio=" + fechainicio
				+ ", fechafin=" + fechafin + ", observaciones=" + observaciones + ", archivos=" + archivos
				+ ", idfuncionario=" + idfuncionario + ", idequipo=" + idequipo + "]";
	}

	
	
	
}
