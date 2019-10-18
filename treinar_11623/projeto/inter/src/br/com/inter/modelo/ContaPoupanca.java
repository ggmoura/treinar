package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;

public class ContaPoupanca extends Conta {

	private static Float taxaRendimento;

	static {
		taxaRendimento = 0f;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo()- valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	public static Float getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public void render() {
		Double valorRendimento = getSaldo() * getTaxaRendimento();
		deposita(valorRendimento);
	}

}
