package br.com.inter.visao;

import java.util.Scanner;

import br.com.inter.modelo.Cliente;
import br.com.inter.modelo.ContaCorrente;
import br.com.inter.modelo.ContaInvestimento;
import br.com.inter.modelo.ContaPoupanca;
import br.com.inter.modelo.principal.Conta;
import br.com.inter.modelo.principal.IProdutoPagavel;
import br.com.inter.modelo.principal.IProdutoRentavel;

public class TelaPrincipal {

	private Scanner teclado = new Scanner(System.in);
	private Conta[] contas;
	private Integer index;
	
	public TelaPrincipal() {
		contas = new Conta[10];
		index = 0;
	}

	public void iniciar() {
		Integer opcao;
		do {
			imprimirMenu();
			opcao = teclado.nextInt();
			if (opcao != 0) {
				switch (opcao) {
				case 1:
					criarConta();
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
				case 7:
					cobrarTarifa();
					break;
				case 8:
					exibirDadosContas();
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

	private void exibirDadosContas() {
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				conta = contas[i];
				System.out.println("Conta: ".concat(conta.getNumero().toString()).concat(" Proprietári(a)o: ".concat(conta.getCliente().getNome())).concat(", Saldo: ").concat(conta.recuperarSaldo().toString()));
			}
		}
	}

	private void aplicarRendimento() {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i] instanceof IProdutoRentavel) {
				((IProdutoRentavel)contas[i]).render();
			}
		}
		
	}
	
	private void cobrarTarifa() {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i] instanceof IProdutoRentavel) {
				((IProdutoPagavel)contas[i]).pagar();
			}
		}
	}

	private void cadastrarTaxaRendimento() {
		System.out.print("Informe a taxa de rendimento da poupança: ");
		ContaPoupanca.setTaxaRendimento(teclado.nextFloat());
	}

	private void sacar() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.print("Informe o valor a ser sacado: ");
			Double valor = teclado.nextDouble();
			Boolean sacou = conta.sacar(valor);
			if (sacou) {
				System.out.println("Saque efetuado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Conta inválida!");
		}
	}

	private void depositar() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.print("Informe o valor a ser depositado: ");
			Double valor = teclado.nextDouble();
			conta.deposita(valor);
		} else {
			System.out.println("Conta inválida!");
		}
	}

	private void exibirSaldo() {
		Conta conta = recuperarConta();
		if (conta != null) {
			System.out.println("Saldo da conta: " + conta.recuperarSaldo());
		} else {
			System.out.println("Conta inválida!");
		}
	}

	private Conta recuperarConta() {
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getNumero().equals(numeroConta)) {
				conta = contas[i];
				break;
			}
		}
		return conta;
	}

	private void criarConta() {
		if (index < 10) {
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
			contas[index++] = c;
		} else {
			System.out.println("Não é possível criar mais contas");
		}
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
				"7 - Cobrar Tarifa\n\t" +
				"8 - Listar Dados Contas\n\t" +
				"0 - Sair\n=> ");
	}

}
