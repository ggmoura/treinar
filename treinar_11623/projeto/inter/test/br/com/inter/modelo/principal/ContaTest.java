package br.com.inter.modelo.principal;

import br.com.inter.modelo.Cliente;

public class ContaTest {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setSaldo(1000.00);
		c.setAgencia(1);
		c.setNumero(10481);
		c.setSenha(123456);
		c.setCliente(new Cliente());
		c.getCliente().setNome("Gleidson");
		c.getCliente().setIdade(38);
		
//		Poderia ter criado o cliente separado e depois atribuido a conta
//		Cliente cli = new Cliente();
//		cli.setNome("Maria Sophia");
//		cli.setIdade(6);
//		
//		c.setCliente(cli);
		
		System.out.println("Saldo :" + c.getSaldo());
		System.out.println("Agencia :" + c.getAgencia());
		System.out.println("Numero Conta :" + c.getNumero());
		System.out.println("Senha :" + c.getSenha());
		System.out.println("Nome Cliente :" + c.getCliente().getNome());
		System.out.println("Idade Cliente :" + c.getCliente().getIdade());
		
	}
	

}
