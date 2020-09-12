package com.inventariosecretaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventariosecretaria.entity.AsignacionPeriferico;
import com.inventariosecretaria.service.IAsignacionPeriferico;

@Controller
@RequestMapping("/views/cargo")
public class CargoController {

	@Autowired
	private IAsignacionPeriferico asignacionperifericoService;
	
	@GetMapping("/")
	public String home() {
		
		return "/views/cargo/Cargoequipos";
	}
	
	
	
	@RequestMapping(value="/filtrar/{cedula}", method = RequestMethod.GET)
	public String Filtrar(@PathVariable("cedula") String cedula, Model model) {
		
		List<AsignacionPeriferico> listadocedula = asignacionperifericoService.filtrarcedula(cedula);
		
		model.addAttribute("listadocedula", listadocedula);
		
		return  "/views/cargo/Cargoequipos" ;
	}
	
	
	
	
}
