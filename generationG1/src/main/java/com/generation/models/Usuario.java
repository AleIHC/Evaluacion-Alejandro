package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity//Es necesario para crear una tabla
@Table(name="usuarios")
public class Usuario {
	//Atributos
	@Id//Identificador, cada vez que se vaya a insertar se va a generar un número aleatorio a la primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=3, max=20)//Anotación que limita cantidad de caractéres 
	private String nombre;
	
	@Size(min=3, max=20)
	private String apellido;
	
	private Integer edad;
	
	@NotNull
	@Size(min=6, max=8)
	private String password;
	//Constructores
	
	public Usuario(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	//G&S
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
