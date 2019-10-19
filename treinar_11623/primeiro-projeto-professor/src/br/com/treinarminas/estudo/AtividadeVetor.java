package br.com.treinarminas.estudo;

public class AtividadeVetor {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[5];
		numeros[0] = 10;
		numeros[1] = 15;
		numeros[2] = 20;
		numeros[3] = 25;
		numeros[4] = 30;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		String[] nomes = { "Dedier", "Larissa", "Gleidson" };
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);

	}

}
