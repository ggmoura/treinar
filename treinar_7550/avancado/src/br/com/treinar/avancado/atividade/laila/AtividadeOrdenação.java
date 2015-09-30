package br.com.treinar.avancado.atividade.laila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdenação {

	public static void main(String[] args) {
	
		List <Banheiro> banheiros = new ArrayList<>();
		Banheiro b1 = new Banheiro();
		b1.setSexo(Sexo.M);
		b1.setPia("branca");

		Banheiro b2 = new Banheiro();
		b2.setSexo(Sexo.F);
		b2.setPia("cinza");
		
		Banheiro b3 = new Banheiro();
		b3.setSexo(Sexo.F);
		b3.setPia("preta");
		
		banheiros.add(b1);
		banheiros.add(b2);
		banheiros.add(b3);
		
		
		Collections.sort(banheiros, new Comparator<Banheiro>() {

			@Override
			public int compare(Banheiro o1, Banheiro o2) {				
				return Integer.compare(o1.getSexo().ordinal(), o2.getSexo().ordinal());
			}
		});
	
		
		for (Banheiro banheiro : banheiros) {
			System.out.println(banheiro.getSexo().getDescricao() + " " + banheiro.getPia());
		}
	}

}
