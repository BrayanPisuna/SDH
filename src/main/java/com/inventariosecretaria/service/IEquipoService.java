package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.Equipo;

public interface IEquipoService {
	public List<Equipo> listarTodo();
	public void guardar (Equipo equipo);
	public Equipo buscarPorId(Long idequipo);
	public void eliminar(Long idequipo);
}
