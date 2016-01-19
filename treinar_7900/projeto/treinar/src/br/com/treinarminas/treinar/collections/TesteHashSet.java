package br.com.treinarminas.treinar.collections;

import java.util.HashSet;
import java.util.Set;

import br.com.treinarminas.treinar.collections.modelo.Carro;

public class TesteHashSet {

	public static void main(String[] args) {
		
		Carro palio = new Carro();
		palio.setChassi("ch1");
		palio.setCor("Amarelo");
		palio.setMarca("Fiat");
		palio.setModelo("Palio");
		palio.setValor(30_000.00);
		
		Carro uno = new Carro();
		uno.setChassi("ch2");
		uno.setCor("Verde");
		uno.setMarca("Fiat");
		uno.setModelo("Uno");
		uno.setValor(27_000.00);
		
		Carro siena = new Carro();
		siena.setChassi("ch2");
		siena.setCor("Preto");
		siena.setMarca("Fiat");
		siena.setModelo("Siena");
		siena.setValor(27_000.00);
		
		Carro unoDois = uno;
		
		Set<Carro> carros = new HashSet<>();
		
		carros.add(uno);
		carros.add(palio);
		carros.add(unoDois);
		carros.add(siena);
		
		System.out.println(carros.size());
		
	}
	
}
