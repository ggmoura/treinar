package br.com.treinar.avancado.atividade.mariana;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AtividadeImprimirMap {

	
	public static void main(String[] args) {
		Map<Character, List<String>> mapa = AtividadeMap.recuperarMapaNomes();
		Set<Entry<Character, List<String>>> registros = mapa.entrySet();
		for (Entry<Character, List<String>> entry : registros) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	
	
	}
	
}
