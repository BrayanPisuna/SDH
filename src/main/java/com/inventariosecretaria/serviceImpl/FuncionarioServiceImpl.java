package com.inventariosecretaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventariosecretaria.entity.Funcionario;
import com.inventariosecretaria.repository.FuncionarioRepository;
import com.inventariosecretaria.service.IFuncionarioService;
@Service
public class FuncionarioServiceImpl implements IFuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public List<Funcionario> listarTodo() {
	
		return (List<Funcionario>) funcionarioRepository.findAll();
	}

	@Override
	public void guardar(Funcionario funcionario) {
		
		funcionarioRepository.save(funcionario);

	}

	@Override
	public Funcionario buscarPorId(Long idfuncionario) {
		
		return funcionarioRepository.findById(idfuncionario).orElse(null);
	}

	@Override
	public void eliminar(Long idfuncionario) {
	
		funcionarioRepository.deleteById(idfuncionario);

	}

}
