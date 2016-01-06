package loops;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leitor = new Scanner(System.in);
			
			System.out.print("Informe a opção:");
			
		int opcao = leitor.nextInt();
		
		leitor.close();
		
		switch (opcao) {
		case 1:
			System.out.print("NUMERO DIGITADO E O 1");
			break;
		case 2:
			System.out.print("NUMERO DIGITADO E O 2");
			break;
		case 3:
			System.out.print("NUMERO DIGITADO E O 3");
			break;
		case 4:
			System.out.print("NUMERO DIGITADO E O 4");
			break;

		default:
			System.out.print("DIGITE UMA OPÇAO VALIDA");
			break;
		}
	}

}
