package com.generation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.models.Celular;

@Repository
public interface CelularRepository extends JpaRepository<Celular, Long>{

}
