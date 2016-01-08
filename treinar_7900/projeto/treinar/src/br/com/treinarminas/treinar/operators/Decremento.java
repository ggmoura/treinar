package br.com.treinarminas.treinar.operators;

public class Decremento {

	public static void main(String[] args) {

		int i = 3;
		int j = 0;
		
		System.out.println("Valor de i = " + i);
		i--;
		System.out.println("Valor de i-- = " + i);
		System.out.println("Valor de i-- = " + i--);
		System.out.println("Valor de i = " + i);

		j = --i;
		
		System.out.println("Valor de j = " + j);
		
	}
	
}
