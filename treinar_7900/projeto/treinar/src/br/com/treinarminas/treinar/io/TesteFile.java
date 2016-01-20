package br.com.treinarminas.treinar.io;

import java.io.File;
import java.io.IOException;

public class TesteFile {

	
	public static void main(String[] args) throws IOException {
		//String dir = "D:" + File.separator + "gleidson";
		StringBuilder dir = new StringBuilder();
		
		dir.append("D:").append(File.separator).append("gleidson");
		dir.append(File.separator).append("java-io");
		
		System.out.println(dir.toString());
		
		File f = new File(dir.toString());
		f.mkdir();
		dir.append(File.separator).append("arquivo.txt");
		f = new File(dir.toString());
		
		f.createNewFile();
	}
	
}
