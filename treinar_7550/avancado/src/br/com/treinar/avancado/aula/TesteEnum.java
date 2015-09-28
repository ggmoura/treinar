package br.com.treinar.avancado.aula;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class TesteEnum {

	public static void main(String[] args) {
		
		
		Sexo s = Sexo.M;
		
		System.out.println(s.getDescricao());
		
		System.out.println("Digite: ");
//		Devemos evitar codigos diretos
//		System.out.println("0 - Feminino" );
//		System.out.println("1 - Masculino" );
		
		Sexo[] sexos = Sexo.values(); 	
		
		
		for (Sexo sexo : sexos) {
			System.out.println(sexo + " - " + sexo.getDescricao());
		}
		
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String sexoStr = sc.nextLine();
		
		Sexo escolhido = Sexo.valueOf(sexoStr);
		
		System.out.println(escolhido.getDescricao() + " posicao enum " + escolhido.ordinal());
		sc.close();
		
	}
	
}
