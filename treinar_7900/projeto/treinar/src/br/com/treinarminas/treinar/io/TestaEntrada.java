package br.com.treinarminas.treinar.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {
		
		File f = new File("arquivo.txt");
		
		if (f.exists()) {
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String s = br.readLine(); // primeira linha
			
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
			
		}

	}

}
