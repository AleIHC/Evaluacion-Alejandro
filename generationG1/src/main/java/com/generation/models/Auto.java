package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="autos")
public class Auto {
	@Id//Para generar Id cada vez que se añada
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String brand;
	private String modelo;
	private String color;
	
	private Integer año;

	//Constructor con parámetros
	public Auto(Long id, String brand, String modelo, String color, @Size(min = 4, max = 4) Integer año) {
		super();
		this.brand = brand;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
	}

	//Constructor sin parámetros
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getters y Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}
	
	
}
