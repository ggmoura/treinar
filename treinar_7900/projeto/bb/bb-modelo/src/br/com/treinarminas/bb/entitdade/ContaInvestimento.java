package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class ContaInvestimento extends Conta {

	private Double taxaManutencao;

	private Double taxaRendimento;

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			// calcula o valor do novo saldo
			Double novoSaldo = getSaldo() - valor;
			// atualiza o saldo
			setSaldo(novoSaldo);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void depositar(Double valor) {
		// atualiza o valor do saldo
		setSaldo(getSaldo() + valor);
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
