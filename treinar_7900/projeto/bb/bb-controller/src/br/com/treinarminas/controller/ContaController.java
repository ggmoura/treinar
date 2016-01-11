package br.com.treinarminas.controller;

import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.util.BBSingleton;

public class ContaController {

	private BBSingleton instance;

	public ContaController() {
		instance = BBSingleton.getInstance();
	}

	public void cadastrarConta(Conta conta) {
		// o operador this faz referencia ao atributo da classe
		instance.gravarConta(conta);
	}

	public double recuperarSaldo() {
		Conta conta = instance.recuperarConta();
		return conta.recuperarSaldo();
	}

	public Boolean sacar(Double valor) {
		Conta conta = instance.recuperarConta();
		return conta.sacar(valor);
	}

	public void efetuarDeposito(Double valor) {
		Conta conta = instance.recuperarConta();
		conta.depositar(valor);
	}

	public void alterarTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

}
