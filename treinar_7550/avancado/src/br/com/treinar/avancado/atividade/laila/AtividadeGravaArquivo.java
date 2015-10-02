package br.com.treinar.avancado.atividade.laila;

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

public class AtividadeGravaArquivo {

	public static void main(String[] args) throws IOException {
		
		Pessoa natan = new Pessoa("Natan", Sexo.M);
		natan.setCpf(10677322224l);

		Pessoa isabela = new Pessoa("Isabela", Sexo.F);
		isabela.setCpf(10020030040l);

		Pessoa marco = new Pessoa("Marco", Sexo.M);
		marco.setCpf(10020030060l);

		List<Pessoa> alunos = new ArrayList<>();

		alunos.add(natan);
		alunos.add(isabela);
		alunos.add(marco);
		
		OutputStream os = new FileOutputStream("Laila.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Pessoa pessoa : alunos) {
			bw.write(pessoa.getNome());
			bw.write(";");
			bw.write(String.valueOf(pessoa.getSexo().ordinal()));
			bw.write(";");
			bw.write(pessoa.getCpf().toString());		
			
			bw.newLine();
		}
		

		bw.close();
		

	}

}
