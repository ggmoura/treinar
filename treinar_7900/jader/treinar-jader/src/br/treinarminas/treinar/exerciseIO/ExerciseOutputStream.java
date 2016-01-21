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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
			
			Set<Entry<Character, List<String>>> entrys = mapNomes.entrySet();
			
			for (Entry<Character, List<String>> entry : entrys) {
				System.out.print(entry.getKey());
				System.out.print(" ");
				
				Collections.sort(entry.getValue());
				
				System.out.println(entry.getValue());
			}
			//bw.write();
			bw.close();

		}
		
		

	}

}

