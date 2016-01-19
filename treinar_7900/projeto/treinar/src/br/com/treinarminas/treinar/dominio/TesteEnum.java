package br.com.treinarminas.treinar.dominio;


public class TesteEnum {

	public static void main(String[] args) {
		FaixaEtaria faixa = FaixaEtaria.ADULTO;
		
		System.out.println(faixa);
		
		System.out.println(faixa.ordinal());
		System.out.println("\n\n");
		FaixaEtaria[] faixas = FaixaEtaria.values();
		
		for (FaixaEtaria faixaEtaria : faixas) {
			System.out.println(faixaEtaria.getDescricao());
		}
		
		
		String _enum = "INFANTIL";
		
		FaixaEtaria infantil = FaixaEtaria.valueOf(_enum);
		
		System.out.println(infantil.getIdadeMinima());
		System.out.println(infantil.getIdadeMaxima());
		
		String descricao = "Infantil";
		
		FaixaEtaria recuperadoPorDescricao = FaixaEtaria.recuperarPorDescricao(descricao);
		System.out.println(recuperadoPorDescricao.getIdadeMinima());
		System.out.println(recuperadoPorDescricao.getIdadeMaxima());
		
		
	}
	
}
