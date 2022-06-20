package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Celular;
import com.generation.repositories.CelularRepository;



@Service
public class CelularService {
	@Autowired
	CelularRepository celularRepository;
	public void guardarCelular(@Valid Celular celular) {
		// TODO Auto-generated method stub
		celularRepository.save(celular);
	}
	public List<Celular> findAll() {
		// TODO Auto-generated method stub
		return celularRepository.findAll();
	}
}
