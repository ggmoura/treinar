package br.com.treinarminas.treinar.array;

public class TesteArrayMultiDimencional {

	public static void main(String[] args) {
		Integer[][] matriz;
		
		
		matriz = new Integer[5][3];
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				 System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("matriz dois");
		String[][] matrizDois = {{"a", "b"},{"c", "d"}};
		for (int i = 0; i < matrizDois.length; i++) {
			for (int j = 0; j < matrizDois[i].length; j++) {
				System.out.print(matrizDois[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
