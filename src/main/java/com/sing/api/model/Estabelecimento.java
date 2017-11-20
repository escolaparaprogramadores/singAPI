package com.sing.api.model;

import java.util.ArrayList;

public class Estabelecimento  {


	private String nome;
	private String cnpj;
	private String natureza_juridica;
	private String situacao;
	private String capital_social;
	private String status;
	private String message;
	private String tipo;
	private String abertura;
	private String fantasia	;
	private String uf;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String municipio;
	private String email;
	private String telefone;
	private String data_situacao;
	private ArrayList<Object> atividade_principal = new ArrayList<>();
	private ArrayList<Object> atividades_secundarias = new ArrayList<>();
	private ArrayList<Object> qsa = new ArrayList<>();
	
    
    
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNatureza_juridica() {
		return natureza_juridica;
	}
	public void setNatureza_juridica(String natureza_juridica) {
		this.natureza_juridica = natureza_juridica;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getCapital_social() {
		return capital_social;
	}
	public void setCapital_social(String capital_social) {
		this.capital_social = capital_social;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAbertura() {
		return abertura;
	}
	public void setAbertura(String abertura) {
		this.abertura = abertura;
	}
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getData_situacao() {
		return data_situacao;
	}
	public void setData_situacao(String data_situacao) {
		this.data_situacao = data_situacao;
	}



	public ArrayList<Object> getAtividade_principal() {
		return atividade_principal;
	}
	public void setAtividade_principal(ArrayList<Object> atividade_principal) {
		this.atividade_principal = atividade_principal;
	}
	
	public ArrayList<Object> getQsa() {
		return qsa;
	}
	public void setQsa(ArrayList<Object> qsa) {
		this.qsa = qsa;
	}
	public ArrayList<Object> getAtividades_secundarias() {
		return atividades_secundarias;
	}
	public void setAtividades_secundarias(ArrayList<Object> atividades_secundarias) {
		this.atividades_secundarias = atividades_secundarias;
	}





}
