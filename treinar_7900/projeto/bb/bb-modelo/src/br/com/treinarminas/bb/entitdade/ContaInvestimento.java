package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.core.ICaptalizavel;
import br.com.treinarminas.bb.entitdade.core.ITarifavel;

public class ContaInvestimento extends Conta implements ITarifavel, ICaptalizavel {

	private static final long serialVersionUID = 1L;

	private Double taxaManutencao;

	private Double taxaRendimento;

	@Override
	public void sacar(Double valor) throws AppException {
		if (getSaldo() >= valor) {
			// calcula o valor do novo saldo
			Double novoSaldo = getSaldo() - valor;
			// atualiza o saldo
			setSaldo(novoSaldo);
		} else {
			throw new AppException(0);
		}
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

	@Override
	public void tarifar() {
		try {
			sacar(taxaManutencao);
		} catch (AppException e) {
			System.out.println("comunicar diretoria");
		}
	}
	
	@Override
	public void captalizar() {
		depositar(getSaldo() * taxaRendimento);
	}
	
	@Override
	public String toString() {
		return "Conta Investimento - " + super.toString();
	}
	
	@Override
	public String csv() {
		StringBuilder csv = new StringBuilder(super.csv());
		csv.append(";").append(taxaManutencao);
		csv.append(";").append(taxaRendimento);
		csv.append(";").append(ContaInvestimento.class.getName());
		return csv.toString();
	}
	
}
