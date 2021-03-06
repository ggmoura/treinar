package br.com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Fernando", 2);
		map.put("Albert", 1);
		map.put("Raquel", 8);
		map.put("Gleidson", 29);
		map.put("Gleidson", map.get("Gleidson") + 1);
		
		System.out.println(map.get("Gleidson"));
		
		Set<String> chaves = map.keySet();
		//Collection<Integer> numeros = map.values();
		for (String chave : chaves) {
			System.out.println(map.get(chave));
		}
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Robson");
		nomes.add("Alano");
		nomes.add("Albert");
		nomes.add("Gabriel");
		nomes.add("Raquel");
		nomes.add("Gilberto");
		nomes.add("Fernando");
		
		
		
		
		
	}
	
}
