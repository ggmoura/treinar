package br.com.treinarminas.visao;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.treinarminas.bb.entitdade.AppException;
import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.bb.entitdade.ContaCorrente;
import br.com.treinarminas.bb.entitdade.ContaInvestimento;
import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.ContaSalario;
import br.com.treinarminas.bb.entitdade.core.Conta;
import br.com.treinarminas.bb.entitdade.util.Constante;
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
				
			case "8":
				excluirConta();
				break;
				
			case "9":
				listarContas();
				break;
			case "0":
				finalizar();
				break;
				
			default:
				break;
			}

		} while (!opcao.equals("0"));

		leitor.close();
	}

	private void finalizar() {
		try {
			controller.fecharPrograma();
		} catch (IOException e) {
			System.err.println(Constante.MENSAGEM_ERRO_GRAVAR_CONTAS);
		}
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
		Integer numeroConta = recuperarConta();
		System.out.print("Informe o valor a ser depositado: ");
		controller.efetuarDeposito(leitor.nextDouble(), numeroConta);
	}

	private void efetuarSaque() {
		Integer numeroConta = recuperarConta();
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = leitor.nextDouble();
		leitor.nextLine();
		try {
			controller.sacar(valor, numeroConta);
			System.out.println("Saque efetuado com sucesso!");
		} catch (AppException e) {
			tratarErroCode(e);
		}
	}

	private void imprimirSaldo() {
		Integer numeroConta = recuperarConta();
		System.out.println("Saldo: " + controller.recuperarSaldo(numeroConta));
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
				+ "\n\t8 - Excluir Conta"
				+ "\n\t9 - Listar Contas"
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
		
		try {
			validarConta(c);
			controller.cadastrarConta(c);
		} catch (AppException e) {
			tratarErroCode(e);
		}

	}

	private void validarConta(Conta c) throws AppException {
		Boolean contaValida = Boolean.TRUE;
		if (c == null || c.getSaldo() == null) {
			contaValida = Boolean.FALSE;			
		}
		if (c.getCliente() == null || c.getCliente().getNome() == null || Constante.STRING_VAZIA.equals(c.getCliente().getNome())) {
			contaValida = Boolean.FALSE;
		}
		if (!contaValida) {
			throw new AppException(1);
		}
		
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
	
	private Integer recuperarConta() {
		List<Conta> contas = controller.recuperarContas();
		for (Conta conta : contas) {
			System.out.println(conta.getNumeroConta() + " - " + conta.getCliente().getNome());
		}
		System.out.print("Digite o numero da conta: ");
		Integer numeroConta = leitor.nextInt();
		leitor.nextLine();
		
		return numeroConta;
	}
	
	private void excluirConta() {
		Integer numeroConta = recuperarConta();
		controller.removerContaDoBanco(numeroConta);
	}
	
	private void cadastrarConta(ContaPoupanca c) {
		cadastrarConta((Conta)c);
	}

	private void cadastrarConta(ContaSalario c) {
		cadastrarConta((Conta)c);
	}
	
	private void listarContas() {
		List<Conta> contas = controller.recuperarContas();
		for (Conta conta : contas) {
			System.out.println(conta);
		}
		System.out.println("\n");
	}
	
	private void tratarErroCode(AppException e) {
		switch (e.getCodigoErro()) {
		case 0:
			System.out.println("saldo insuficiente...");
			break;
		case 1:
			System.out.println("Dados da conta incompleto...");
			break;

		default:
			break;
		}
	}
}
