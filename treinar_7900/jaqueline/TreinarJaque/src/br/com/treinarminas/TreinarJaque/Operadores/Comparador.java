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
		
		//quando utiliza dois "&&" quando a expresão e satisfeita não continua a execução
		c = a > b && b < 10;
		
		//quando utiliza dois "&" indiferente de já ter obtido o resultado da expresão continua a excução 
		//pode utilizar & ou |
		c = a > b & b < 10;
		
		int d = a > 10 ? a : b; //? comparação e da o valor é aplicado em caso de atribuição
		
		System.out.println("d = " + d);
		System.out.println(a > 10 ? a : b);
	
	}
	
	
}
