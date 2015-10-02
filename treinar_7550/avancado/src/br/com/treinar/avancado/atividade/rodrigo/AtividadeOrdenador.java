package br.com.treinar.avancado.atividade.rodrigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdenador {
	public static void main(String[] args) {

		Banheiro b1 = new Banheiro();
		b1.setSexo(Sexo.F);
		Banheiro b2 = new Banheiro();
		b2.setSexo(Sexo.M);
		Banheiro b3 = new Banheiro();
		b3.setSexo(Sexo.F);
		Banheiro b4 = new Banheiro();
		b4.setSexo(Sexo.M);

		List<Banheiro> banheiros = new ArrayList<>();
		banheiros.add(b1);
		banheiros.add(b3);
		banheiros.add(b2);
		banheiros.add(b4);

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
