package br.com.treinar.avancado.atividade.natan;

import java.util.*;

import br.com.treinar.avancado.atividade.mariana.AtividadeMap;

public class AtivMap {

	public static void main(String[] args) {
		Map<Character, List<String>> mapa = AtividadeMap.recuperarMapaNomes();
		
		for (Character pLetra : mapa.keySet()) {
			System.out.println("A chave '" + pLetra + "' contem os nomes " + mapa.get(pLetra));
		}

	}

}