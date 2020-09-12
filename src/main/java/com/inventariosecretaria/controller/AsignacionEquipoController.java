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

import com.inventariosecretaria.entity.AsignacionEquipo;
import com.inventariosecretaria.entity.Equipo;
import com.inventariosecretaria.entity.Funcionario;
import com.inventariosecretaria.service.IAsignacionEquipo;
import com.inventariosecretaria.service.IEquipoService;
import com.inventariosecretaria.service.IFuncionarioService;

@Controller
@RequestMapping("/views/asignacionequipo")
public class AsignacionEquipoController {

	@Autowired
	private IAsignacionEquipo asignacionequipoService;
	
	//ASIGNACION DE FUNCIONARIO ////
	
		@Autowired
		private IFuncionarioService funcionarioService;
		
		
		//ASIGNACION DE EQUIPO ///
		
		@Autowired
		private IEquipoService equipoService;
		
		//////////////////////////////////////////////////////////}
		
		@GetMapping ("/")
		
		public String listarFuncionario(Model model) {
			
			List<AsignacionEquipo> listadoAsignacionEquipo = asignacionequipoService.listarTodo();
			
			model.addAttribute("asignacionequipo", listadoAsignacionEquipo);
			
			return "/views/asignacionequipo/Listarasignacionequipo";
		}
		
	////////////////////////////////////////////////////////
			
	@GetMapping("/create")
	public String crear(Model model) {
	
	AsignacionEquipo asignacionequipo = new AsignacionEquipo();
	List<Funcionario> listarFuncionario = funcionarioService.listarTodo();
	List<Equipo> listarEquipo = equipoService.listarTodo();
	
	
	model.addAttribute("asignacionequipo", asignacionequipo);
	model.addAttribute("funcionario", listarFuncionario);
	model.addAttribute("equipo", listarEquipo);
	
	
	return "/views/asignacionequipo/formularioasignacionequipo";
	}
	
	///////////////////////////////////////////////////////////////
	@PostMapping("/save") 
	public String guardar(@ModelAttribute AsignacionEquipo asignacionequipo) {
		 
		
		 asignacionequipoService.guardar(asignacionequipo);
		 
	return "redirect:/views/asignacionequipo/"; }
	
	//////////////////////////////////////////////////////////////
	

	@GetMapping("/edit/{idasignacion}")
	public String editar(@PathVariable("idasignacion") Long idAsignacion,Model model) {
		
		AsignacionEquipo asignacionequipo = asignacionequipoService.buscarPorId(idAsignacion);
		List<Funcionario> listarFuncionario = funcionarioService.listarTodo();
		List<Equipo> listarEquipo = equipoService.listarTodo();		
			
		
		model.addAttribute("asignacionequipo", asignacionequipo);
		model.addAttribute("funcionario", listarFuncionario);
		model.addAttribute("equipo", listarEquipo);
	
		return "/views/asignacionequipo/formularioasignacionequipo";
	}
	
}
