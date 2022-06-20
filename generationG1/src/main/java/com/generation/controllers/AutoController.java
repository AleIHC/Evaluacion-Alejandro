package com.generation.controllers;

import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Auto;
import com.generation.services.AutoService;


@Controller
@RequestMapping("/registroauto")
public class AutoController {//localhost:8080/registros
	
	//Inyección de dependencias
	@Autowired
	AutoService autoService;
	
	//Agregar ruta para desplegar el jsp
	@RequestMapping("")
	public String registroDeAuto(@ModelAttribute("auto") Auto auto) {
		return "registroauto.jsp";
	}
		
	@PostMapping("/auto")
	public String guardarRegistroAuto(@Valid @ModelAttribute("auto") Auto auto, //Pasar un objeto auto pero vacío
			BindingResult resultado,
			Model model) {
		
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Debe realizar ingreso corre0cto de los dato del auto");
			return "registroauto.jsp";
		} else {
		//Enviar el objeto al service
		autoService.saveAuto(auto);
		}
		//Obtener una lista de autos
		List<Auto> listaAutos = autoService.findAll();
		//Pasamos la lista de autos al jsp
		model.addAttribute("autosCapturados", listaAutos);
		return "mostrarauto.jsp";
	}
	
	//solo mostrar el listado de autos
			@RequestMapping("/mostrar")
			public String mostrar(Model model) {
				//obtener una lista de autos
				List<Auto> listaAutos = autoService.findAll();
				//pasamos la lista de autos al jsp
				model.addAttribute("autosCapturados", listaAutos);
				return "mostrarauto.jsp";
			}
			
			@RequestMapping("/editar/{id}")//Editar para el despliegue
			public String editar(@PathVariable("id") Long id,
					Model model) {
				System.out.println("el id es: "+id);
				Auto auto = autoService.buscarId(id);
				model.addAttribute("auto", auto);//El model es para pasar al jsp
				
				return "editarAuto.jsp";//Redireccionar a otra ruta o path
				
			}
			
		//localhost:8080/actualizar/{id} -> //Actualizar para la persistencia en la bd
			
			@PostMapping("/actualizar/{id}")
			public String actualizarAuto(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto, 
					BindingResult resultado,
					Model model) {
				System.out.println("El id al actualizar es: " + id);
				
				if (resultado.hasErrors()) {
					model.addAttribute("msgError", "Debe realizar ingreso corre0cto de los dato del auto");
					return "editarAuto.jsp";
				} else {
				auto.setId(id); //Agregar el id al objeto
				//Enviar el objeto al service
				autoService.saveAuto(auto);
				}
				//Obtener una lista de autos
				List<Auto> listaAutos = autoService.findAll();
				//Pasamos la lista de autos al jsp
				model.addAttribute("autosCapturados", listaAutos);
				return "mostrarauto.jsp";
			}
			
}
