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

import com.inventariosecretaria.entity.AsignacionPeriferico;
import com.inventariosecretaria.entity.Funcionario;
import com.inventariosecretaria.entity.Periferico;
import com.inventariosecretaria.service.IAsignacionPeriferico;
import com.inventariosecretaria.service.IFuncionarioService;
import com.inventariosecretaria.service.IPerifericoService;


@Controller
@RequestMapping("/views/asignacionperiferico")
public class AsignacionPerifericoController {

	@Autowired
	private IAsignacionPeriferico asignacionperifericoService;

	
	//ASIGNACION DE FUNCIONARIO ////
	
	@Autowired
	private IFuncionarioService funcionarioService;
	
	
	//ASIGNACION DE PERIFERICO ///
	
	@Autowired
	private IPerifericoService perifericoService;
	
	
	@GetMapping ("/")
	
	public String listarFuncionario(Model model) {
		
		List<AsignacionPeriferico> listadoAsignacionPeriferico = asignacionperifericoService.listarTodo();
		
		model.addAttribute("asignacionperiferico", listadoAsignacionPeriferico);
		
		return "/views/asignacionperiferico/Listarasignacionperiferico";
	}
	
	
	@GetMapping("/create")
	public String crear( Model model) {
	
		AsignacionPeriferico asignacionperiferico = new AsignacionPeriferico();
		List<Funcionario> listarFuncionario = funcionarioService.listarTodo();
		List<Periferico> listarPeriferico = perifericoService.listarTodo();
		
		
		model.addAttribute("asignacionperiferico", asignacionperiferico);
		model.addAttribute("funcionario", listarFuncionario);
		model.addAttribute("periferico", listarPeriferico);

		
		return "/views/asignacionperiferico/formularioasignacionperiferico";
	}
	
		
	
	//////////////////////////////////////////////////////////
	
	@PostMapping("/save") 
	public String guardar(@ModelAttribute AsignacionPeriferico asignacion) {
		 
		
		 asignacionperifericoService.guardar(asignacion);
		 
	return "redirect:/views/asignacionperiferico/"; }
	
	//////////////////////////////////////////////////////////////
	
	
	@GetMapping("/edit/{idasignacion}")
	public String editar(@PathVariable("idasignacion") Long idAsignacion,Model model) {
		
		AsignacionPeriferico asignacionperiferico = asignacionperifericoService.buscarPorId(idAsignacion);
		List<Funcionario> listarFuncionario = funcionarioService.listarTodo();
		List<Periferico> listarPeriferico = perifericoService.listarTodo();
				
			model.addAttribute("asignacionperiferico", asignacionperiferico);
			model.addAttribute("funcionario", listarFuncionario);
			model.addAttribute("periferico", listarPeriferico);
			
	
		return "/views/asignacionperiferico/formularioasignacionperiferico";
	}
}
