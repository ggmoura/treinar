package br.treinarminas.treinar.exempleEnum;

import java.util.Scanner;

public class ExercicioEnum {

	private static Scanner s;

	public static void main(String[] args) {
		
		
		s = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para identificar a faixa et�ria: ");
		Integer num = s.nextInt();
		s.nextLine();
		s.close();
		
		
		FaixaEtaria[] faixas = FaixaEtaria.values();
		try {
			
			System.out.println(faixas[num]);
			
		} catch (Exception e) {
			System.out.println("Faixa et�ria n�o existente!");
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
			System.out.println("Faixa Et�ria n�o existe!");
			break;
		}*/
	}

}
