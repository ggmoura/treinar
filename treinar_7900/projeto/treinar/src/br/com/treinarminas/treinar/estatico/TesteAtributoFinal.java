package br.com.treinarminas.treinar.estatico;

public class TesteAtributoFinal {
	
	public static void main(String[] args) {
		System.out.println(AtributoFinal.NOME_PROJETO);
		
		//atributos finais nao podem sofrer alteracao de valores
		//AtributoFinal.nomeProjeto = "Nao muda eh final";
	}

}
