package br.treinarminas.treinar.exerciseIO;

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

public class ExerciseOutputStream {

	public static void main(String[] args) throws IOException  {
		
		File f = new File("C:/exercicio/arquivo.txt");
		
		if (f.exists()){
			
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String  thisLine = null;
			Map<Character, List<String>> mapNomes = new HashMap<Character, List<String>>();
			String nome = null;
			Character primeiraLetra = null;
			List<String> listaNomes = null;
					
			while ((thisLine = br.readLine()) != null) {
				if (!thisLine.isEmpty()){
					nome = thisLine;
					primeiraLetra = nome.toUpperCase().charAt(0);
					
					if (!mapNomes.containsKey(primeiraLetra)){
						listaNomes = new ArrayList<String>();
						mapNomes.put(primeiraLetra, listaNomes);
					}
					mapNomes.get(primeiraLetra).add(nome);	
				}								
			}
			
			br.close();
			
			/*for (Character key : mapNomes.keySet()) {
				System.out.println(key);
				System.out.println("----------------");
				List<String> imprimeNome = mapNomes.get(key);
				System.out.println(imprimeNome);
				System.out.println("\n");
			}*/
			OutputStream os = new FileOutputStream("C:/exercicio/saida.txt");
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

