package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;

public class ContaInvestimento extends Conta {

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo()- valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
}
