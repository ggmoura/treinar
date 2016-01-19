package br.com.treinarminas.treinar.excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		
		try {
			String[] nomes = new String[5];
			nomes[1] = "Gleidson";
			nomes[2] = "Gleidson";
			nomes[3] = "Gleidson";
			nomes[4] = "Gleidson";
			nomes[5] = "Gleidson";
			
			System.out.println(nomes[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
	}
	
}
