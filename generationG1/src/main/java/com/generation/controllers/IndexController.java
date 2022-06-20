package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Usuario;

@Controller
public class IndexController {
	/////////----IP----PUERTO---"/": RUTA a capturar
	//http://localhost:8080/
	@RequestMapping("/")//anotación para capturar las rutas
	public String index(Model model) {//El model sirve para enviar parámetros desde el controlador al jsp
		model.addAttribute("apellidos", "Heredia Castillo");
		model.addAttribute("nombres", "Alejandro Isaak");
		model.addAttribute("edad", 42);
		
		//instancia de usuario
		Usuario usuario = new Usuario("Yako", "Perro", 1 );
		//PAsando el objeto a la vista (Jsp)
		 model.addAttribute("usuario", usuario);
		 
		 return "index.jsp";
	}
	
	
	//http://localhost:8080*usuario
	//@RequestMapping("/usuario")
	/*@RequestMapping("/usuario")
	public String usuario() {
		return "estamos en la url usuario";
	}


	@RequestMapping("/usuario/inscrito")
	public String inscrito() {
		return "estamos en la url usuario/inscrito";
	}
	
	@RequestMapping("/cliente/registrado")
	public String cliente() {
		return "Ruta del cliente";
	}
	
	@RequestMapping(value = "/proveedor/registrado", method= RequestMethod.GET)
	public String proveedor() {
		return "Ruta del proveedor";
	}*/
}

