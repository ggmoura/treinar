package br.com.treinarminas.visao;

import java.util.Scanner;

import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.controller.ContaController;

public class TelaBB {

	//contaco
	private Scanner leitor = new Scanner(System.in);
	private ContaController controller;
	
	public void iniciarAtividade() {
		controller = new ContaController();
		String opcao = null;
		
		do {
			imprimirMenu();
			opcao = leitor.nextLine();
			switch (opcao) {
			case "1":
				Conta c = criarConta();
				controller.cadastrarConta(c);
				System.out.println("Conta criada com sucesso...");
				break;
			case "2":
				System.out.println(controller.recuperarSaldo());
				break;

			default:
				break;
			}
			
		} while (!opcao.equals("0"));
		
		leitor.close();
	}

	private Conta criarConta() {
		Conta c = new Conta();
		System.out.print("Informe o nome do correntista: ");
		c.nomeCorrentista = leitor.nextLine();
		System.out.print("Informe o valor do saldo: ");
		c.depositar(leitor.nextDouble());
		System.out.print("Informe o valor do limite de crédito: ");
		c.depositar(leitor.nextDouble());
		leitor.nextLine();
		return c;
	}

	private void imprimirMenu() {
		System.out.println("Informe:"
				+ "\n\t1 - Cadastrar Conta"
				+ "\n\t2 - Exibir saldo da Conta"
				+ "\n\t0 - Sair");
	}
	
}
