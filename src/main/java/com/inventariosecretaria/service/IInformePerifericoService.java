package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.InformePeriferico;



public interface IInformePerifericoService {

	public List<InformePeriferico> listarTodo();
	public void guardar (InformePeriferico informe);
	public InformePeriferico buscarPorId(Long idinforme);
	public void eliminar(Long idinforme);
}
