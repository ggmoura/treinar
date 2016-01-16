package br.com.treinarminas.controller;

import br.com.treinarminas.bb.entitdade.AppException;
import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.core.ICaptalizavel;
import br.com.treinarminas.bb.entitdade.core.ITarifavel;
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

	public double recuperarSaldo(Integer numeroConta) {
		Conta conta = instance.recuperarConta(numeroConta);
		return conta.recuperarSaldo();
	}

	public void sacar(Double valor, Integer numeroConta) throws AppException {
		Conta conta = instance.recuperarConta(numeroConta);
		conta.sacar(valor);
	}

	public void efetuarDeposito(Double valor, Integer numeroConta) {
		Conta conta = instance.recuperarConta(numeroConta);
		conta.depositar(valor);
	}

	public void alterarTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

	public void captalizar() {
		Conta[] contas = instance.recuperarContas();
		for (Conta conta : contas) {
			if (conta != null && conta instanceof ICaptalizavel) {
				captalizar(((ICaptalizavel)conta));				
			}
		}
	}

	private void captalizar(ICaptalizavel iCaptalizavel) {
		//polimorfismo 
		iCaptalizavel.captalizar();
	}

	public void tarifar() {
		Conta[] contas = instance.recuperarContas();
		for (Conta conta : contas) {
			if (conta != null && conta instanceof ITarifavel) {
				tarifar(((ITarifavel)conta));
			}
		}
	}

	private void tarifar(ITarifavel iTarifavel) {
		//polimorfismo 
		iTarifavel.tarifar();
	}

	public Conta[] recuperarContas() {
		Conta[] contas = instance.recuperarContas();
		
		Integer qtdContas = 0;
		for (Conta conta : contas) {
			if (conta != null) {
				qtdContas++;
			}
		}
		Conta[] contasValidas = new Conta[qtdContas];
		Integer index = 0;
		for (Conta conta : contas) {
			if (conta != null) {
				contasValidas[index] = conta;
				index++;
			}
		}
		return contasValidas;
	}
	
	public void removerContaDoBanco(Integer numeroConta) {
		instance.excluirConta(numeroConta);
	}

}
