package br.com.treinarminas.treinar.dominio;


public class TesteEnum {

	public static void main(String[] args) {
		FaixaEtaria faixa = FaixaEtaria.ADULTO;
		
		System.out.println(faixa);
		
		System.out.println(faixa.ordinal());
		System.out.println("\n\n");
		FaixaEtaria[] faixas = FaixaEtaria.values();
		
		for (FaixaEtaria faixaEtaria : faixas) {
			System.out.println(faixaEtaria);
		}
		
	}
	
}
