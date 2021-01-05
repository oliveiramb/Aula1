package com.everis.demo.models.request;

import com.everis.demo.enums.Cargo;

public class RAlterarFuncionario {

	private Cargo cargo;
	private float salario;

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
