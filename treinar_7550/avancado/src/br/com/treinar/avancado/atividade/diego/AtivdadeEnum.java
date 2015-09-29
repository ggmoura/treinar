package br.com.treinar.avancado.atividade.diego;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtivdadeEnum {

	public static void main(String[] args) {
		
		//Sexo s = Sexo.M;

		//System.out.println(s.getDescricao());

		System.out.println("Digite: ");

		Sexo[] sexos = Sexo.values();

		for (Sexo sexo : sexos) {
			System.out.println(sexo + " - " + sexo.getDescricao());
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		//String sexoStr = sc.next();
		int sexoInt = sc.nextInt();

		//Sexo escolhido = Sexo.valueOf(sexoStr.toUpperCase());
		
		if (sexoInt == 0) {
			System.out.println("O sexo digitado é feminino");
		}else {
			System.out.println("O sexo digitado é masculino");
		}

		//System.out.println(escolhido.getDescricao() + " posição ENUM " + escolhido.ordinal());
		sc.close();

	}

}
