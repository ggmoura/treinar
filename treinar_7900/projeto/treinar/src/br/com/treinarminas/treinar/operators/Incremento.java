package br.com.treinarminas.treinar.operators;

public class Incremento {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		System.out.println("Valor de i = " + i);
		i++;
		System.out.println("Valor de i++ = " + i);
		System.out.println("Valor de i++ = " + i++);
		System.out.println("Valor de i = " + i);

		j = ++i;
		
		System.out.println("Valor de j = " + j);
		
	}

}
