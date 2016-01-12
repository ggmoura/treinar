package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.core.ITarifavel;

public class ContaCorrente extends Conta implements ITarifavel {

	private Double limiteCreditoUtilizado;
	private Double limiteCreditoDisponivel;
	private Double taxaManutencao;

	public ContaCorrente() {
		super();
		limiteCreditoUtilizado = 0d;
	}

	@Override
	public void depositar(Double valor) {
		// atualiza o valor que ira para o saldo e o que ira
		// reconstituir o limite de credito entra no if se
		// o cliente estiver utilizando o limite de credito
		if (limiteCreditoUtilizado > 0) {
			// se o valor depositado for menor ou igual ao limite utilizado
			// nenhum valor ira compor o saldo [valor = 0] e todo o valor
			// depositado serah removido do limite utilizado
			if (valor <= limiteCreditoUtilizado) {
				limiteCreditoUtilizado -= valor;
				valor = 0d;
			} else {
				// remove do valor depositado a quantidade que estava sendo
				// utilizada no limite e zera o limite utilizado
				valor -= limiteCreditoUtilizado;
				limiteCreditoUtilizado = 0d;
			}
		}
		setSaldo(getSaldo() + valor);
	}

	public Boolean sacar(Double valor) {

		// regra de saque tarifado em um real
		valor += 1;

		Boolean sacou = Boolean.FALSE;
		if (valor <= getSaldo()) {

			setSaldo(getSaldo() - valor);

			sacou = Boolean.TRUE;
		} else if (valor <= (getSaldo() + (limiteCreditoDisponivel - limiteCreditoUtilizado))) {
			limiteCreditoUtilizado += (valor - getSaldo());
			setSaldo(0d);
			sacou = Boolean.TRUE;
		}

		return sacou;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo() + limiteCreditoDisponivel - limiteCreditoUtilizado;
	}

	public Double getLimiteCreditoUtilizado() {
		return limiteCreditoUtilizado;
	}

	public void setLimiteCreditoUtilizado(Double limiteCreditoUtilizado) {
		this.limiteCreditoUtilizado = limiteCreditoUtilizado;
	}

	public Double getLimiteCreditoDisponivel() {
		return limiteCreditoDisponivel;
	}

	public void setLimiteCreditoDisponivel(Double limiteCreditoDisponivel) {
		this.limiteCreditoDisponivel = limiteCreditoDisponivel;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void tarifar() {
		sacar(taxaManutencao);
	}
	
}
