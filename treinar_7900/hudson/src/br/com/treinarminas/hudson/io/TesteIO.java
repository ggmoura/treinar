package br.com.treinarminas.hudson.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TesteIO {
	public static void main(String[] args) {
		try {
			StringBuilder str = new StringBuilder();
			Map<Character, List<String>> meuMapa = new HashMap<>();
			Character primeiraLetra = null;
			// recupera o arquivo
			File f = new File(
					"C:/Hudson/treinar/treinar_7900/hudson/src/br/com/treinarminas/hudson/io/nomes.txt");
			// testa se o arquivo existe para continuar com a leitura
			if (f.exists()) {

				InputStream is = new FileInputStream(f);
				InputStreamReader rd = new InputStreamReader(is);
				BufferedReader bf = new BufferedReader(rd);

				String linha = bf.readLine();

				while (linha != null) {
					if (!linha.isEmpty()) {

						primeiraLetra = Character.toUpperCase(linha.charAt(0));
						if (!meuMapa.containsKey(primeiraLetra)) {
							meuMapa.put(primeiraLetra, new ArrayList<>());
						}
						meuMapa.get(primeiraLetra).add(linha);
					}
					linha = bf.readLine();
				}
				bf.close();

				// imprime o keyset seguido por seus valores ordenados pela
				// primeira
				// letra da key e dos valores da lista
				Map<Character, List<String>> sort = new TreeMap<>(
						new Comparator<Character>() {

							@Override
							public int compare(Character o1, Character o2) {
								return o1.compareTo(o2);
							}
						});

				sort.putAll(meuMapa);

				Set<Character> keySet = sort.keySet();
				for (Character character : keySet) {
					System.out.println(character);
					str.append(character).append("\n");
					List<String> list = meuMapa.get(character);
					list.sort(new Comparator<String>() {

						@Override
						public int compare(String o1, String o2) {
							return o1.toUpperCase().compareTo(o2.toUpperCase());
						}
					});
					for (String string : list) {
						System.out.println("\t" + string);
						str.append("\t").append(string).append("\n");
					}
				}
			}

			GravaArquivo arquivo = new GravaArquivo(
					"C:/Hudson/treinar/treinar_7900/hudson/src/br/com/treinarminas/hudson/io/",
					"nomes2.txt");
			arquivo.escreveArquivo(str.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
