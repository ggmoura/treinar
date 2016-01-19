package br.treinarminas.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteCollection {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		@SuppressWarnings("unchecked")
		Collection<String> nomes = new ArrayList();
		@SuppressWarnings("resource")
		Scanner pessoa = new Scanner(System.in);
		String nome = null;
		
		do {
			
			System.out.print("Digite o nome da pessoa: ");
			nome = pessoa.nextLine();
			
			if (!nome.equals("0")) {
				
				nomes.add( nome );
				
			}
			
		} while (!nome.equals("0"));
		
		for (Object n : nomes) {
			System.out.println(n);
		}
		
	}

}
