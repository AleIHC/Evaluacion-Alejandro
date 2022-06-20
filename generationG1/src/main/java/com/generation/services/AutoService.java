package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

/**********************LÓGICA DE NEGOCIO O VALIDACIONES DEL SISTEMA*********************************/
@Service
public class AutoService {
	//Llamar al repository
	@Autowired
	AutoRepository autoRepository;
	
	public void saveAuto(@Valid Auto auto) {
		autoRepository.save(auto);
	}

	//Obtener lista de autos
	public List<Auto> findAll() {
		return autoRepository.findAll();//Retorna una lista el findAll
		
	}
	
	public Auto buscarId(Long id) {
		return autoRepository.findById(id).get();
	}

	
	
}
