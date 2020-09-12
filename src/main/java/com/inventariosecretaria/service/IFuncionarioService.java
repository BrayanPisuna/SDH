package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.Funcionario;

public interface IFuncionarioService {

	public List<Funcionario> listarTodo();
	public void guardar (Funcionario funcionario);
	public Funcionario buscarPorId(Long idfuncionario);
	public void eliminar(Long idfuncionario);
}
