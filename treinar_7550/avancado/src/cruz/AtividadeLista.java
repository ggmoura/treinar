package cruz;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeLista {

	public static void main(String[] args) {
		SalaAula aula = new SalaAula();
		aula.setMateria("Gastronomia");
		
		Pessoa professor = new Pessoa("Laila", Sexo.F);
		
		aula.setProfessor(professor);
		List<Pessoa> alunos = new ArrayList<>();

		Pessoa aluno1 = new Pessoa("Gleidson", Sexo.M);
		Pessoa aluno2 = new Pessoa("Isabela", Sexo.F);
		Pessoa aluno3 = new Pessoa("Marco", Sexo.M);
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);

		aula.setPessoas(alunos);
		
		System.out.println(aula);
		
	}
	
}
