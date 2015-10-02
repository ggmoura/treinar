package br.com.treinar.avancado.atividade.cruz;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeGravarArquivo {

	

	public static void main(String[] args) throws IOException {
		
		Pessoa p1 = new Pessoa("jhon", Sexo.M);
		p1.setCpf(3l);

		Pessoa p2 = new Pessoa("mary", Sexo.F);
		p2.setCpf(2l);

		Pessoa p3 = new Pessoa("joe", Sexo.M);
		p3.setCpf(1l);

		List<Pessoa> nomes = new ArrayList<>();
		
		nomes.add(p1);
		nomes.add(p2);
		nomes.add(p3);
		
		OutputStream os = new FileOutputStream("cruz.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Pessoa pessoa : nomes) {
			bw.write(pessoa.getNome());
			bw.write(";");
			bw.write(pessoa.getSexo().ordinal());
			bw.write(";");
			bw.write(pessoa.getCpf().toString());
			bw.newLine();
		}
		bw.close();
		
		
		
	}

}
