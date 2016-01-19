package br.com.treinarminas.treinar.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class AtividadeCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		Scanner leitor = new Scanner(System.in);

		String nome = null;

		do {
			System.out.print("Digite um nome ou [Sair]");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				c.add(nome);
			}
		} while (!nome.equalsIgnoreCase("Sair"));

		for (Object object : c) {
			System.out.println(((String) object).toUpperCase());
		}
		leitor.close();

	}

}
