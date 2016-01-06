package br.com.treinarminas.TreinarJaque.Incremento;

public class Incremento {
	
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		System.out.println("Valor de i = " + i);
		i++;
		System.out.println("Valor de i++ = " + i);
		System.out.println("Valor de i++ = " + i++); //irá imprimir 1 para guardar o valor 
		System.out.println("Valor de i = " + i); //pós incremento
		
		j = ++i;
				
		System.out.println("Valor de j = " + j); //irá utilizar pegar o valor do pre incremento mas o valor do pos incremento, para diminuir o incremento a ideia é a mesma
				
		
	}

}
