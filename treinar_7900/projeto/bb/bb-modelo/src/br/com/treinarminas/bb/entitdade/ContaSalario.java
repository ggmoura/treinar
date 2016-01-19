package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class ContaSalario extends Conta {

	private static final long serialVersionUID = 1L;

	@Override
	public void sacar(Double valor) throws AppException {
		if (getSaldo() >= valor) {
			//calcula o valor do novo saldo
			Double novoSaldo = getSaldo() - valor;
			//atualiza o saldo
			setSaldo(novoSaldo);
		} else {
			throw new AppException(0);
		}
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
