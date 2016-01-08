package br.com.treinarminas.treinar;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class TesteIF {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if (a == b) {
			System.out.println(" a == b");
			} else if (a < b ) {
				System.out.println("a < b");
			} else {
				System.out.println(" a > b");
				
			}
		if ( a < b) {
			System.out.println("a < b");
		
		}
	}
	
}
