package com.inventariosecretaria.service;

import java.util.List;

import com.inventariosecretaria.entity.Software;

public interface ISoftwareService {
	public List<Software> listarTodo();
	public void guardar (Software software);
	public Software buscarPorId(Long idsoftware);
	public void eliminar(Long idsoftware);
}
