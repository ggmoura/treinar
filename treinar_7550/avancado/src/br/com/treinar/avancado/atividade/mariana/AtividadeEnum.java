package br.com.treinar.avancado.atividade.mariana;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtividadeEnum {

	public static void main(String[] args) {
		System.out.print("Digite o numero: ");
		Sexo[] sexos = Sexo.values();
		Scanner sc = new Scanner(System.in);
		Integer opcao = sc.nextInt();

		if (opcao >= 0 && opcao < sexos.length) {
			System.out.println(sexos[opcao].getDescricao());			
		} else {
			System.out.println("Opção Inválida...");
		}
		
		
		sc.close();
		
		
		
	}
	
}
