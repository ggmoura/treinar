package treinar_Cristiano;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteCollection {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		
		//cria o array do tipo collection
		Collection nomes = new ArrayList();
		//cria a classe Scanner para o usuario digitar
		Scanner s = new Scanner(System.in);
		//cria variavel para receber os nomes
		String nome = null;
		
		System.out.println("Digite o nome do afilhado ou 0 para sair: ");
		//salva o nome e passa para a próxima linha
		nome = s.nextLine();
		
		while (!nome.equals("0")) {
			System.out.println("Digite o nome do afilhado ou 0 para sair: ");
			nomes.add(nome);
			nome = s.nextLine();
		}
		s.close();
		System.out.println("Tamanho do Array: " + nomes.size());
		
	}

}
