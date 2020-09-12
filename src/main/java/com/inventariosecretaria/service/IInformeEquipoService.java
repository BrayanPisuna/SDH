package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.InformeEquipo;



public interface IInformeEquipoService {

	public List<InformeEquipo> listarTodo();
	public void guardar (InformeEquipo informeequipo);
	public InformeEquipo buscarPorId(Long idinformeequipo);
	public void eliminar(Long idinformeequipo);
}
