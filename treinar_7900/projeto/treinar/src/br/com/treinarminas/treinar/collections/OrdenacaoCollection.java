package br.com.treinarminas.treinar.collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.treinarminas.treinar.collections.modelo.Carro;

public class OrdenacaoCollection {

	
	public static void main(String[] args) {
		
		Carro palio = new Carro();
		palio.setChassi("ch1");
		palio.setCor("Amarelo");
		palio.setMarca("Fiat");
		palio.setModelo("Palio");
		palio.setValor(30_000.00);
		palio.setAno(2014);
		
		Carro siena = new Carro();
		siena.setChassi("ch3");
		siena.setCor("Preto");
		siena.setMarca("Fiat");
		siena.setModelo("Siena");
		siena.setValor(27_000.00);
		siena.setAno(2016);
		
		Carro uno = new Carro();
		uno.setChassi("ch2");
		uno.setCor("Verde");
		uno.setMarca("Fiat");
		uno.setModelo("Uno");
		uno.setValor(27_000.00);
		uno.setAno(2011);
		
		Set<Carro> carros = new HashSet<>();
		
		carros.add(uno);
		carros.add(palio);
		carros.add(siena);
		
		System.out.println(carros);
		
		List<Carro> carrosList = new ArrayList<Carro>(carros);
		
		
		Collections.sort(carrosList);
		System.out.println(carrosList);

		CriterioComparacaoCarroAno criterio = new CriterioComparacaoCarroAno();
		
		Collections.sort(carrosList, criterio);
		System.out.println(carrosList);
		
		Collections.sort(carrosList, new Comparator<Carro>() {

			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getValor().compareTo(o2.getValor());
			}
		});
		
		
		List<String> lista = new ArrayList<>();
		 
		lista.add("�ber");
		lista.add("�ther");
		lista.add("kreativ");
		lista.add("zahlen");
		lista.add("k�nnen");
		lista.add("�sterreich");
		lista.add("L�hnhoff");
		lista.add("D�hne");
		lista.add("B�scher");
		lista.add("M�de");
		lista.add("M�ller");
		lista.add("Linsenbr�der");
		lista.add("L�kin");
 
		System.out.println("Ordem de inclus�o: " + lista);
 
		// Realiza a ordena��o dos itens
		Collections.sort(lista);		
		System.out.println("Ordem de Simples: " + lista);
 
		Collator collator = Collator.getInstance();
		collator.setStrength(Collator.PRIMARY);
		Collections.sort(lista, collator);		
		
		System.out.println("Ordem com Collator: " + lista);
		
		
		
		
	}
	
}
