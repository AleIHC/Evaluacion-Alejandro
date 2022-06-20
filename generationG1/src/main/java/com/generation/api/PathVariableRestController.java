package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var")
public class PathVariableRestController {
	/**Capturar variables desde la ruta o path*/
	
	
	//localhost:8080/var/anio/2022/mes/6/dia/13
	@RequestMapping("/anio/{a}/mes/{m}/dia/{d}")//Esto se hace para guardar variables desde el mismo request
	public String capturarVariablesPath(@PathVariable("a")String anio,
			@PathVariable("m") String mes,
			@PathVariable("d") String dia
			) {
		return "la fecha es: " + anio + " " + mes + " " + dia ;
	}
	
	//Se utiliza principalmente para los formularios que vayamos a hacer
	@RequestMapping("/fecha/{anio}/{mes}/{dia}")
	public String rutaCorta(@PathVariable("anio") String anio,
			@PathVariable("mes") String mes,
			@PathVariable("dia") String dia) {
		
		return "la fecha es: " + anio + " " + mes + " " + dia ;
	}

}

