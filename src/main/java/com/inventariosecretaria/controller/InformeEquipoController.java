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
import com.inventariosecretaria.entity.InformeEquipo;
import com.inventariosecretaria.service.IEquipoService;
import com.inventariosecretaria.service.IInformeEquipoService;

@Controller
@RequestMapping("/views/informeequipo")
public class InformeEquipoController {

	@Autowired
	private IInformeEquipoService informeequipoService;
	
	@Autowired
	private IEquipoService equipoService;
	
	
	
	@GetMapping ("/")

	public String listarInforme(Model model) {

		List<InformeEquipo> listadoInformeEquipo = informeequipoService.listarTodo();

		model.addAttribute("informeequipo", listadoInformeEquipo);

		return "/views/informeequipo/ListarInformeequipo";
}
	/////////////////////////////////////////////////////////////
	
	
	@GetMapping("/create/{idequipo}")
	public String crear(@PathVariable("idequipo") Long idequipo, Model model) {
	
		InformeEquipo informeequipo = new InformeEquipo();
		List<Equipo> listarEquipo = equipoService.listarTodo();
		
		
		model.addAttribute("informeequipo", informeequipo);
		model.addAttribute("equipo", listarEquipo);
		model.addAttribute("idequipo", idequipo);
		
		
		return "/views/informeequipo/formularioinformeequipo";
	}

	
	/////////////////////////////////////////////////////////////////
	
	
	 @PostMapping("/save") 
	 public String guardar(@ModelAttribute InformeEquipo informeequipo) {
		 
		 	informeequipoService.guardar(informeequipo);
		
			return "redirect:/views/informeequipo/"; 
		 }
	 
	 
	
	
	
}
