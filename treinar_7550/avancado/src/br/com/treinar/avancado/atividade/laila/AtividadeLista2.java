package br.com.treinar.avancado.atividade.laila;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeLista2 {

	public static void main(String[] args) {
	
		SalaAula salaAula = new SalaAula();
		
		Pessoa professor = new Pessoa("Gleidson", Sexo.M);
		
		Pessoa aluno1 = new Pessoa("Laila", Sexo.F);
		Pessoa aluno2 = new Pessoa("Diego", Sexo.M);
		Pessoa aluno3 = new Pessoa("Marco", Sexo.M);
		Pessoa aluno4 = new Pessoa("Wagner", Sexo.M);
		
		String materia = "Java Avançado";
		
		salaAula.setMateria(materia);
		salaAula.setProfessor(professor);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(aluno1);
		pessoas.add(aluno2);
		pessoas.add(aluno3);
		pessoas.add(aluno4);
		
		salaAula.setPessoas(pessoas);

	}

}
