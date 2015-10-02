package br.com.treinar.avancado.atividade.mariana;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeGravaArquivo {

	public static void main(String[] args) throws IOException {
		Pessoa aluno1 = new Pessoa("Aluno 1", Sexo.M, 10481l);
		Pessoa aluno2 = new Pessoa("Aluno 2", Sexo.F, 3132132l);
		Pessoa aluno3 = new Pessoa("Aluno 3", Sexo.M, 456546l);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(aluno1);
		pessoas.add(aluno2);
		pessoas.add(aluno3);
		
		OutputStream os = new FileOutputStream("gleidson.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Pessoa pessoa : pessoas) {
			bw.write(pessoa.getNome());
			bw.write(";");
			bw.write(String.valueOf(pessoa.getSexo().ordinal()));
			bw.write(";");
			bw.write(pessoa.getCpf() != null ? pessoa.getCpf().toString() : "");
			
			bw.newLine();

		}
		
		bw.close();

	}
	
}
