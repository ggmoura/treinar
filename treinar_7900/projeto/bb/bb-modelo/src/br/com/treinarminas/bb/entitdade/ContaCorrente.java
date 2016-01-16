package br.com.treinarminas.bb.entitdade;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.core.ITarifavel;

public class ContaCorrente extends Conta implements ITarifavel {

	private static final long serialVersionUID = 1L;
	
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

	public void sacar(Double valor) throws AppException {

		// regra de saque tarifado em um real
		valor += 1;

		if (valor <= getSaldo()) {

			setSaldo(getSaldo() - valor);

		} else if (valor <= (getSaldo() + (limiteCreditoDisponivel - limiteCreditoUtilizado))) {
			limiteCreditoUtilizado += (valor - getSaldo());
			setSaldo(0d);
			AppException excecao = new AppException(0);
			throw excecao;
		} else {
			AppException excecao = new AppException(0);
			throw excecao;
		}
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
		try {
			sacar(taxaManutencao);
		} catch (AppException e) {
			System.out.println("comunicar direcao do banco");
		}
	}
	
	@Override
	public String toString() {
		return "Conta Corrente - " + super.toString();
	}
	
}
