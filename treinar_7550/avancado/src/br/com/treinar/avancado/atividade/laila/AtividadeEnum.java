package br.com.treinar.avancado.atividade.laila;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtividadeEnum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 0 para feminino e 1 para masculino: ");
		Sexo[] sexos = Sexo.values();
		Integer opcao = sc.nextInt();
		
		
		
		System.out.println(sexos[opcao].getDescricao());

		sc.close();

	}

}
