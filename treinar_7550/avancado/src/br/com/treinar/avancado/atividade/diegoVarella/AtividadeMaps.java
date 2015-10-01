package br.com.treinar.avancado.atividade.diegoVarella;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.treinar.avancado.atividade.mariana.AtividadeMap;

public class AtividadeMaps {
	
	public static void main(String[] args) {
		
		Map<Character, List<String>> mapa = AtividadeMap.recuperarMapaNomes();
		
		Set<Entry<Character, List<String>>> entrySet = mapa.entrySet();
		
		System.out.println("\nNomes digitados:");
		for (Entry<Character, List<String>> entry : entrySet) {
			System.out.println("\t" + entry.getKey() + " - " + entry.getValue());
		}
		
	}

}
