package com.sing.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sing.api.model.Lancamento;
import com.sing.api.repository.lancamento.LancamentoRepositoryQuery;



public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
