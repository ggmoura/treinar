package br.com.treinar.avancado.atividade.natan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeExcecao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		try {
			System.out.println("Informe um numero inteiro");
			int a = leitor.nextInt();
			System.out.println(a);

		} catch (InputMismatchException e) {
			System.out.println("Valor digitado não é um inteiro");
		} finally {
			leitor.close();
		}
	}

}
