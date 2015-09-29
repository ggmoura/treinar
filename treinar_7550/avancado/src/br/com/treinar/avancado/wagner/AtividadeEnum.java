package br.com.treinar.avancado.wagner;

import java.util.Scanner;

import br.com.treinar.avancado.Sexo;

public class AtividadeEnum {

	public static void main(String[] args) {

		System.out.println("Digite o cod. do sexo: ");
		Scanner sc = new Scanner(System.in);
		
		Integer codSexo = sc.nextInt() ;
		
		System.out.println( Sexo.values()[codSexo].getDescricao()) ;
		
		// Testando a entrada
		//Sexo[] sexos = Sexo.values();		
		//if (codSexo >= 0 && codSexo < sexos.length) {
		//	System.out.println(sexos[codSexo].getDescricao());			
		//}
		
		
		
		sc.close() ;
	}

}
