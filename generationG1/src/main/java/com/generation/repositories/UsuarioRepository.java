package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Usuario;

@Repository
//Esta herencia nos va permitir trabajar con métodos que ya están definidos, también está el CRUD que es el abuelo de JPA
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{//JpaRepository<Objeto, Tipo_dato_PK>
	/************************LAS INTERFACES SOLO DEFINEN LOS METODOS**********************/
	/****ACA SE TRABAJA CON LA BASE DE DATOS, LOS QUERYS Y METODOS QUE PERMITEN CONECTARSE A LA BASE DE DATOS*********/
	/*********llamar al Repository (Inyeccion de dependencia) equivale a decirle al servidor "ejecuta esta query"*******/
}
