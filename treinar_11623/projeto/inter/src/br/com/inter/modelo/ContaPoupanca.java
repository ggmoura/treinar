package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;

public class ContaPoupanca extends Conta {

	private Integer taxaRendimento;

	public Integer getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Integer taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
