package br.com.treinar.avancado.aula.excecao;

import br.com.treinar.avancado.aula.Conta;

public class Caixa {

	
	@SuppressWarnings("deprecation")
	public void sacar(Conta c, Double valor) throws SaldoInsuficienteException {
		c.sacar(valor);
	}
	
	
}
