package br.com.treinarminas.treinar.array;

public class TesteArrayDois {

	public static void main(String[] args) {

		String[] diasSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
		imprimirArray(diasSemana);
		
		imprimirArrayDois(diasSemana);
		imprimirArrayDois("Gleidson");
		imprimirArrayDois("Gleidson", "Teste");
	
	}
	
	private static void imprimirArray(String[] array) {
		for (String diaSemana : array) {
			System.out.println(diaSemana);
		}
	}
	
	private static void imprimirArrayDois(String... array) {
		for (String diaSemana : array) {
			System.out.println(diaSemana);
		}
	}
	
	private static void imprimirArrayDois(String array) {
		System.out.println(array);
	}
	
	
	
	
}
