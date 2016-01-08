package br.com.treinarminas.treinar.loop;


public class TesteFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int[] numeros = {1, 2, 8, 9, 5, 7};
		
		System.out.println("foreach");
		
		for (int i : numeros) {
			System.out.print(i + " ");
		}

	}
	
}
