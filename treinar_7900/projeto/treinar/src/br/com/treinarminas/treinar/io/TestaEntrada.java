package br.com.treinarminas.treinar.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {

		File f = new File("arquivo.txt");
		Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();
		String nome = null;
		Character primeiraLetra = null;
		List<String> listaNomes = null;
		if (f.exists()) {
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			nome = br.readLine(); // primeira linha

			while (nome != null) {
				if (!nome.isEmpty()) {
					primeiraLetra = nome.charAt(0);
					
					if (!mapNomes.containsKey(primeiraLetra)) {
						listaNomes = new ArrayList<String>();
						mapNomes.put(primeiraLetra, listaNomes);
					}
					mapNomes.get(primeiraLetra).add(nome);
				}
				nome = br.readLine();					
			}
			br.close();
			System.out.println(mapNomes);
		}

	}

}
