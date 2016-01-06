package br.com.treinarminas.hudson.loopings;

public class TesteFor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int[] numeros = { 3,4,5,6,7,8,9 };
		for ( int i : numeros ) {
			System.out.print(i);
		}
	}
}
