package br.com.treinarminas.bb.entitdade.util;

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
import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.bb.entitdade.core.Conta;

public class BBSingleton {

	
	private static BBSingleton instance;
	//private Conta[] contas;
	private List<Conta> contas;

	static {
		instance = new BBSingleton();
	}
	
	private BBSingleton() {
		super();
		contas = new ArrayList<>();
	}
	
	public static BBSingleton getInstance() {
		return instance;
	}
	public void gravarConta(Conta c) {
		c.setNumeroConta(contas.size());
		contas.add(c);
	}
	
	public Conta recuperarConta(Integer numeroConta) {
		return contas.get(numeroConta);
	}

	public List<Conta> recuperarContas() {
		return contas;
	}
	
	public void excluirConta(Integer numeroConta) {
		contas.remove(numeroConta);
	}
	
	public void carregarContas() throws IOException {
		
		File f = new File("contas.txt");
		
		if (!f.exists()) {
			f.createNewFile();
		}
		
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String conta = br.readLine(); // primeira linha

		while (conta != null) {
			
			conta = br.readLine();					
		}
		br.close();
	}
	
	public void gravarContas() throws IOException {
		OutputStream os = new FileOutputStream("contas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (Conta conta : contas) {
			bw.write(conta.csv());
			bw.newLine();
		}
		bw.close();
	}
	
}
