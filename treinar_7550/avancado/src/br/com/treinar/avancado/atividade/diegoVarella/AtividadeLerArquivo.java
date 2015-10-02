package br.com.treinar.avancado.atividade.diegoVarella;

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

		InputStream is = new FileInputStream("diegoVarellaArquivo.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();

		List<Pessoa> pessoas = new ArrayList<>();

		Pessoa p = null;
		String[] array = null;

		while (s != null) {

			array = s.split(";");

			p = new Pessoa(array[0]);
			p.setSexo(Sexo.recuperarSexoPorOrdinal(Integer.valueOf(array[2])));
			p.setCpf(Long.valueOf(array[1]));
			pessoas.add(p);

			s = br.readLine();
		}

		System.out.println(pessoas);
		br.close();
	}

}