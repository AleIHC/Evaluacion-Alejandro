package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="celulares")
public class Celular {
	@Id//Para generar Id cada vez que se añada
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private String os;
	
	private Float precio;
	
	//Constructor sin parámetros
	public Celular() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con parámetros
	public Celular(Long id, String marca, String modelo, String os, Float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.os = os;
		this.precio = precio;
	}

	
	//Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}


	
	
	
}
