package br.com.treinarminas.hudson.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nomes = new ArrayList<String>();
		String nome = null;

		
		while (true) {
			System.out.println("Informe o nome da pessoa ou -1 para sair:");
			nome = sc.nextLine();
			if (nome.equals("-1")) {
				break;
			} else {
				nomes.add(nome);
			}
		}

		System.out.println("O tamanho de sua lista de nomes é de: "
				+ nomes.size() + " elementos. ");
		System.out.println("Seus elementos são:");
		for (String nm : nomes) {
			System.out.println(nm);
		}

		sc.close();
	}

}
