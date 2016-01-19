package br.com.treinarminas.hudson.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AtividadeMap {
	public static void main(String[] args) {
		Map<Character, List<String>> mapaNomes = new HashMap<>();
		String nome = null;
		Character primeiraLetra = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Informe um nome ou [Sair] para sair");
			nome = sc.nextLine();
			primeiraLetra = nome.charAt(0);
			if (!nome.equalsIgnoreCase("sair")) {

				if (!mapaNomes.containsKey(primeiraLetra)) {
					mapaNomes.put(primeiraLetra, new ArrayList<>());
				}
				mapaNomes.get(primeiraLetra).add(nome);
			}

		} while (!nome.equalsIgnoreCase("sair"));

		sc.close();

		Set<Entry<Character, List<String>>> entrySet = mapaNomes.entrySet();

		for (Entry<Character, List<String>> entry : entrySet) {
			System.out.println(entry);
		}
		
		Set<Character> keySet = mapaNomes.keySet();
		for (Character character : keySet) {
			System.out.println(character);
			List<String> list = mapaNomes.get(character);
			for (String string : list) {
				System.out.println(string);
			}
		}

	}
}
