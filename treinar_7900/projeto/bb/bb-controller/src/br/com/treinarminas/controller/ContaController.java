package br.com.treinarminas.controller;

import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.core.Conta;

public class ContaController {

	private Conta conta;

	public void cadastrarConta(Conta conta) {
		// o operador this faz referencia ao atributo da classe
		this.conta = conta;
	}

	public double recuperarSaldo() {
		return conta.recuperarSaldo();
	}

	public Boolean sacar(Double valor) {
		return conta.sacar(valor);
	}

	public void efetuarDeposito(Double valor) {
		conta.depositar(valor);
	}

	public void alterarTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

}
