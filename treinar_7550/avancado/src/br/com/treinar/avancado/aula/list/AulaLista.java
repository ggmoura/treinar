package br.com.treinar.avancado.aula.list;

import java.util.HashSet;
import java.util.Set;

public class AulaLista {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>();

		lista.add("Cleide");
		lista.add("Cleide");
		lista.add("Diego");
		lista.add("Adegir");
		lista.add("Adegir");

		System.out.println("Listagem");

		System.out.print("\t" + lista);

	}

}
