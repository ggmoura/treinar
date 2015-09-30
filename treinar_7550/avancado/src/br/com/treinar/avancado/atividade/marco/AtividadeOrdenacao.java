package br.com.treinar.avancado.atividade.marco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdenacao {

	public static void main(String[] args) {

		List<Banheiro> banheiros = new ArrayList<>();

		Banheiro banheiro1 = new Banheiro();
		banheiro1.setSexo(Sexo.M);

		Banheiro banheiro2 = new Banheiro();
		banheiro2.setSexo(Sexo.F);

		Banheiro banheiro3 = new Banheiro();
		banheiro3.setSexo(Sexo.F);

		Banheiro banheiro4 = new Banheiro();
		banheiro4.setSexo(Sexo.M);

		banheiros.add(banheiro1);
		banheiros.add(banheiro2);
		banheiros.add(banheiro3);
		banheiros.add(banheiro4);

		Collections.sort(banheiros, new Comparator<Banheiro>(){

			@Override
			public int compare(Banheiro o1, Banheiro o2) {
				
				return Integer.compare(o1.getSexo().ordinal(),o2.getSexo().ordinal());
			}
			
		});
		
		for (Banheiro banheiro : banheiros) {
			System.out.println(banheiro.getSexo().getDescricao());
			
		}
		
	}


}
