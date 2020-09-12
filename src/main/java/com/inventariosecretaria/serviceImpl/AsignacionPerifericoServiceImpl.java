/**
 * 
 */
package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.AsignacionPeriferico;
import com.inventariosecretaria.repository.AsignacionPerifericoRepository;
import com.inventariosecretaria.service.IAsignacionPeriferico;

/**
 * @author Brayan Pisuña
 *
 */
@Service
public class AsignacionPerifericoServiceImpl implements IAsignacionPeriferico {

	
	@Autowired
	private AsignacionPerifericoRepository asignacionperifericoRepository;
	
	
	@Override
	public List<AsignacionPeriferico> listarTodo() {
		
		return (List<AsignacionPeriferico>)asignacionperifericoRepository.findAll();
	}

	@Override
	public void guardar(AsignacionPeriferico asignacion) {
		
		
		asignacionperifericoRepository.save(asignacion);
	}

	@Override
	public AsignacionPeriferico buscarPorId(Long idasignacion) {
		
		return asignacionperifericoRepository.findById(idasignacion).orElse(null);
	}

	@Override
	public void eliminar(Long idasignacion) {
		
		asignacionperifericoRepository.deleteById(idasignacion);

	}

	@Override
	public List<AsignacionPeriferico> filtrarcedula(String cedula) {
	
		return (List<AsignacionPeriferico>)asignacionperifericoRepository.filtrarcedula(cedula);
	}

}
