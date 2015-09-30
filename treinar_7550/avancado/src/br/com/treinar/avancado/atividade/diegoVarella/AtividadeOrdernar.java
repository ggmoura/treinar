package br.com.treinar.avancado.atividade.diegoVarella;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdernar {

	public static void main(String[] args) {

		Banheiro banheiro1 = new Banheiro();
		Banheiro banheiro2 = new Banheiro();
		Banheiro banheiro3 = new Banheiro();
		Banheiro banheiro4 = new Banheiro();

		banheiro1.setSexo(Sexo.F);
		banheiro2.setSexo(Sexo.M);
		banheiro3.setSexo(Sexo.M);
		banheiro4.setSexo(Sexo.F);

		List<Banheiro> banheiros = new ArrayList<>();
		banheiros.add(banheiro1);
		banheiros.add(banheiro2);
		banheiros.add(banheiro3);
		banheiros.add(banheiro4);

		Collections.sort(banheiros, new Comparator<Banheiro>() {

			@Override
			public int compare(Banheiro o1, Banheiro o2) {
				return Integer.compare(o1.getSexo().ordinal(), o2.getSexo().ordinal());
			}
		});

		for (Banheiro banheiro : banheiros) {
			System.out.println(banheiro.getSexo().getDescricao());
		}

	}

}
