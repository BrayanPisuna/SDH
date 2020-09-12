package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.Equipo;
import com.inventariosecretaria.repository.EquipoRepository;
import com.inventariosecretaria.service.IEquipoService;

@Service
public class EquipoServiceImpl implements IEquipoService {
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	@Override
	public List<Equipo> listarTodo() {
		
		return (List<Equipo>) equipoRepository.findAll();
	}

	@Override
	public void guardar(Equipo equipo) {
	
		equipoRepository.save(equipo);
		
	}

	@Override
	public Equipo buscarPorId(Long idequipo) {

		return equipoRepository.findById(idequipo).orElse(null);
		
	}

	@Override
	public void eliminar(Long idequipo) {
		equipoRepository.deleteById(idequipo);
		
	}

}
