package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;

public class ContaCorrente extends Conta {

	private Double limiteCredito;

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
