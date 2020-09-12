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

import com.inventariosecretaria.entity.Equipo;
import com.inventariosecretaria.service.IEquipoService;

@Controller
@RequestMapping("/views/equipo")
public class EquipoController {

	@Autowired
	private IEquipoService equipoService;
	
	/////////////////////////////////////////////////////////////////////
		
	@GetMapping ("/")
	public String listarEquipo(Model model) {
	
	List<Equipo> listadoEquipo = equipoService.listarTodo();
	
	model.addAttribute("equipo", listadoEquipo);
	
	return "/views/equipo/Listarequipo";
	}
		
	/////////////////////////////////////////////////////////////////////////
		
	@GetMapping ("/create")
	public String crear(Model model) {
	
	Equipo equipo = new Equipo();
	model.addAttribute("equipo", equipo);
	
	return "/views/equipo/formularioequipo";
	}
	
	/////////////////////////////////////////////////////////////////////

	@PostMapping("/save") 
	 public String guardar(@ModelAttribute Equipo equipo) {
		
		equipoService.guardar(equipo);
		
		return "redirect:/views/equipo/";
	}
	
	
	/////////////////////////////////////////////////////////////////////
	
	@GetMapping("/edit/{idequipo}")
	public String editar(@PathVariable("idequipo") Long idEquipo,Model model) {
		
		Equipo equipo= equipoService.buscarPorId(idEquipo);
		
		model.addAttribute("equipo", equipo);
		
		return "/views/equipo/formularioequipo";
	}
	
	
}
