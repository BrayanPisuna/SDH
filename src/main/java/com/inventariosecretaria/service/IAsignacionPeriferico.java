package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.AsignacionPeriferico;



public interface IAsignacionPeriferico {

	public List<AsignacionPeriferico> listarTodo();
	public void guardar (AsignacionPeriferico asignacion);
	public AsignacionPeriferico buscarPorId(Long idasignacion);
	public void eliminar(Long idasignacion);
	public List<AsignacionPeriferico> filtrarcedula(String cedula);
	
}
