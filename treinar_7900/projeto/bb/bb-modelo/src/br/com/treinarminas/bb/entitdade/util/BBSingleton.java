package br.com.treinarminas.bb.entitdade.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.treinarminas.bb.entitdade.Cliente;
import br.com.treinarminas.bb.entitdade.ContaCorrente;
import br.com.treinarminas.bb.entitdade.ContaInvestimento;
import br.com.treinarminas.bb.entitdade.ContaPoupanca;
import br.com.treinarminas.bb.entitdade.ContaSalario;
import br.com.treinarminas.bb.entitdade.core.Conta;

public class BBSingleton {

	
	private static BBSingleton instance;
	//private Conta[] contas;
	private List<Conta> contas;

	static {
		instance = new BBSingleton();
	}
	
	private BBSingleton() {
		super();
		contas = new ArrayList<>();
		try {
			carregarContas();
		} catch (Exception e) {
			System.out.println(Constante.MENSAGEM_ERRO_CARREGAR_CONTAS);
		}
	}
	
	public static BBSingleton getInstance() {
		return instance;
	}
	public void gravarConta(Conta c) {
		c.setNumeroConta(contas.size());
		contas.add(c);
	}
	
	public Conta recuperarConta(Integer numeroConta) {
		return contas.get(numeroConta);
	}

	public List<Conta> recuperarContas() {
		return contas;
	}
	
	public void excluirConta(Integer numeroConta) {
		contas.remove(numeroConta);
	}
	
	public void carregarContas() throws Exception {
		
		File f = new File("contas.txt");
		Conta c = null;
		
		if (!f.exists()) {
			f.createNewFile();
		} else {
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String conta = br.readLine(); // primeira linha
			String[] camposConta = conta.split(";");
			ContaPoupanca.setTaxaRendimento(Double.parseDouble(camposConta[0]));
			String clazz = null;
			conta = br.readLine(); // primeira linha
			while (conta != null) {
				camposConta = conta.split(";");
				clazz = camposConta[camposConta.length - 1];
				c = (Conta) Class.forName(clazz).newInstance();
				if (c instanceof ContaCorrente) {
					preencherDadosConta((ContaCorrente)c, camposConta);
				} else if (c instanceof ContaPoupanca) {
					preencherDadosConta((ContaPoupanca)c, camposConta);
				} else if (c instanceof ContaSalario) {
					preencherDadosConta((ContaSalario)c, camposConta);					
				} else if (c instanceof ContaInvestimento) {
					preencherDadosConta((ContaInvestimento)c, camposConta);										
				}
				contas.add(c);
				conta = br.readLine();					
			}
			br.close();
		}
		
	}
	
	public void preencherDadosConta(Conta conta, String[] dadosConta) {
		conta.setCliente(new Cliente());
		conta.getCliente().setNome(dadosConta[0]);
		conta.getCliente().setCpf(!dadosConta[1].equals(Constante.STRING_NULL) ? Long.parseLong(dadosConta[1]) : null);
		conta.setNumeroConta(Integer.parseInt(dadosConta[2]));
		conta.setSaldo(Double.parseDouble(dadosConta[3]));
	}
	
	
	public void preencherDadosConta(ContaCorrente conta, String[] dadosConta) {
		preencherDadosConta((Conta)conta, dadosConta);
		conta.setLimiteCreditoDisponivel(Double.parseDouble(dadosConta[4]));
		conta.setLimiteCreditoUtilizado(Double.parseDouble(dadosConta[5]));
		conta.setTaxaManutencao(Double.parseDouble(dadosConta[6]));
	}
	
	public void preencherDadosConta(ContaPoupanca conta, String[] dadosConta) {
		preencherDadosConta((Conta)conta, dadosConta);
	}
	
	public void preencherDadosConta(ContaSalario conta, String[] dadosConta) {
		preencherDadosConta((Conta)conta, dadosConta);
	}
	
	public void preencherDadosConta(ContaInvestimento conta, String[] dadosConta) {
		preencherDadosConta((Conta)conta, dadosConta);
		conta.setTaxaManutencao(Double.parseDouble(dadosConta[4]));
		conta.setTaxaRendimento(Double.parseDouble(dadosConta[5]));
	}
	
	public void gravarContas() throws IOException {
		OutputStream os = new FileOutputStream("contas.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(ContaPoupanca.getTaxaRendimento().toString());
		bw.newLine();
		for (Conta conta : contas) {
			bw.write(conta.csv());
			bw.newLine();
		}
		bw.close();
	}
	
}
