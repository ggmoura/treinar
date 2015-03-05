package br.com.treinar.itau;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import br.com.treinar.itau.controle.ContaControle;
import br.com.treinar.itau.modelo.ContaCorrente;
import br.com.treinar.itau.modelo.ContaInvestimento;
import br.com.treinar.itau.modelo.ContaPoupanca;
import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;
import br.com.treinar.itau.modelo.util.ItauUtil;

public class Itau {


	public final Integer horaAbertura;
	private ContaControle contaControle;
	
	public Itau() {
		this.horaAbertura = 12;
		contaControle = new ContaControle();
	}
	
	public void iniciar() {
		
		//atributo final nao pode ser modificado
		//horaAbertura = 12;
		Integer opcao = 0;
		String opcaoStr = null;
		do {
			opcaoStr = menu();
			opcao = Integer.parseInt(opcaoStr);
			switch (opcao) {
			case 0:
				ItauUtil itauUtil = ItauUtil.getInstance();
				String data = itauUtil.formatarData(new Date());
				JOptionPane.showMessageDialog(null, "Fim do programa " + data);
				break;
			case 1:
				criarConta();
				break;
			case 2:
				depositar();					
				break;
			case 3:
				sacar();
				break;
			case 4:
				exibirSaldo();					
				break;
			case 5:
				captalizarContas();					
				break;
			case 6:
				tarifarContas();					
				break;
			case 7:
				cadastrarTaxaRendimento();					
				break;
			default:
				break;
			}
			
		} while (opcao != 0);
	}

	private void tarifarContas() {
		contaControle.tarifarContas();
	}

	private void captalizarContas() {
		contaControle.captalizarContas();
	}

	private void exibirSaldo() {
		Conta conta = recuperarConta();
		if (conta != null) {
			JOptionPane.showMessageDialog(null, "Saldo: " + String.valueOf(conta.recuperarSaldo()));			
		} else {
			JOptionPane.showMessageDialog(null, "Conta nao cadastrada!");
		}
	}

	private String menu() {
		String opcaoStr = JOptionPane.showInputDialog("Informe uma op��o:\n"
				+ "1 - Cadastrar Conta\n"
				+ "2 - Depositar\n"
				+ "3 - Sacar\n"
				+ "4 - Exibir Saldo\n"
				+ "5 - Captalizar Contas\n"
				+ "6 - Cobrar Tarifa\n"
				+ "7 - Cadastrar Taxa Rendimento\n"
				+ "0 - Sair\n");
		return opcaoStr;
	}

	private void sacar() {
		Conta conta = recuperarConta();
		if (conta != null) {
			Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));			
			Boolean saqueEfetuado = conta.sacar(valorSaque);
			JOptionPane.showMessageDialog(null, saqueEfetuado ? "Saque efetuado!" : "Saque nao efetuado");					
		} else {
			JOptionPane.showMessageDialog(null, "Conta n�o encontrada!");			
		}
	}

	private void depositar() {
		Conta conta = recuperarConta();
		if (conta != null) {
			Double depositoN = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));			
			Boolean depositoEfetuado = conta.depositar(depositoN);
			JOptionPane.showMessageDialog(null, depositoEfetuado ? "Deposito efetuado!" : "Deposito nao efetuado");			
		} else {
			JOptionPane.showMessageDialog(null, "Conta n�o encontrada!");			
		}
		
	}

	private Conta recuperarConta() {
		Integer numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta"));
		Conta conta = contaControle.recuperarConta(numeroConta);
		return conta;
	}

	private void criarConta() {
		Conta conta = null;
		String menu = "1 - Corrente\n2 - Poupan�a\n3 - Investimento";
		String opcao = JOptionPane.showInputDialog(menu);
		switch (opcao) {
		case "1":
			conta = new ContaCorrente();
			ContaCorrente contaCorrente = (ContaCorrente) conta;
			criarConta(contaCorrente);			
			break;
		case "2":
			conta = new ContaPoupanca();
			criarConta((ContaPoupanca) conta);
			break;
		case "3":
			conta = new ContaInvestimento();
			criarConta((ContaInvestimento) conta);
			break;

		default:
			break;
		}
		Boolean gravou = contaControle.gravarConta(conta);
		JOptionPane.showMessageDialog(null, gravou ? "Conta cadastrada com sucesso!" : "Conta n�o pode ser cadastrada!");			
	}

	private void cadastrar(Conta conta) {
		String numeroContaStr;
		numeroContaStr = JOptionPane.showInputDialog("Digite o numero da conta");
		conta.setNumeroConta(Integer.parseInt(numeroContaStr));
		//jah acontece no construtor de conta
		//conta.pessoa = new Pessoa();
		conta.getPessoa().nome = JOptionPane.showInputDialog("Digite o nome do proprietario");
		conta.getPessoa().cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do proprietario"));
	}
	
	private void criarConta(ContaCorrente cc) {
		cadastrar(cc);
		Double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Valor da Tarifa"));
		cc.tarifa = tarifa;
	}
	
	private void criarConta(ContaPoupanca cp) {
		cadastrar(cp);
	}
	
	private void criarConta(ContaInvestimento ci) {
		cadastrar(ci);
		Double taxaRendimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da Taxa de Rendimento da Conta Investimento"));
		ci.taxaRendimento = taxaRendimento;
		Double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Valor da Tarifa Conta Investimento"));
		ci.tarifa = tarifa;
	}
	
	private void cadastrarTaxaRendimento() {
		Double taxaRendimento = Double.parseDouble(JOptionPane.showInputDialog("Valor da Taxa de Rendimento Conta Poupan�a"));
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
}
