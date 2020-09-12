package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.Periferico;

public interface IPerifericoService {

	public List<Periferico> listarTodo();
	public void guardar (Periferico periferico);
	public Periferico buscarPorId(Long idperiferico);
	public void eliminar(Long idperiferico);
	
}
