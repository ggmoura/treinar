package br.com.treinarminas.treinar.excecao;

import java.util.Scanner;

public class TesteExcecaoDois {
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("iniciando...");
			metodoRuntimeException();
			System.out.println("fim...");
		} catch (TesteRuntimeException e) {
			System.out.println("Errado...");
		}
		
		System.out.print("informe o seu nome: ");
		
		String nome = leitor.nextLine();
		System.out.println(nome);
		leitor.close();
	}

	private static void metodoRuntimeException() {
		metodoRuntimeExceptionDois();
	}
	private static void metodoRuntimeExceptionDois() {
		
		System.out.print("Informe um numero entre 1 e 3: ");
		
		Integer num = leitor.nextInt();
		leitor.nextLine();
		if (num > 0 && num < 3) {
			System.out.println("Correto...");
		} else {
			TesteRuntimeException testeRuntimeException = new TesteRuntimeException();
			throw testeRuntimeException;
		}
	}
	
}
