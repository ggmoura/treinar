package br.com.inter.visao;

import java.util.Scanner;

import br.com.inter.modelo.Cliente;
import br.com.inter.modelo.ContaCorrente;
import br.com.inter.modelo.ContaInvestimento;
import br.com.inter.modelo.ContaPoupanca;
import br.com.inter.modelo.principal.Conta;
import br.com.inter.modelo.principal.IProdutoRentavel;

public class TelaPrincipal {

	private Scanner teclado = new Scanner(System.in);
	private Conta conta;

	public void iniciar() {
		Integer opcao;
		do {
			imprimirMenu();
			opcao = teclado.nextInt();
			if (opcao != 0) {
				switch (opcao) {
				case 1:
					conta = criarConta();
					break;
				case 2:
					exibirSaldo();
					break;
				case 3:
					depositar();
					break;
				case 4:
					sacar();
					break;
				case 5:
					cadastrarTaxaRendimento();
					break;
				case 6:
					aplicarRendimento();
					break;
				case 0:
					System.out.println("Valeu");
					break;
				default:
					System.out.println("Opção inválida, tente novamente!");
					break;
				}
			} else {
				System.out.println("Fim do programa");
			}
		} while (opcao != 0);

	}

	private void aplicarRendimento() {
		if (conta instanceof IProdutoRentavel) {
			((IProdutoRentavel)conta).render();
		}
	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de rendimento da poupança: ");
		ContaPoupanca.setTaxaRendimento(teclado.nextFloat());
	}

	private void sacar() {
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = teclado.nextDouble();
		Boolean sacou = conta.sacar(valor);
		if (sacou) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = teclado.nextDouble();
		conta.deposita(valor);
	}

	private void exibirSaldo() {
		System.out.println("Saldo da conta: " + conta.recuperarSaldo());
	}

	private Conta criarConta() {
		Conta c = null;
		System.out.print(
				"Digite\n\t" + "1 - Conta Corrente\n\t" + "2 - Conta Poupança\n\t" + "3 - Conta Investimento\n=> ");

		Integer tipoConta = teclado.nextInt();
		switch (tipoConta) {
		case 1:
			c = new ContaCorrente();
			criarConta((ContaCorrente) c);
			break;
		case 2:
			c = new ContaPoupanca();
			criarConta((ContaPoupanca) c);
			break;
		case 3:
			c = new ContaInvestimento();
			criarConta((ContaInvestimento) c);
			break;
		default:
			System.out.println("Tipo de conta inválido.");
			break;
		}
		return c;
	}

	private void criarConta(ContaInvestimento investimento) {
		criarConta((Conta)investimento);
	}

	private void criarConta(ContaPoupanca poupanca) {
		criarConta((Conta)poupanca);
	}

	private void criarConta(ContaCorrente corrente) {
		criarConta((Conta)corrente);
		System.out.print("Informe o limite de crédito da conta: ");
		corrente.setLimiteCredito(teclado.nextDouble());
	}

	private void criarConta(Conta c) {
		System.out.print("Informe o número da conta: ");
		Integer numeroConta = teclado.nextInt();
		c.setNumero(numeroConta);
		System.out.print("Informe a senha da conta [numérico]: ");
		Integer senha = teclado.nextInt();
		c.setSenha(senha);
		System.out.print("Informe a agência da conta: ");
		c.setAgencia(teclado.nextInt());
		teclado.nextLine();// jogando fora o enter da leitura do inteiro anterior
		System.out.print("Informe o nome do Cliente da conta: ");
		c.setCliente(new Cliente());
		c.getCliente().setNome(teclado.nextLine());
		System.out.print("Informe a idade do Cliente da conta: ");
		c.getCliente().setIdade(teclado.nextInt());
	}

	/**
	 * Metodo utilizado apenas nesta classe, portanto, privado.
	 */
	private void imprimirMenu() {
		System.out.print("Digite\n\t" +
				"1 - Criar Conta\n\t" +
				"2 - Exibir Saldo\n\t" +
				"3 - Depositar\n\t" +
				"4 - Sacar\n\t" +
				"5 - Cadastrar Taxa Rendimento Poupança\n\t" +
				"6 - Aplicar Rendimento\n\t" +
				"0 - Sair\n=> ");
	}

}
