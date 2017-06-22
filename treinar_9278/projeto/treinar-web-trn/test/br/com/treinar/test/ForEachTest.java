package br.com.treinar.test;

public class ForEachTest {

	public static void main(String[] args) {
		String[] nomes = {"Maria Sophia", "Davi Lucas", "Ana Cecilia"};
		String nome = null;
		for (int i = 0; i < nomes.length; i++) {
			nome = nomes[i];
			System.out.println(nome);
		}
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
	}
	
}
