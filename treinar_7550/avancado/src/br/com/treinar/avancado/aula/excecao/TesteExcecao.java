package br.com.treinar.avancado.aula.excecao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.treinar.avancado.Pessoa;

public class TesteExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		testeFinally();
		try {
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.println(nome);
			excecaoLeitor();			
			excecaoIndiceArray();
			excecaoChecada();
			//ideal para ser executado no finally
			//sc.close();
		} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("deu erro de conversao");
			//sc.close();
		} catch (ParseException e) {
			System.out.println("erro de data");
		} catch (Exception e) {
			System.out.println("erro nao esperado");
		} finally {
			sc.close();
		}

		
		try {
			System.out.println("executando o metodo");
			excecaoLeitor();			
			System.out.println("concluindo o metodo");
		} catch (InputMismatchException e) {
			System.out.println("deu erro");
		}
		try {
			System.out.println("Executando o metodo");
			excecaoIndiceArray();
			System.out.println("Concluindo o metodo");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Deu erro");
		}
		excecaoNulo();
		try {
			excecaoChecada();
		} catch (Exception e) {
			System.out.println("deu um ParseException ");
		}
	}

	private static void excecaoNulo() {
		Pessoa p = null;
		p.setNome("Laila");
	}

	private static void excecaoIndiceArray() {
		Integer[] numeros = {10, 20};
		System.out.println(numeros[2]);
	}

	private static void excecaoLeitor() {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um numero inteiro: ");
		leitor.nextInt();
	}
	
	private static void excecaoChecada() throws ParseException {
		Date d = new Date();
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(d));
		
		String dataNiver = "03/12/OITENTA";
		
		Date dataNiverDate = null;
		dataNiverDate = formatador.parse(dataNiver);

		System.out.println(dataNiverDate);
		
	}
	
	private static String testeFinally() {
		Scanner sc = new Scanner(System.in);
		try {
			String nome = sc.nextLine();
			return nome;
		} finally {
			sc.close();
		}
	}
	
}
