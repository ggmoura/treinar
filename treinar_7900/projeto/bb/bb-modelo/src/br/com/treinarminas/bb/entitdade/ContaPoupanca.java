package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.core.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Double taxaRendimento;
	
	static {
		taxaRendimento = 0.05;
	}
	
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

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public void captalizar() {
		Double rendimento = getSaldo() * taxaRendimento;
		depositar(rendimento);
	}
}
