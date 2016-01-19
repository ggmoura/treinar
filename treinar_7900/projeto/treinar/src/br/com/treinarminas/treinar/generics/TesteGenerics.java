package br.com.treinarminas.treinar.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteGenerics {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();

		Scanner leitor = new Scanner(System.in);

		String nome = null;

		// Nao pode inserir numero pois o arraylist foi tipado
		// para elementos do tipo String
		// c.add(0);

		do {
			System.out.print("Digite um nome ou [Sair]");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				c.add(nome);
			}
		} while (!nome.equalsIgnoreCase("Sair"));
		leitor.close();
		for (String object : c) {
			System.out.println(object.toUpperCase());
		}
	}

}
