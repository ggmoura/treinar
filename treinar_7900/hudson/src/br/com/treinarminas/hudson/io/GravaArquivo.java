package br.com.treinarminas.hudson.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class GravaArquivo {
	
	private String dir;
	private String nomeArq;
	private StringBuilder arq;
	private File file;
	
	public GravaArquivo( String dir, String nomeArq ) throws IOException {
		this.dir = dir;
		this.nomeArq = nomeArq;
		arq = new StringBuilder();
		arq.append(this.dir).append(this.nomeArq);
		OutputStream os = new FileOutputStream(arq.toString());
		os.close();
	}
	
	public void escreveArquivo( String txt ) throws IOException{
		file = new File(arq.toString());
		FileWriter fw = new FileWriter(file);
		fw.write(txt);
		fw.close();
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getNomeArq() {
		return nomeArq;
	}

	public void setNomeArq(String nomeArq) {
		this.nomeArq = nomeArq;
	}
	
}
