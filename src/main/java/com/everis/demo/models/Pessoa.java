package com.everis.demo.models;

import com.everis.demo.enums.Sexo;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private Sexo sexo;
	private String cpf;

	public Pessoa(String nome, String dataNascimento, Sexo sexo, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public Pessoa() {
		// To do
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

}
