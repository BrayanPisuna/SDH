package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.AsignacionEquipo;
import com.inventariosecretaria.repository.AsignacionEquipoRepository;
import com.inventariosecretaria.service.IAsignacionEquipo;
@Service
public class AsignacionEquipoServiceImpl implements IAsignacionEquipo {

	
	@Autowired
	private AsignacionEquipoRepository asignacionequipoRepository;
	
	
	@Override
	public List<AsignacionEquipo> listarTodo() {
		
		return (List<AsignacionEquipo>)asignacionequipoRepository.findAll();
	}

	@Override
	public void guardar(AsignacionEquipo asignacionequipo) {
		
		asignacionequipoRepository.save(asignacionequipo);
	}

	@Override
	public AsignacionEquipo buscarPorId(Long idasignacionequipo) {
		
		return asignacionequipoRepository.findById(idasignacionequipo).orElse(null);
	}

	@Override
	public void eliminar(Long idasignacionequipo) {
		
		asignacionequipoRepository.deleteById(idasignacionequipo);
	}

	@Override
	public List<AsignacionEquipo> filtrocedula(String cedula) {
		// TODO Auto-generated method stub
		return (List<AsignacionEquipo>)asignacionequipoRepository.filtrocedula(cedula);
	}

	
}
