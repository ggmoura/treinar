package br.com.treinarminas.treinar.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AtividadeMap {

	public static void main(String[] args) {
		
		Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();
		String nome = null;
		Scanner sc = new Scanner(System.in);
		Character primeiraLetra = null;
		List<String> listaNomes = null;
		do {
			System.out.print("Informe o nome ou [sair]: ");
			nome = sc.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				primeiraLetra = nome.charAt(0);
				
				if (!mapNomes.containsKey(primeiraLetra)) {
					listaNomes = new ArrayList<String>();
					mapNomes.put(primeiraLetra, listaNomes);
				}
				mapNomes.get(primeiraLetra).add(nome);
			}
			
			
		} while (!nome.equalsIgnoreCase("sair"));
		sc.close();
		System.out.println(mapNomes);
		
		//recupera todas as chaves do mapa
		Set<Character> keys = mapNomes.keySet();
		for (Character key : keys) {
			System.out.println(key);
		}
		System.out.println("\n\n");
		//recupera todos os valores do mapa
		Collection<List<String>> values = mapNomes.values();
		
		//para percorrer todos os elementos do map navegando em um objeto chave valor
		Set<Entry<Character, List<String>>> entrys = mapNomes.entrySet();
		
		for (Entry<Character, List<String>> entry : entrys) {
			System.out.print(entry.getKey());
			System.out.print(" ");
			System.out.println(entry.getValue());
		}
		
	}
	
	
}
