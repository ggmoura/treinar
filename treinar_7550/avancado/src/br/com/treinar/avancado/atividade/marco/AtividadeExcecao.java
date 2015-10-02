package br.com.treinar.avancado.atividade.marco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeExcecao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		int idade;

		try {
			System.out.print("Digite seu nome: ");
			nome = leitor.nextLine();

			System.out.print("Digite sua idade: ");
			idade = leitor.nextInt();

			System.out.println(nome + " " + idade);

		} catch (InputMismatchException e) {
			System.out.println("dados inválidos");
		}
		leitor.close();

	}

}
