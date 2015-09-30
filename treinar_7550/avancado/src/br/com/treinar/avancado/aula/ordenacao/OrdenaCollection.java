package br.com.treinar.avancado.aula.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
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
		afilhadosPessoa.add(new Pessoa("Maria Sophia", Sexo.F, 1l));
		afilhadosPessoa.add(new Pessoa("Davi Lucas", Sexo.M, 2l));
		afilhadosPessoa.add(new Pessoa("Nathalia", Sexo.M, 3l));
		afilhadosPessoa.add(new Pessoa("Amanda", Sexo.M, 4l));
		afilhadosPessoa.add(new Pessoa("Isis", Sexo.M, 5l));
		afilhadosPessoa.add(new Pessoa("João Carlos", Sexo.M, 6l));
		afilhadosPessoa.add(new Pessoa("Juan Pablo", Sexo.M, 7l));
		afilhadosPessoa.add(new Pessoa("Maria Cecilia", Sexo.M, 8l));
		
		Collections.sort(afilhadosPessoa);
		System.out.println(afilhados);
		
		
		
	}
	
}
