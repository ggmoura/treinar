package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class ContaSalario extends Conta {

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			//calcula o valor do novo saldo
			Double novoSaldo = getSaldo() - valor;
			//atualiza o saldo
			setSaldo(novoSaldo);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void depositar(Double valor) {
		//atualiza o valor do saldo
		setSaldo(getSaldo() + valor);
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}
	
	@Override
	public String toString() {
		return "Conta Salário - " + super.toString();
	}
	

}
