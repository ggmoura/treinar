package cruz;

import java.util.Scanner;

public class AtividadeExcercao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		try {
			System.out.println("Digite o numero: ");
			Integer numero = leitor.nextInt();
			System.out.println("O numero digitado foi " + numero);
		} catch (Exception e) {
			System.out.println("numero incorreto!");
		} finally {
			leitor.close();
		}
	}
}
