package com.sing.api.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sing.api.model.Estabelecimento;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;










@RestController
@RequestMapping("/empresa")
public class EstabelecimentoResource {
	
	
	

private Estabelecimento estabelecimento;
	



	@GetMapping("/{cep}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CATEGORIA') and #oauth2.hasScope('read')")
	public ResponseEntity<Estabelecimento> carregarEndereco(@PathVariable Long cep)
	{	
		Client c = Client.create();
		WebResource wr = c.resource("https://www.receitaws.com.br/v1/cnpj/"  + cep );
		estabelecimento = buscarEnderecoPor((wr.get(String.class)));
		return estabelecimento != null ? ResponseEntity.ok(estabelecimento) : ResponseEntity.notFound().build();
	}
	

	
	
    public Estabelecimento buscarEnderecoPor(String urlJson) 
    {
	
        GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();	
		Estabelecimento retornoEstabelecimento = gson.fromJson(urlJson, Estabelecimento.class);		
		return retornoEstabelecimento;

    }

	
}
