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
@Table(name="funcionario")
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idfuncionario ;
	private String nombres ;
	private String apellidos ;
	private String cedula ;
	private String telefono ;
	private String correo ;
	private String cargo ;
	
	@ManyToOne
	@JoinColumn(name="idzonal")
	private Zona idzonal;

	public Long getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(Long idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Zona getIdzonal() {
		return idzonal;
	}

	public void setIdzonal(Zona idzonal) {
		this.idzonal = idzonal;
	}

	@Override
	public String toString() {
		return "Funcionario [idfuncionario=" + idfuncionario + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo + ", cargo=" + cargo
				+ ", idzonal=" + idzonal + "]";
	}
	
	
}
