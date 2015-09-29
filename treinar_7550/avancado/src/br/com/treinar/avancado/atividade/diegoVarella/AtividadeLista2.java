package br.com.treinar.avancado.atividade.diegoVarella;

import java.util.ArrayList;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeLista2 {

	public static void main(String[] args) {
		
		SalaAula sAula = new SalaAula();
		
		Pessoa professor = new Pessoa("Gleidsson", Sexo.M);
		
		Pessoa aluno1 = new Pessoa("Aluno 1", Sexo.M);
		Pessoa aluno2 = new Pessoa("Aluno 2", Sexo.F);
		Pessoa aluno3 = new Pessoa("Aluno 3", Sexo.M);
	
		sAula.setMateria("Curso JAVA");
		sAula.setProfessor(professor);
		sAula.setPessoas(new ArrayList<>());
		
		sAula.getPessoas().add(aluno1);
		sAula.getPessoas().add(aluno2);
		sAula.getPessoas().add(aluno3);

		StringBuilder saida = new StringBuilder();
		saida.append(sAula.getMateria() + "\n\n" + "Professor: ").append(sAula.getProfessor().getNome())
		.append(", " + sAula.getProfessor().getSexo().getDescricao()).append("\n\n" + "Lista de alunos:" + "\n")
		.append("\n" + aluno1.getNome()).append(", " + aluno1.getSexo().getDescricao())
		.append("\n" + aluno2.getNome()).append(", " + aluno2.getSexo().getDescricao())
		.append("\n" + aluno3.getNome()).append(", " + aluno3.getSexo().getDescricao());
		
		System.out.println(saida);
	}	
}
