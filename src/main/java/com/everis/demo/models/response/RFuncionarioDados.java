package com.everis.demo.models.response;

import com.everis.demo.enums.Sexo;
import com.everis.demo.models.Funcionario;

public class RFuncionarioDados {

	private String codigoFuncionario;
	private String nome;
	private String dataNascimento;
	private Sexo sexo;

	public RFuncionarioDados(Funcionario funcionario) {
		this.codigoFuncionario = funcionario.getCodigoFuncionario();
		this.nome = funcionario.getNome();
		this.dataNascimento = funcionario.getDataNascimento();
		this.sexo = funcionario.getSexo();
	}

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	

}
