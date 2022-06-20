package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")//Colocándolo acá es como dar un inicio de ruta por defecto
public class ParametrosRestController {
		//El signo de interrogacion indica desde donde se va a tomar el parametro
		//localhost:8080/api?fecha=20220613
		@RequestMapping("/")
		public String fecha(@RequestParam(value="") String fecha) {
			return "la fecha es:" + fecha;
		}
		
		@RequestMapping("/extend")
		public String extend(@RequestParam(value="") boolean extend) {
			return "la extension es:" + extend;
		}
		
		//localhost:8080/api/seccion?modulo=3&seccion=5
		//Deben estar los dos parámetros, son conmutativos
				@RequestMapping("/api/seccion")
				public String seccion(@RequestParam(value="modulo") String modulo,
						@RequestParam(value="seccion") String seccion) {
					return "el modulo es:" + modulo + "la seccion es:" + seccion;
				}
				
		/** RUTAS CON PARÁMETROS NO OBLIGATORIOS **/
		//localhost:8080/api/date?anio=2022&mes=6&dia=13 
		@RequestMapping("/date")
		public String capturaParametros(@RequestParam(value="anio", required=false)String anio,
				@RequestParam(value="mes", required=false)String mes,
				@RequestParam(value="dia", required=false)String dia
				) {
			if(anio != null) {
				System.out.println("El año es " + anio);
			}
			if(mes != null) {
				System.out.println("El año es " + mes);
			}
			if(dia != null) {
				System.out.println("El año es " + dia);
			}
			return anio + mes + dia;
		}
}
