package br.com.treinarminas.estudo;

import java.util.Scanner;

public class AtividadeNota {

	public static void main(String[] args) {
		Scanner leitorTeclado = new Scanner(System.in);
		System.out.print("Informe a nota do aluno: ");
		int notaAluno = leitorTeclado.nextInt();
		if (notaAluno >= 60) {
			System.out.println("Aprovado");
		} else if (notaAluno >= 40) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		leitorTeclado.close();
	}

}
