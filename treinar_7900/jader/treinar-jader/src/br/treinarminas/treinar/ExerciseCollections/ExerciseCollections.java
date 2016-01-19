package br.treinarminas.treinar.ExerciseCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExerciseCollections {

	private static Scanner s;

	public static void main(String[] args) {
		
		Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();
		String nome = null;
		s = new Scanner(System.in);
		Character primeiraLetra = null;
		List<String> listaNomes = null;
				
		do {
			System.out.print("Digite o nome da pessoa ou [0] para sair: ");
			nome = s.nextLine();
			
			if(!nome.equalsIgnoreCase("0")){
				primeiraLetra = nome.charAt(0);					
				
				if (!mapNomes.containsKey(primeiraLetra)){
					listaNomes = new ArrayList<String>();
					mapNomes.put(primeiraLetra, listaNomes);
				}
				mapNomes.get(primeiraLetra).add(nome);
			}

			
		} while (!nome.equalsIgnoreCase("0"));
		s.close();
		
		for (Character key : mapNomes.keySet()) {
			System.out.println(key);
			System.out.println("---------------- \n");
			List<String> imprimeNome = mapNomes.get(key + "\n");
			System.out.println(imprimeNome);
		}
	}
}