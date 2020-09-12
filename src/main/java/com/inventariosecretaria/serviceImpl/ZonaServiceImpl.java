package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.Zona;
import com.inventariosecretaria.repository.ZonaRepository;
import com.inventariosecretaria.service.IZonaService;

@Service
public class ZonaServiceImpl implements IZonaService {
	
	@Autowired
	private ZonaRepository zonaRepository;
	
	@Override
	public List<Zona> listarTodo() {
		
		return (List<Zona>) zonaRepository.findAll();
	}

	@Override
	public void guardar(Zona zona) {
		
		zonaRepository.save(zona);
	}

	@Override
	public Zona buscarPorId(Long idzona) {

		return zonaRepository.findById(idzona).orElse(null);
		
	}

	@Override
	public void eliminar(Long idzona) {
		
		zonaRepository.deleteById(idzona);

	}

}
