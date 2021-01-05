package com.everis.demo.models.vendedores;

public class VendedorSenior extends Vendedor {

	@Override
	public float realizarVenda(float valorDaVenda) {
		int percentual = 25;
		int comissao = 50;
		return (valorDaVenda * (percentual/100)) + comissao;
	}

}
