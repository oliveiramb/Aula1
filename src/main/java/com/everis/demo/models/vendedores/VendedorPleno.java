package com.everis.demo.models.vendedores;

public class VendedorPleno extends Vendedor{

	@Override
	public float realizarVenda(float valorDaVenda) {
		int percentual = 20;
		int comissao = 30;
		return (valorDaVenda * (percentual/100)) + comissao;
	}
	
}
