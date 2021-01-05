package com.everis.demo.models.vendedores;

import com.everis.demo.interfaces.IVendedor;
import com.everis.demo.models.Funcionario;

public class Vendedor extends Funcionario implements IVendedor {

	@Override
	public float realizarVenda(float valorDaVenda) {
		int percentual = 20;
		return valorDaVenda * (percentual/100);
	}

	
	
}
