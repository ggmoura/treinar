package br.com.treinar.avancado.atividade.diegoVarella;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeGravaArquivo {

	public static void main(String[] args) throws IOException {
		Pessoa p1 = new Pessoa("Diego", Sexo.M, 1l);
		Pessoa p2 = new Pessoa("Prscila", Sexo.F, 4l);
		Pessoa p3 = new Pessoa("Rodrigo", Sexo.M, 2l);
		Pessoa p4 = new Pessoa("Bianca", Sexo.F, 3l);

		OutputStream os = new FileOutputStream("diegoVarellaArquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lista de Pessoas");
		bw.newLine();
		bw.write(p1.toString());
		bw.newLine();
		bw.write(p2.toString());
		bw.newLine();
		bw.write(p3.toString());
		bw.newLine();
		bw.write(p4.toString());
	

		bw.close();

	}

}
