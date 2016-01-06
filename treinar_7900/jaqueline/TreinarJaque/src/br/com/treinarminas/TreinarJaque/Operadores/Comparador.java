package br.com.treinarminas.TreinarJaque.Operadores;

public class Comparador {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a + " b = " + b);

		boolean c = a == b;
		
		System.out.println("a igual b: " + c);
	
		c = a != b;
		
		System.out.println("a diferente b: " + c);
		
		c = a > b;
		
		System.out.println("a maior b: " + c);
		
		c = a < b;
		
		System.out.println("a menor b: " + c);
		
		c = a >= b;
		
		System.out.println("a maior ou igual b: " + c);
		
		c = a <= b;
		
		System.out.println("a menor ou igual b: " + c);
		
		//quando utiliza dois "&&" quando a expres�o e satisfeita n�o continua a execu��o
		c = a > b && b < 10;
		
		//quando utiliza dois "&" indiferente de j� ter obtido o resultado da expres�o continua a excu��o 
		//pode utilizar & ou |
		c = a > b & b < 10;
		
		int d = a > 10 ? a : b; //? compara��o e da o valor � aplicado em caso de atribui��o
		
		System.out.println("d = " + d);
		System.out.println(a > 10 ? a : b);
	
	}
	
	
}
