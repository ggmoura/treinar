package br.com.treinarminas.treinar.collections;

import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.treinar.collections.modelo.Carro;

public class TesteArrayList {

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
		uno.setChassi("ch2");
		uno.setCor("Preto");
		uno.setMarca("Fiat");
		uno.setModelo("Uno");
		uno.setValor(27_000.00);
		
		Carro unoDois = uno;
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(uno);
		carros.add(palio);
		carros.add(unoDois);
		carros.add(siena);
		
		System.out.println(carros.size());
		
	}
	
}
