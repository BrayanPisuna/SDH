package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.InformePeriferico;
import com.inventariosecretaria.repository.InformePerifericoRepository;
import com.inventariosecretaria.service.IInformePerifericoService;

@Service
public class InformePerifericoServiceImpl implements IInformePerifericoService {

	@Autowired
	private InformePerifericoRepository informeperifericoRepository;
	
	///////////////////////////////////////////////////////////////////////
	
	@Override
	public List<InformePeriferico> listarTodo() {
		
		return (List<InformePeriferico>) informeperifericoRepository.findAll();
	}

	/////////////////////////////////////////////////////////////////////////
	@Override
	public void guardar(InformePeriferico informe) {
	
		informeperifericoRepository.save(informe);

	}

	////////////////////////////////////////////////////////////////////////
	@Override
	public InformePeriferico buscarPorId(Long idinforme) {
		
		return informeperifericoRepository.findById(idinforme).orElse(null);
	}
 
	/////////////////////////////////////////////////////////////////////////
	@Override
	public void eliminar(Long idinforme) {
		
		informeperifericoRepository.deleteById(idinforme);

	}

}
