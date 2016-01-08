package br.com.treinarminas.treinar;

import java.util.Scanner;

public class TesteSwitchCase {
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.print("Informe a opção : ");
	int opcao = leitor.nextInt();

	leitor.close();
	
	switch (opcao) {
	case 1:
		System.out.println("Opcao 1");
		break;
	case 2:
		System.out.println("Opcao 2");
		break;
	case 3:
		System.out.println("Opcao 3");
		break;
	case 4:
		System.out.println("Opcao 4");
		break;

	default:
		System.out.println("Opcao Invalida");
		break;
	}
}
}
