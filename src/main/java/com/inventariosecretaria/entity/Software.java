package com.inventariosecretaria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="software")
public class Software {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idsoftware ;
	private String descripcion ;
	private String tipo ;
	private String funcionalidad ;
	private String licencia ;
	
	@ManyToOne
	@JoinColumn(name="idequipo")
	private Equipo idequipo;

	public Long getIdsoftware() {
		return idsoftware;
	}

	public void setIdsoftware(Long idsoftware) {
		this.idsoftware = idsoftware;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Equipo getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(Equipo idequipo) {
		this.idequipo = idequipo;
	}

	@Override
	public String toString() {
		return "Software [idsoftware=" + idsoftware + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", funcionalidad=" + funcionalidad + ", licencia=" + licencia + ", idequipo=" + idequipo + "]";
	}
	
	
	
}
