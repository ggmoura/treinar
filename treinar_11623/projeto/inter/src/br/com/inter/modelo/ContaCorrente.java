package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;

public class ContaCorrente extends Conta {

	private Double limiteCredito;

	public ContaCorrente() {
		this.limiteCredito = 0d;
	}

	@Override
	public Boolean sacar(Double valor) {
		valor += 1;
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void deposita(Double valor) {
		// faz depositar diferente.
		super.deposita(valor);
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
