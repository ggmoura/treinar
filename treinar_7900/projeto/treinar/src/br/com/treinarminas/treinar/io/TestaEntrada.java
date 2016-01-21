package br.com.treinarminas.treinar.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

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
					primeiraLetra = Character.toUpperCase(nome.charAt(0));
					
					if (!mapNomes.containsKey(primeiraLetra)) {
						listaNomes = new ArrayList<String>();
						mapNomes.put(primeiraLetra, listaNomes);
					}
					mapNomes.get(primeiraLetra).add(nome);
				}
				nome = br.readLine();					
			}
			br.close();
			
			
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			List<Entry<Character, List<String>>> entrysList = new ArrayList<>(mapNomes.entrySet());
			
			Collections.sort(entrysList, new Comparator<Entry<Character, List<String>>>() {

				@Override
				public int compare(Entry<Character, List<String>> o1,
						Entry<Character, List<String>> o2) {
					return o1.getKey().compareTo(o2.getKey());
				}
			});
			
			//ordena sem acentuacao
			Collator collator = Collator.getInstance();
			collator.setStrength(Collator.PRIMARY);
			
			StringBuilder sb = new StringBuilder();
			
			for (Entry<Character, List<String>> entry : entrysList) {
				Collections.sort(entry.getValue(), collator);
				sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
			}
			bw.write(sb.toString());
			bw.close();
			
			
		}

	}

}
