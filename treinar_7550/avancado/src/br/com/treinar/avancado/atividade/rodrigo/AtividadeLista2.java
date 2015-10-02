package br.com.treinar.avancado.atividade.rodrigo;

import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;
import br.com.treinar.avancado.aula.lista.SalaAula;

public class AtividadeLista2 {
	public static void main(String[] args) {

		Pessoa gleidson = new Pessoa("gleidson",Sexo.M);
		Pessoa mariana = new Pessoa("mariana",Sexo.F);
		Pessoa wagner = new Pessoa("wagner",Sexo.M);
		Pessoa diego = new Pessoa("diego",Sexo.M);
		Pessoa natan = new Pessoa("natan",Sexo.M);
		Pessoa laila = new Pessoa("laila",Sexo.F);
		Pessoa rodrigo = new Pessoa("rodrigo",Sexo.M);
		Pessoa diegoVarella = new Pessoa("diegoVarella",Sexo.M);
		
		SalaAula sala = new SalaAula();
		
		sala.setMateria("Java Avançado");
		sala.setProfessor(gleidson);
		sala.setPessoas(new ArrayList<Pessoa>());
		
		sala.getPessoas().add(diegoVarella);
		sala.getPessoas().add(diego);
		sala.getPessoas().add(mariana);
		sala.getPessoas().add(natan);
		sala.getPessoas().add(laila);
		sala.getPessoas().add(rodrigo);
		sala.getPessoas().add(gleidson);
		sala.getPessoas().add(wagner);
		
		System.out.println(sala.getMateria());
		System.out.println(sala.getProfessor().getNome());
		System.out.println(gleidson.getNome());
		System.out.println(gleidson.getSexo().getDescricao());
		System.out.println(mariana.getNome());
		System.out.println(mariana.getSexo().getDescricao());
		System.out.println(diego.getNome());
		System.out.println(diego.getSexo().getDescricao());
		System.out.println(wagner.getNome());
		System.out.println(wagner.getSexo().getDescricao());		 	
		
		
	}
}
