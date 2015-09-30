package br.com.treinar.avancado.atividade.natan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdenacao {

	public static void main(String[] args) {
		List<Banheiro> banheiro = new ArrayList<>();
		
		Banheiro b1 = new Banheiro();
		b1.setPapel("Neve");
		b1.setPessoa(new Pessoa("Natan", Sexo.M, 10020030040l));
		b1.setSexo(Sexo.M);
		
		Banheiro b2 = new Banheiro();
		b2.setPapel("Neve");
		b2.setPessoa(new Pessoa("Neimar", Sexo.M, 10020030040l));
		b2.setSexo(Sexo.M);
		
		Banheiro b3 = new Banheiro();
		b3.setPapel("Neve");
		b3.setPessoa(new Pessoa("Isabela", Sexo.F, 10020030040l));
		b3.setSexo(Sexo.F);
		
		banheiro.add(b1);
		banheiro.add(b2);
		banheiro.add(b3);
		
		Collections.sort(banheiro, new Comparator<Banheiro>() {
			@Override
			public int compare(Banheiro b1, Banheiro b2) {
				return Integer.compare(b1.getSexo().ordinal(), b2.getSexo().ordinal());
			}
		});
		
		for (Banheiro banheiro2 : banheiro) {
			System.out.println(banheiro2.getPessoa().getNome() + " "+ banheiro2.getSexo());
		}
		

	}

}
