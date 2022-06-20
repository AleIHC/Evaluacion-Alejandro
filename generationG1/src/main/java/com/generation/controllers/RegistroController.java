package com.generation.controllers;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {//localhost:8080/registros
	
	//Inyección de dependencias
	@Autowired
	UsuarioService usuarioService;
	
	//Agregar ruta para desplegar el jsp
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {//Con esto estamos pasando un objeto vacío, un objeto usuario pero vacío
		return "registro.jsp";
	}
		
		//ruta para capturar los datos del formulario
		@PostMapping("/usuario/respaldo")
		public String registroUsuario(@RequestParam(value="nombre") String nombre, 
				@RequestParam(value="apellido") String apellido,
				@RequestParam(value="edad") String edad) {
			System.out.println("estamos en el metodo de registro de usuario " + nombre);
			System.out.println("estamos en el metodo de registro de usuario " + apellido);
			System.out.println("estamos en el metodo de registro de usuario " + edad);
			return "registro.jsp";//la página a desplegar
	}
		
		
	@PostMapping("/usuario")
	public String guardarRegistro(@Valid @ModelAttribute("usuario") Usuario usuario, //Con esto estamos pasando un objeto vacío, un objeto usuario pero vacío
			BindingResult resultado,//Va al objeto usuario y pregunta, todos tus atributos cumplen con estas condiciones?
			Model model) {
		
		if (resultado.hasErrors()) {//Capturando si existe un error en el ingreso de datos
			model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
			return "registro.jsp";
		}
		//capturamos el objeto con los atributos
		System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getEdad());
		
		//Enviar el objeto al service, acá estamos pasando el objeto como parámetro
		usuarioService.saveUsuario(usuario);
		 
		return "index.jsp";
	}
}
