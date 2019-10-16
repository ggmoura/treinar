package br.com.treinarminas.estudo;

public class RepeticaoWhile {

	public static void main(String[] args) {

		int contador = 0;

		System.out.println("WHILE");
		while (contador < 5) {
			System.out.println("ContadorWhile: " + contador);
			contador++;
		}
		System.out.println("DO WHILE");
		contador = 10;
		do {
			System.out.println("Contador doWhile: " + contador);
		} while (contador < 10);

		System.out.println("ATIVIDADE FOR");

		for (int i = 0; i < 10; i++) {
			System.out.println("Contador for: " + i);
		}


		System.out.println("Fim do programa!");

	}

}
