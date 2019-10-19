package br.com.inter.modelo;

import br.com.inter.modelo.principal.Conta;
import br.com.inter.modelo.principal.IProdutoPagavel;
import br.com.inter.modelo.principal.IProdutoRentavel;

public class ContaInvestimento extends Conta implements IProdutoPagavel, IProdutoRentavel {

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (getSaldo() >= valor) {
			setSaldo(getSaldo()- valor);
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	@Override
	public void pagar() {
		sacar(5.0);
	}
	@Override
	public void render() {
		Double valorRendimento = getSaldo() * 0.1;
		deposita(valorRendimento);
	}

}
