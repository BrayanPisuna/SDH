package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.AsignacionEquipo;



public interface IAsignacionEquipo {

	public List<AsignacionEquipo> listarTodo();
	public void guardar (AsignacionEquipo asignacionequipo);
	public AsignacionEquipo buscarPorId(Long idasignacionequipo);
	public void eliminar(Long idasignacionequipo);
	public List<AsignacionEquipo> filtrocedula(String cedula);
}
