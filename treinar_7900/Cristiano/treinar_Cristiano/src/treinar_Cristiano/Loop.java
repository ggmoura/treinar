package treinar_Cristiano;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		
		do {
			System.out.print("Informe o nome: ");
			nome = leitor.nextLine();
			if (!nome.equals("sair")) {
				System.out.println("O nome "+ nome + " possui " + nome.length() + " letras"  );
			}						
		} while (!nome.equals("sair"));
		
		leitor.close();
		System.out.println("Fim do programa");
		
	}

}
