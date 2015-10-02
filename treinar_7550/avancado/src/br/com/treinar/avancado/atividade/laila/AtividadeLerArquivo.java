package br.com.treinar.avancado.atividade.laila;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeLerArquivo {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa = null;
		String[] pessoasStr = null;
		
		InputStream is = new FileInputStream("Laila.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine(); 
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (s != null) {
			pessoasStr = s.split(";");
			pessoa = new Pessoa(pessoasStr[0]);			
			
			pessoa.setSexo(Sexo.recuperarSexoPorOrdinal(Integer.valueOf(pessoasStr[1])));
			pessoa.setCpf(Long.valueOf(pessoasStr[2]));
			
			pessoas.add(pessoa);
			
			s = br.readLine();
			
		}

		System.out.println(pessoas);
		
		br.close();		
		
		for (Pessoa pessoaTemp : pessoas) {
			System.out.print(pessoaTemp);
		}
		

	}

}
