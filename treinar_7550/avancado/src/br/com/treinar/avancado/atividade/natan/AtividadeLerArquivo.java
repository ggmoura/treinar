package br.com.treinar.avancado.atividade.natan;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeLerArquivo {
	
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("natan.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		List<Pessoa> listPessoas = new ArrayList<>();
		
		String [] pessoa=null;
		
		String s = br.readLine();
		Pessoa p1;
		
		while(s != null){
			pessoa = s.split(";");
			p1 = new Pessoa(pessoa[0]);
			p1.setCpf(Long.valueOf(pessoa[1]));
			p1.setSexo(Sexo.recuperarSexoPorOrdinal(Integer.valueOf(pessoa[2])));
			listPessoas.add(p1);
			s=br.readLine();
	
		}
		
		for (Pessoa persona : listPessoas) {
			System.out.println(persona.toString());
		}

		br.close();
		
		
		
		
	}

}
