package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;
import com.generation.models.Celular;
import com.generation.services.AutoService;
import com.generation.services.CelularService;

@Controller
@RequestMapping("/compracelular")
public class CelularController {
	
	@Autowired
	CelularService celularService;
	
	@RequestMapping("")
	public String compraDeCelular(@ModelAttribute("celular") Celular celular) {
		return "compracelular.jsp";	
	}
	
	@PostMapping("/celular")
	public String guardarAlCarrito(@Valid @ModelAttribute("celular") Celular celular,
			BindingResult rescel,
			Model model) {
		
		if (rescel.hasErrors()) {
			model.addAttribute("msgError", "Indica bien el celular que deseas comprar");
			return "compracelular.jsp";
		} else {
			celularService.guardarCelular(celular);
			}
		List<Celular> listaCelulares = celularService.findAll();
		model.addAttribute("celularesDelCarrito", listaCelulares);
		return "carritocelulares.jsp";
		
	}
	
}
