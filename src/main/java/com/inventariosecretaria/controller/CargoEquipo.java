package com.inventariosecretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventariosecretaria.entity.AsignacionEquipo;
import com.inventariosecretaria.service.IAsignacionEquipo;

@Controller
@RequestMapping("/views/cargoequipo")
public class CargoEquipo {

	@Autowired
	private IAsignacionEquipo asignacionequipoService;
	
	
	@GetMapping("/")
	public String home() {
		
		return "/views/cargoequipo/cargo";
	}
	
	@RequestMapping(value="/filtrar/{cedula}", method = RequestMethod.GET)
	public String Filtrar(@PathVariable("cedula") String cedula, Model model) {
		
		List<AsignacionEquipo> listadocedula = asignacionequipoService.filtrocedula(cedula);
		
		model.addAttribute("listadocedula", listadocedula);
		
		return  "/views/cargoequipo/cargo" ;
		
	}
	
	
	
	
}
