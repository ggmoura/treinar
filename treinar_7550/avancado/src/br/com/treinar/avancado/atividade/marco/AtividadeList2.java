package br.com.treinar.avancado.atividade.marco;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeList2 {

	public static void main(String[] args) {

		SalaAula treinar = new SalaAula();
		
		treinar.setMateria("Java Avançado");
		
		Pessoa professor = new Pessoa("Gleidson", Sexo.M);
		
		treinar.setProfessor(professor);
		
		treinar.setPessoas(new ArrayList<>());
	
		treinar.getPessoas().add(new Pessoa("Marco", Sexo.M));
		treinar.getPessoas().add(new Pessoa("Diego", Sexo.M));
		treinar.getPessoas().add(new Pessoa("Laila", Sexo.F));
		treinar.getPessoas().add(new Pessoa("Natan", Sexo.M));
		treinar.getPessoas().add(new Pessoa("Rodrigo", Sexo.M));
		treinar.getPessoas().add(new Pessoa("Isabela", Sexo.M));
		treinar.getPessoas().add(new Pessoa("Diego Varella", Sexo.M));
		
		
		
		
		

	}

}
