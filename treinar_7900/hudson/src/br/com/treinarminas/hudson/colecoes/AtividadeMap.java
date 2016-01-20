package br.com.treinarminas.hudson.colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


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

		// Imprime as entradas do mapa diretamente
		Set<Entry<Character, List<String>>> entrySet = mapaNomes.entrySet();

		for (Entry<Character, List<String>> entry : entrySet) {
			System.out.print(entry);
		}
		System.out.println();

		// imprime o keyset seguido por seus valores
		Set<Character> keySet1 = mapaNomes.keySet();
		for (Character character : keySet1) {
			System.out.println(character);
			List<String> list = mapaNomes.get(character);
			for (String string : list) {
				System.out.println("\t" + string);
			}
		}
		System.out.println();

		// imprime o keyset seguido por seus valores ordenados pela primeira
		// letra da key e dos valores da lista
		Map<Character, List<String>> sort = new TreeMap<>(
				new Comparator<Character>() {

					@Override
					public int compare(Character o1, Character o2) {
						return o1.compareTo(o2);
					}
				});

		sort.putAll(mapaNomes);

		Set<Character> keySet = sort.keySet();
		for (Character character : keySet) {
			System.out.println(character);
			List<String> list  = mapaNomes.get(character);
			list.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			for (String string : list) {
				System.out.println("\t" + string);
			}
		}

	}
}
