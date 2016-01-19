package br.com.treinarminas.treinar.excecao;

import java.util.Scanner;

public class TesteFinally {

	public static void main(String[] args) throws Exception {
		String nome = metodoDois();
		System.out.println(nome);
	}

	private static String metodoDois() throws Exception {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("Digite seu nome: ");
			metodo();
			String nome = s.nextLine();
			return nome;
		} catch (Exception e) {
			System.out.println("Deu erro...");
			throw e;
		} finally {
			s.close();			
		}
	}

	private static void metodo() throws Exception {
		try {
			System.out.println("Executou metodo!");
		} finally {
			System.out.println("");
		}
		
	}
	
	
	
	
	
}
