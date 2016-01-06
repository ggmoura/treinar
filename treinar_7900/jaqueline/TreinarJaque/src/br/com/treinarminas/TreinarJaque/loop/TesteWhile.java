package br.com.treinarminas.TreinarJaque.loop;

import java.util.Scanner;

public class TesteWhile {
	
	public static void main(String[] args) {
			
			Scanner leitor = new Scanner (System.in);
			
			String nome = leitor.next();
			
			while (!nome.equals("sair"));{
			System.out.println("O nome " + nome + " possui " + nome.length ()+ " letras");
			}
			leitor.close();
			System.out.println("Fim do programa...");
			
			}
		}
		