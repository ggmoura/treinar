package br.com.treinar.avancado.atividade.marco;

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
		
		Pessoa p = new Pessoa("Marco",Sexo.M);
		Pessoa p1 = new Pessoa("João",Sexo.M);
		Pessoa p2 = new Pessoa("Leila",Sexo.F);
		
		List<Pessoa> atividadeIO = new ArrayList<>();
		atividadeIO.add(p);
		atividadeIO.add(p1);
		atividadeIO.add(p2);
				
		OutputStream os = new FileOutputStream("saidaMarco.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (Pessoa pessoa : atividadeIO) {
			
			bw.write(pessoa.getNome()+";"+pessoa.getSexo().getDescricao());
			bw.newLine();
			
		
			
		}
		
		bw.close();
	}

}
