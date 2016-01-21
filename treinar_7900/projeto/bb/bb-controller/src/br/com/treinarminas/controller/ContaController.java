package br.com.treinarminas.controller;

import java.io.IOException;
import java.util.List;

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
		List<Conta> contas = instance.recuperarContas();
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
		List<Conta> contas = instance.recuperarContas();
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

	public List<Conta> recuperarContas() {
		List<Conta> contas = instance.recuperarContas();
		return contas;
	}
	
	public void removerContaDoBanco(Integer numeroConta) {
		instance.excluirConta(numeroConta);
	}

	public void fecharPrograma() throws IOException {
		instance.gravarContas();
	}
	
}
