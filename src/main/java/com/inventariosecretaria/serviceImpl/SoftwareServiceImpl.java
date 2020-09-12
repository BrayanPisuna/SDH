package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.Software;
import com.inventariosecretaria.repository.SoftwareRepository;
import com.inventariosecretaria.service.ISoftwareService;
@Service
public class SoftwareServiceImpl implements ISoftwareService {

	@Autowired
	private SoftwareRepository softwareRepository;
	
	
	@Override
	public List<Software> listarTodo() {
	
		return (List<Software>) softwareRepository.findAll();
		
	}

	@Override
	public void guardar(Software software) {
	
		 softwareRepository.save(software);
			
	}

	@Override
	public Software buscarPorId(Long idsoftware) {

		return softwareRepository.findById(idsoftware).orElse(null);
		}

	@Override
	public void eliminar(Long idsoftware) {
		softwareRepository.deleteById(idsoftware);
		}

}
