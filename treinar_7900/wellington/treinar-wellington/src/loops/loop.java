package loops;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome = null;
		
		
		do {
			System.out.print("Informe o nome:");
			nome = leitor.nextLine();
			if (nome == "sair") {
				break;
			}
			
			System.out.println("o nome " + nome + "possui " + (nome.length()) + "letras" );
			
		
						
		}while (!nome.equals("sair"));
		
		leitor.close();
		
		System.out.println("sim do programa......");
		

	}

}
