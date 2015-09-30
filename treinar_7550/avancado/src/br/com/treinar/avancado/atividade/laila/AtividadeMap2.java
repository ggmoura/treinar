package br.com.treinar.avancado.atividade.laila;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.treinar.avancado.atividade.mariana.AtividadeMap;

public class AtividadeMap2 {

	public static void main(String[] args) {

		Map<Character, List<String>> mapa = AtividadeMap.recuperarMapaNomes();

		Set<Entry<Character, List<String>>> entrySet = mapa.entrySet();

		for (Entry<Character, List<String>> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
