package br.com.treinarminas.treinar.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.treinarminas.treinar.collections.modelo.Carro;

public class TesteMap {

	public static void main(String[] args) {
		
		Carro palio = new Carro();
		palio.setChassi("ch1");
		palio.setCor("Amarelo");
		palio.setMarca("Fiat");
		palio.setModelo("Palio");
		palio.setValor(30_000.00);
		palio.setAno(2015);

		Carro uno = new Carro();
		uno.setChassi("ch2");
		uno.setCor("Verde");
		uno.setMarca("Fiat");
		uno.setModelo("Uno");
		uno.setValor(27_000.00);
		uno.setAno(2016);

		Carro siena = new Carro();
		siena.setChassi("ch3");
		siena.setCor("Preto");
		siena.setMarca("Fiat");
		siena.setModelo("Siena");
		siena.setValor(27_000.00);
		siena.setAno(2011);
		
		Map<String, Carro> mapCarros = new HashMap<>();
		mapCarros.put(palio.getModelo(), palio);
		mapCarros.put(uno.getModelo(), uno);
		mapCarros.put(siena.getModelo(), siena);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do carro: " + mapCarros.values());
		
		String nomeCarro = sc.nextLine();
		
		sc.close();
		
		System.out.println(mapCarros.get(nomeCarro).getChassi());
		
	}

}
