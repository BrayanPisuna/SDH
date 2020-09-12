package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.InformeEquipo;
import com.inventariosecretaria.repository.InformeEquipoRepository;
import com.inventariosecretaria.service.IInformeEquipoService;
@Service
public class InformeEquipoServiceImpl implements IInformeEquipoService {

	@Autowired
	private InformeEquipoRepository informeequipoRepository;
	
	
	@Override
	public List<InformeEquipo> listarTodo() {
		
		return (List<InformeEquipo>) informeequipoRepository.findAll();
		
	}

	@Override
	public void guardar(InformeEquipo informeequipo) {
		
		informeequipoRepository.save(informeequipo);

	}

	@Override
	public InformeEquipo buscarPorId(Long idinformeequipo) {

		
		return informeequipoRepository.findById(idinformeequipo).orElse(null);
	
	}

	@Override
	public void eliminar(Long idinformeequipo) {

		informeequipoRepository.deleteById(idinformeequipo);
		}

}
