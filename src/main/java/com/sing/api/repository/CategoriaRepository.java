package com.sing.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sing.api.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
