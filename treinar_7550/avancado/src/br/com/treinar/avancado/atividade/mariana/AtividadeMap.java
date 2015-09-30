package br.com.treinar.avancado.atividade.mariana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AtividadeMap {

	public static Map<Character, List<String>> recuperarMapaNomes(String[] args) {
		String nome = null;
		Scanner leitor = new Scanner(System.in);
		Map<Character, List<String>> mapa = new HashMap<>();
		Character primeiraLetra = null;
		do {
			System.out.print("Digite um nome ou [Sair]: ");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				primeiraLetra = nome.charAt(0);
				if (!mapa.containsKey(primeiraLetra)) {
					mapa.put(primeiraLetra, new ArrayList<>());
				}
				mapa.get(primeiraLetra).add(nome);
			}
		} while (!nome.equalsIgnoreCase("sair"));
		leitor.close();
		
		return mapa;
	}

}
