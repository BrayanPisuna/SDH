package com.inventariosecretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.inventariosecretaria.entity.Funcionario;
import com.inventariosecretaria.entity.Zona;
import com.inventariosecretaria.service.IFuncionarioService;
import com.inventariosecretaria.service.IZonaService;

@Controller
@RequestMapping("/views/funcionario")
public class FuncionarioController {
	
	
	@Autowired
	private IFuncionarioService funcionarioService;
	
	@Autowired
	private IZonaService zonaService;
	
	@GetMapping ("/")
	
	public String listarFuncionario(Model model) {
		
		List<Funcionario> listadoFuncionario = funcionarioService.listarTodo();
		
		model.addAttribute("funcionario", listadoFuncionario);
		
		return "/views/funcionario/Listarfuncionario";
	}
	
	////////////////////////////////////////////////////////
	
	@GetMapping("/create")
	public String crear(Model model) {
	
		Funcionario funcionario = new Funcionario();
		List<Zona> listarZona = zonaService.listarTodo();
		
		
		model.addAttribute("funcionario", funcionario);
		model.addAttribute("zona", listarZona);
		
		
		return "/views/funcionario/formulariofuncionario";
	}
	
	//////////////////////////////////////////////////////////
	
	@PostMapping("/save") 
	public String guardar(@ModelAttribute Funcionario funcionario) {
		 
		
		 funcionarioService.guardar(funcionario);
		 
	return "redirect:/views/funcionario/"; }
	
	//////////////////////////////////////////////////////////////
	
	@GetMapping("/edit/{idfuncionario}")
	public String editar(@PathVariable("idfuncionario") Long idFuncionario,Model model) {
		
		Funcionario funcionario = funcionarioService.buscarPorId(idFuncionario);
		
		List<Zona> listarZona = zonaService.listarTodo();
		
		
		
			model.addAttribute("funcionario", funcionario);
		
			model.addAttribute("zona", listarZona);
		
			
				

		return "/views/funcionario/formulariofuncionario";
	}

	
	
	
	

}
