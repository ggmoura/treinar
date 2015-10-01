package br.com.treinar.avancado.atividade.diegoVarella;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeExcecao {
	public static void main(String[] args) {

		try {
			leitor();
		} catch (InputMismatchException e) {
			System.out.println("\nErro");
		}

	}

	private static void leitor() {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		Integer numero = leitor.nextInt();
		leitor.close();
	}

}
