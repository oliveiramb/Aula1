package com.everis.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.demo.models.Funcionario;
import com.everis.demo.models.request.RAlterarFuncionario;
import com.everis.demo.models.request.RCriarFuncionario;
import com.everis.demo.models.response.RFuncionarioDados;
import com.everis.demo.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	FuncionarioService funcionarioService;

	@GetMapping("/")
	Funcionario listar() {
		return funcionarioService.gerarFuncionario();
	}

	@PostMapping("/")
	Funcionario criar(@RequestBody RCriarFuncionario req) {
		return funcionarioService.gerarFuncionario(req);
	}

	@PutMapping("/{id}")
	Funcionario alterar(@PathVariable String id, @RequestBody RAlterarFuncionario req) {

		Funcionario funcionario = funcionarioService.gerarFuncionario();
		funcionario.setCargo(req.getCargo());
		funcionario.setSalario(req.getSalario());
		funcionario.setCodigoFuncionario(id);

		return funcionario;

	}

	@GetMapping("/{id}/dados")
	RFuncionarioDados getFuncionarioDados(@PathVariable String id) {

		Funcionario funcionario = funcionarioService.gerarFuncionario();

		return new RFuncionarioDados(funcionario);
	}

}