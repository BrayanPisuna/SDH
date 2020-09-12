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


import com.inventariosecretaria.entity.InformePeriferico;
import com.inventariosecretaria.entity.Periferico;
import com.inventariosecretaria.service.IInformePerifericoService;
import com.inventariosecretaria.service.IPerifericoService;




@Controller
@RequestMapping("/views/informeperiferico")
public class InformePerifericoController {

	@Autowired
	private IInformePerifericoService informeperifericoService;
	
	@Autowired
	private IPerifericoService perifericoService;
	
	
@GetMapping ("/")
	
	public String listarInforme(Model model) {
		
		List<InformePeriferico> listadoInformes = informeperifericoService.listarTodo();
		
		model.addAttribute("informe", listadoInformes);
		
		return "/views/informeperiferico/Listarinforme";
	}
	
		@GetMapping("/create/{idperiferico}")
		public String crear(@PathVariable("idperiferico") Long idperiferico, Model model) {
		
			InformePeriferico informe = new InformePeriferico();
			List<Periferico> listarPeriferico = perifericoService.listarTodo();
			
			
			model.addAttribute("informe", informe);
			model.addAttribute("periferico", listarPeriferico);
			model.addAttribute("idperiferico", idperiferico);
			
			
			return "/views/informeperiferico/formularioinforme";
		}

	
		@PostMapping("/save") 
		public String guardar(@ModelAttribute InformePeriferico informe) {
			 
			
			 informeperifericoService.guardar(informe);
			 
		
			 
		return "redirect:/views/informeperiferico/"; }
	
		
		
		
		
	
}
