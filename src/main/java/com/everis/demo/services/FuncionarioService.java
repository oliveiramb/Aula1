package com.everis.demo.services;

import org.springframework.stereotype.Component;

import com.everis.demo.enums.Cargo;
import com.everis.demo.enums.Sexo;
import com.everis.demo.models.Funcionario;
import com.everis.demo.models.request.RCriarFuncionario;

@Component
public class FuncionarioService {

	public Funcionario gerarFuncionario() {

		String nomeCompleto = "Marcos Bruno";
		final String cpf = "12345678919";

		Funcionario funcionario1 = new Funcionario(nomeCompleto, "01/01/1991", Sexo.HOMEM, cpf, "1234", Cargo.VENDEDOR, 22_231_000);

		return funcionario1;
		
	}
	
	public Funcionario gerarFuncionario(RCriarFuncionario req) {
		
		return new Funcionario(req);
		
	}

}
