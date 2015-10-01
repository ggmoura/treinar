package br.com.treinar.avancado.atividade.diegoVarella;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtivdadeEnum {

	public static void main(String[] args) {
		
		System.out.println("Digite: ");

		Sexo[] sexos = Sexo.values();

		for (Sexo sexo : sexos) {
			System.out.println(sexo + " - " + sexo.getDescricao());
		}

		System.out.println();
		Scanner sc = new Scanner(System.in);
		int sexoInt = sc.nextInt();
		
		if (sexoInt == 0) {
			System.out.println("O sexo digitado é feminino");
		}else {
			System.out.println("O sexo digitado é masculino");
		}

		sc.close();

	}

}
