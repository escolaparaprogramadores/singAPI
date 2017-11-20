package com.sing.api.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sing.api.model.Endereco;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;




@RestController
@RequestMapping("/endereco")
public class EnderecoResource {
	
	
	

private Endereco endereco;
	



	@GetMapping("/{cep}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CATEGORIA') and #oauth2.hasScope('read')")
	public ResponseEntity<Endereco> carregarEndereco(@PathVariable Long cep)
	{	
		Client c = Client.create();
		WebResource wr = c.resource("http://viacep.com.br/ws/" + cep + "/json/" );
		endereco = buscarEnderecoPor((wr.get(String.class)));
		return endereco != null ? ResponseEntity.ok(endereco) : ResponseEntity.notFound().build();
	}
	

	
	
    public Endereco buscarEnderecoPor(String urlJson) 
    {
	
        GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();	
		Endereco retornoEndereco = gson.fromJson(urlJson, Endereco.class);		
		return retornoEndereco;

    }

	
}
