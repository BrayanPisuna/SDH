package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.Periferico;
import com.inventariosecretaria.repository.PerifericoRepository;
import com.inventariosecretaria.service.IPerifericoService;

@Service
public class PerifericoServiceImpl implements IPerifericoService {

	@Autowired
	private PerifericoRepository perifericoRepository;
	
	@Override
	public List<Periferico> listarTodo() {
		return (List<Periferico>) perifericoRepository.findAll();
	}

	@Override
	public void guardar(Periferico periferico) {
		perifericoRepository.save(periferico);

	}

	@Override
	public Periferico buscarPorId(Long idperiferico) {
		return perifericoRepository.findById(idperiferico).orElse(null);
	}

	@Override
	public void eliminar(Long idperiferico) {
		perifericoRepository.deleteById(idperiferico);
	}

}
