package com.sing.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sing.api.model.Pessoa;



public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
