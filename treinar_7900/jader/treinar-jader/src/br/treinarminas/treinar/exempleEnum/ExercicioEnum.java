package br.treinarminas.treinar.exempleEnum;

import java.util.Scanner;

public class ExercicioEnum {

	private static Scanner s;

	public static void main(String[] args) {
		
		
		s = new Scanner(System.in);
		
		System.out.print("Digite um número para identificar a faixa etária: ");
		Integer num = s.nextInt();
		s.nextLine();
		s.close();
		
		
		FaixaEtaria[] faixas = FaixaEtaria.values();
		try {
			
			System.out.println(faixas[num]);
			
		} catch (Exception e) {
			System.out.println("Faixa etária não existente!");
		}
		
		/*switch (num) {
		case 1:
			System.out.println(FaixaEtaria.INFANTIL);
			break;
		case 2:
			System.out.println(FaixaEtaria.ADOLECENTE);
			break;
		case 3:
			System.out.println(FaixaEtaria.ADULTO);
			break;
		case 4:
			System.out.println(FaixaEtaria.IDOSO);
			break;

		default:
			System.out.println("Faixa Etária não existe!");
			break;
		}*/
	}

}
