package com.sing.api.repository.lancamento;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sing.api.model.Lancamento;
import com.sing.api.repository.filter.LancamentoFilter;
import com.sing.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery    {
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
