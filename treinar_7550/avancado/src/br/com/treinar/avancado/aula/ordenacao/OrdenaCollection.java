package br.com.treinar.avancado.aula.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class OrdenaCollection {

	public static void main(String[] args) {
		
		List<String> afilhados = new ArrayList<>();
		afilhados.add("Maria Sophia");
		afilhados.add("Davi Lucas");
		afilhados.add("Nathalia");
		afilhados.add("Amanda");
		afilhados.add("Isis");
		afilhados.add("João Carlos");
		afilhados.add("Juan Pablo");
		afilhados.add("Maria Cecilia");
		
		Collections.sort(afilhados);
		System.out.println(afilhados);
		
		
		List<Pessoa> afilhadosPessoa = new ArrayList<>();
		afilhadosPessoa.add(new Pessoa("Maria Cecilia", Sexo.F, 8l));
		afilhadosPessoa.add(new Pessoa("Nathalia", Sexo.F, 3l));
		afilhadosPessoa.add(new Pessoa("João Carlos", Sexo.M, 6l));
		afilhadosPessoa.add(new Pessoa("Isis", Sexo.F, 5l));
		afilhadosPessoa.add(new Pessoa("Maria Sophia", Sexo.F, 1l));
		afilhadosPessoa.add(new Pessoa("Amanda", Sexo.F, 4l));
		afilhadosPessoa.add(new Pessoa("Juan Pablo", Sexo.M, 7l));
		afilhadosPessoa.add(new Pessoa("Davi Lucas", Sexo.M, 2l));
		afilhadosPessoa.add(new Pessoa("Miguel", Sexo.M, 9l));
		
		System.out.println(afilhados);
		
		System.out.println(afilhadosPessoa);
		
		Collections.sort(afilhadosPessoa);

		System.out.println(afilhadosPessoa);
		
		
		CriterioOrdenacaoNomePessoa cop = new CriterioOrdenacaoNomePessoa();
		
		Collections.sort(afilhadosPessoa, cop);
		
		System.out.println(afilhadosPessoa);
		
		Collections.sort(afilhadosPessoa, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return Integer.compare(o1.getSexo().ordinal(), o2.getSexo().ordinal());
			}
		});
		
		System.out.println(afilhadosPessoa);
		
		
	}
	
}
