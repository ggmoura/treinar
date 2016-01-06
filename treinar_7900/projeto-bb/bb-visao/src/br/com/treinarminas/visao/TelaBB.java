package br.com.treinarminas.visao;

import java.util.Scanner;

public class TelaBB {

	public void iniciarAtividade() {
		
		String opcao = null;
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Informe:\n\t1 - Cadastrar Conta\n\t0 - Sair");
			opcao = leitor.nextLine();
			
		} while (!opcao.equals("0"));
		
		leitor.close();
	}

}
