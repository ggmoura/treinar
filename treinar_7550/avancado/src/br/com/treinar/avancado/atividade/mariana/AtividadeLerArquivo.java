package br.com.treinar.avancado.atividade.mariana;

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
		InputStream is = new FileInputStream("gleidson.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Pessoa pessoa = null;
		String[] atributos = null;
		Integer ordinal = null;
		Sexo sexo = null;
		List<Pessoa> pessoas = new ArrayList<>();
		
		String linha = br.readLine(); // primeira linha

		while (linha != null) {
			atributos = linha.split(";");
			pessoa = new Pessoa(atributos[0]);
			//transformando a string do ordinal em inteiro
			ordinal = Integer.parseInt(atributos[1]);
			//transformando o ordinal inteiro em enum Sexo
			sexo = Sexo.recuperarSexoPorOrdinal(ordinal);
			//atribuindo este enum ao objeto pessoa
			pessoa.setSexo(sexo);
			//converte a string cpf em cpf e seta no atributo
			pessoa.setCpf(Long.valueOf(atributos[2]));
			
			pessoas.add(pessoa);
			linha = br.readLine();
		}
		
		for (Pessoa temp : pessoas) {
			System.out.println(temp.getNome());
		}

		br.close();
	}
	
}
