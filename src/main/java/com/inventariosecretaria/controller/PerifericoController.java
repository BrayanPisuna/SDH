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

import com.inventariosecretaria.entity.Periferico;
import com.inventariosecretaria.service.IPerifericoService;





@Controller
@RequestMapping("/views/periferico")
public class PerifericoController {

	// LISTAR PERIFERICO//
	
	@Autowired
	private IPerifericoService perifericoService;
		
			@GetMapping ("/")
			public String listarPeriferico(Model model) {
				
				List<Periferico> listadoPeriferico = perifericoService.listarTodo();
				
				model.addAttribute("perifericos", listadoPeriferico);
				
				return "/views/periferico/Listarperiferico";
			}
			
			/////////////////////ASIGNACION EN BUSQUEDA /////////////////////////////////
			@GetMapping ("/asignacion")
			public String listarPeri(Model model) {
				
				List<Periferico> listadoPeriferico = perifericoService.listarTodo();
				
				model.addAttribute("perifericos", listadoPeriferico);
				
				return "/views/periferico/listarasignacion";
			}
		
			//////////////////////////////////////////////////////////////////////////////
			
			//// CREAR PERIFERICO //
			@GetMapping ("/create")
			public String crear(Model model) {
				
				Periferico periferico = new Periferico();
				model.addAttribute("periferico", periferico);
				
				return "/views/periferico/formularioperiferico";
			}
			
			///GUARDAR//
			
			 @PostMapping("/save") 
			 public String guardar(@ModelAttribute Periferico periferico) {
				perifericoService.guardar(periferico);
				return "redirect:/views/periferico/";
			}
			 
			 ///EDITAR//
			 
				@GetMapping("/edit/{idperiferico}")
				public String editar(@PathVariable("idperiferico") Long idPeriferico,Model model) {
					
					Periferico periferico = perifericoService.buscarPorId(idPeriferico);
					
					model.addAttribute("periferico", periferico);
					
					return "/views/periferico/formularioperiferico";
				}
				
			//ELIMINAR//
				
				@GetMapping("/delete/{idperiferico}")
				public String eliminar(@PathVariable("idperiferico") Long idPeriferico) {
					
					perifericoService.eliminar(idPeriferico);
					
					return "redirect:/views/periferico/";
					
				}
			

	
	
	}
