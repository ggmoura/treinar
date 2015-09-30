package br.com.treinar.avancado.atividade.marco;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtividadeEnum {

	public static void main(String[] args) {
		Integer n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 0 para feminino\nInforme 1 para Masculino");
		n = sc.nextInt();
		//Sexo [] sexos = Sexo.values();
		
		System.out.println(Sexo.values()[n].getDescricao());

		sc.close();
	}

}