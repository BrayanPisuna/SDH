package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.Zona;



public interface IZonaService {

	public List<Zona> listarTodo();
	public void guardar (Zona zona);
	public Zona buscarPorId(Long idzona);
	public void eliminar(Long idzona);
	
}
