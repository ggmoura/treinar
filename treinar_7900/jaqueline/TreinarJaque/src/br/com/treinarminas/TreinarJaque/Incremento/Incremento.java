package br.com.treinarminas.TreinarJaque.Incremento;

public class Incremento {
	
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		System.out.println("Valor de i = " + i);
		i++;
		System.out.println("Valor de i++ = " + i);
		System.out.println("Valor de i++ = " + i++); //ir� imprimir 1 para guardar o valor 
		System.out.println("Valor de i = " + i); //p�s incremento
		
		j = ++i;
				
		System.out.println("Valor de j = " + j); //ir� utilizar pegar o valor do pre incremento mas o valor do pos incremento, para diminuir o incremento a ideia � a mesma
				
		
	}

}
