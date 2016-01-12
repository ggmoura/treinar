package br.com.treinarminas.visao;

import java.util.Scanner;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.bb.entitdade.ContaCorrente;
import br.com.treinarminas.bb.entitdade.ContaInvestimento;
import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.ContaSalario;
import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.controller.ContaController;

public class TelaBB {

	// contaco
	private Scanner leitor;
	private ContaController controller;

	public TelaBB() {
		controller = new ContaController();
		leitor = new Scanner(System.in);
	}

	public void iniciarAtividade() {
		String opcao = null;

		do {
			imprimirMenu();
			opcao = leitor.nextLine();
			switch (opcao) {
			case "1":
				criarConta();
				System.out.println("Conta criada com sucesso");
				break;

			case "2":
				imprimirSaldo();
				break;

			case "3":
				efetuarSaque();
				break;

			case "4":
				depositar();
				break;
				
			case "5":
				alterarTaxaRendimento();
				break;
				
			case "6":
				captalizarConta();
				break;
				
			case "7":
				tarifarConta();
				break;
				
			default:
				break;
			}

		} while (!opcao.equals("0"));

		leitor.close();
	}

	private void captalizarConta() {
		controller.captalizar();
	}

	private void tarifarConta() {
		controller.tarifar();
	}

	private void alterarTaxaRendimento() {
		System.out.print("Informe o valor da taxa de rendimento: ");
		controller.alterarTaxaRendimento(leitor.nextDouble());
		leitor.nextLine();
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		controller.efetuarDeposito(leitor.nextDouble());
	}

	private void efetuarSaque() {
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = leitor.nextDouble();
		leitor.nextLine();
		Boolean sacou = controller.sacar(valor);

		// utilizando if ternario [mais elegante e mais performatico LoL]
		// System.out.println(sacou ? "Saque efetuado com sucesso!" :
		// "Saldo insuficiente!");

		if (sacou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	private void imprimirSaldo() {
		System.out.println("Saldo: " + controller.recuperarSaldo());
	}

	private void imprimirMenu() {
		System.out.println("Informe:" 
				+ "\n\t1 - Cadastrar Conta"
				+ "\n\t2 - Exibir Saldo" 
				+ "\n\t3 - Efetuar Saque"
				+ "\n\t4 - Depositar"
				+ "\n\t5 - Alterar Taxa de Rendimento"
				+ "\n\t6 - Captalizar Conta"
				+ "\n\t7 - Tarifar Conta"
				+ "\n\t0 - Sair");
	}

	private void criarConta() {

		System.out.println("\n\t\t1 - Conta Corrente"
						 + "\n\t\t2 - Conta Poupança"
						 + "\n\t\t3 - Conta Salário"
						 + "\n\t\t4 - Conta Investimento");

		Conta c = null;

		Integer opcao = leitor.nextInt();
		leitor.nextLine();
		switch (opcao) {
		case 1:
			c = new ContaCorrente();
			cadastrarConta((ContaCorrente) c);
			break;
		case 2:
			c = new ContaPoupanca();
			cadastrarConta((ContaPoupanca) c);

			break;
		case 3:
			c = new ContaSalario();
			cadastrarConta((ContaSalario) c);

			break;
		case 4:
			c = new ContaInvestimento();
			cadastrarConta((ContaInvestimento) c);
			
			break;

		default:
			break;
		}

		controller.cadastrarConta(c);

	}

	private void cadastrarConta(Conta c) {

		System.out.print("Informe o nome do correntista: ");
		c.setCliente(new Cliente());

		// facilitando a leitura do codigo o metodo getCliente retorna a
		// referencia do cliente criada na linha [c.setCliente(new Cliente())]
		// Cliente cliente = c.getCliente();
		// cliente.setNome(leitor.nextLine());

		c.getCliente().setNome(leitor.nextLine());
		System.out.print("Informe o saldo da conta: ");
		c.depositar(leitor.nextDouble());
		leitor.nextLine();

	}

	private void cadastrarConta(ContaCorrente c) {
		cadastrarConta((Conta)c);
		System.out.print("Informe o valor do limite de credito: ");
		c.setLimiteCreditoDisponivel(leitor.nextDouble());
		System.out.print("Informe o valor da taxa de manutenção: ");
		c.setTaxaManutencao(leitor.nextDouble());
		leitor.nextLine();
	}

	private void cadastrarConta(ContaInvestimento c) {
		cadastrarConta((Conta)c);
		System.out.print("Informe o valor da taxa de manutenção: ");
		c.setTaxaManutencao(leitor.nextDouble());
		System.out.print("Informe o valor da taxa de rendimento: ");
		c.setTaxaRendimento(leitor.nextDouble());
		leitor.nextLine();
	}
	
	private void cadastrarConta(ContaPoupanca c) {
		cadastrarConta((Conta)c);
	}

	private void cadastrarConta(ContaSalario c) {
		cadastrarConta((Conta)c);
	}

}
