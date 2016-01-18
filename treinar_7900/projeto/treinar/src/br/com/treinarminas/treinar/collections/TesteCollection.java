package br.com.treinarminas.treinar.collections;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class TesteCollection {

	public static void main(String[] args) {
		
		List nomes = new ArrayList();
		
		nomes.add("Maria Sophia");
		nomes.add("Miguel");
		nomes.add("Maria Cecilia");
		nomes.add("Juan Pablo");
		nomes.add("Nathalia");
		nomes.add("Amanda");
		
		System.out.println("Tamanho: " + nomes.size());
		
		nomes.add("João Carlos");
		
		System.out.println("Tamanho depois de inserir um elemento: " + nomes.size());
		
		nomes.get(2);
		
		
		for (Object nome : nomes) {
			System.out.println(nome);
		}
		
	}
	
	
}
