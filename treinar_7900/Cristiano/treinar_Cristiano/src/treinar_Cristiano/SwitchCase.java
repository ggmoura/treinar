package treinar_Cristiano;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a op��o: ");
		
		int opcao = leitor.nextInt();
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.println("Op��o um");
			break;
			
		case 2:
			System.out.println("Op��o dois");
			break;
			
		case 3:
			System.out.println("Op��o tres");
			break;
		
		case 4:
			System.out.println("Op��o quatro");
			break;

		default:
			System.out.println("Op��o invalida");
			break;
		}
		
	}

}
