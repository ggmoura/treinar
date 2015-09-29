package br.com.treinar.avancado.aula.lista;

import java.util.List;

import br.com.treinar.avancado.Pessoa;

public class SalaAula {

	private Pessoa professor;
	private String materia;
	private List<Pessoa> pessoas;

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
