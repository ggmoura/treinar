package br.com.treinar.avancado.atividade.natan;

import java.util.*;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeList2 {

	public static void main(String[] args) {
		SalaAula sala = new SalaAula();

		Pessoa professor = new Pessoa("Gleidson", Sexo.M);
		professor.setCpf(10020030050l);
		sala.setProfessor(professor);
		sala.setMateria("Java Avançado");

		Pessoa natan = new Pessoa("Natan", Sexo.M);
		natan.setCpf(10677322224l);

		Pessoa isabela = new Pessoa("isabela", Sexo.F);
		isabela.setCpf(10020030040l);

		Pessoa marco = new Pessoa("Marco", Sexo.M);
		marco.setCpf(10020030060l);

		List<Pessoa> alunos = new ArrayList<>();

		alunos.add(natan);
		alunos.add(isabela);
		alunos.add(marco);

		sala.setPessoas(alunos);

		
		
	}

}
