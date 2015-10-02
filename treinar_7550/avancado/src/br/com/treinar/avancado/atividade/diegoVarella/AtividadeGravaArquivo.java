package br.com.treinar.avancado.atividade.diegoVarella;

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

		Pessoa pessoa1 = new Pessoa("Diego", Sexo.M, 4l);
		Pessoa pessoa2 = new Pessoa("Priscila", Sexo.F, 3l);
		Pessoa pessoa3 = new Pessoa("Rodrigo", Sexo.M, 2l);
		Pessoa pessoa4 = new Pessoa("Bianca", Sexo.F, 1l);

		List<Pessoa> listaPessoas = new ArrayList<>();

		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		listaPessoas.add(pessoa4);

		OutputStream os = new FileOutputStream("diegoVarellaArquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		for (Pessoa pessoa : listaPessoas) {
			bw.write(pessoa.getNome() + ";" + pessoa.getCpf().toString() + ";" + pessoa.getSexo().ordinal() + ";");
			bw.newLine();
		}

		bw.close();

	}

}
