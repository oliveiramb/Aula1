package com.everis.demo.models;

import com.everis.demo.enums.Cargo;
import com.everis.demo.enums.Sexo;
import com.everis.demo.models.request.RCriarFuncionario;

public class Funcionario extends Pessoa {

	public Funcionario(String nome, String dataNascimento, Sexo sexo, String cpf, 
			String codigoFuncionario,
			Cargo cargo, float salario) {
		super(nome, dataNascimento, sexo, cpf);
		this.codigoFuncionario = codigoFuncionario;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}
	
	public Funcionario(RCriarFuncionario req) {
		super(req.getNome(), req.getDataNascimento(), req.getSexo(), req.getCpf());
		this.codigoFuncionario = req.getCodigoFuncionario();
		this.cargo = req.getCargo();
		this.salario = req.getSalario();
	}

	private String codigoFuncionario;
	private Cargo cargo;
	private float salario;

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
