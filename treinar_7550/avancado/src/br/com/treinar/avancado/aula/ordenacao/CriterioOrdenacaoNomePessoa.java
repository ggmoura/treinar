package br.com.treinar.avancado.aula.ordenacao;

import java.util.Comparator;

import br.com.treinar.avancado.Pessoa;

public class CriterioOrdenacaoNomePessoa implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

}
