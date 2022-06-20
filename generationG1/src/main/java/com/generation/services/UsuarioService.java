package com.generation.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;
/**********************LÓGICA DE NEGOCIO O VALIDACIONES DEL SISTEMA*********************************/
@Service
public class UsuarioService {
	//Llamar al repository (Inyección de dependencia)
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void saveUsuario(@Valid Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	

	
	
}
