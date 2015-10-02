package br.com.treinar.avancado.atividade.rodrigo;

import java.util.Scanner;

public class AtividadeExeptions {

	public static void main(String[] args) {

		try {
			digitos();
			System.out.println("Isso é um inteiro!");
		} catch (Exception e) {
			System.out.println("voce digitou algo errado!");
		}

	}

	private static void digitos() {
		System.out.println("Digite um numero inteiro: ");
		Scanner leitor = new Scanner(System.in);
		int digito = leitor.nextInt();
	}

}
