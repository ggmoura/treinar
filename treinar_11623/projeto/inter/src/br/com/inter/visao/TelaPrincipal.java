package br.com.inter.visao;

import java.util.Scanner;

import br.com.inter.modelo.Cliente;
import br.com.inter.modelo.principal.Conta;

public class TelaPrincipal {

	private Scanner teclado = new Scanner(System.in);
	private Conta conta;

	public void iniciar() {
		imprimirMenu();
		Integer opcao = teclado.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				conta = criarConta();
				break;
			case 0:
				System.out.println("Valeu");
				break;
			case 2:
				exibirSaldo();
				break;
			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}
			imprimirMenu();
			opcao = teclado.nextInt();
		}

	}

	private void exibirSaldo() {
		System.out.println("Saldo da conta: " + conta.getSaldo());
	}

	private Conta criarConta() {
		System.out.print("Informe o número da conta: ");
		Integer numeroConta = teclado.nextInt();
		Conta c = new Conta(numeroConta);
		System.out.print("Informe a senha da conta [numérico]: ");
		Integer senha = teclado.nextInt();
		c.setSenha(senha);
		System.out.print("Informe a agência da conta: ");
		c.setAgencia(teclado.nextInt());
		teclado.nextLine();//jogando fora o enter da leitura do inteiro anterior
		System.out.print("Informe o nome do Cliente da conta: ");
		c.setCliente(new Cliente());
		c.getCliente().setNome(teclado.nextLine());
		System.out.print("Informe a idade do Cliente da conta: ");
		c.getCliente().setIdade(teclado.nextInt());
		return c;
	}

	/**
	 * Metodo utilizado apenas nesta classe, portanto, privado.
	 */
	private void imprimirMenu() {
		System.out.print("Digite\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir Saldo\n\t"
				+ "0 - Sair\n=> ");
	}

}
