package treinar_Cristiano;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a opção: ");
		
		int opcao = leitor.nextInt();
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Opção um");
			break;
			
		case 2:
			System.out.println("Opção dois");
			break;
			
		case 3:
			System.out.println("Opção tres");
			break;
		
		case 4:
			System.out.println("Opção quatro");
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}
		
	}

}
