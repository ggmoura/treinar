package br.com.treinarminas.treinar.collections;

import java.util.Comparator;

import br.com.treinarminas.treinar.collections.modelo.Carro;

public class CriterioComparacaoCarroAno implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getAno().compareTo(o2.getAno());
	}

}
