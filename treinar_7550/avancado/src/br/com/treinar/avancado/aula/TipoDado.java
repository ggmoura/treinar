package br.com.treinar.avancado.aula;

import br.com.treinar.avancado.Sexo;

public class TipoDado {

	public static void main(String[] args) {
		
		Integer a = 1000;
		Integer b = 1000;
		
		Integer c = 10;
		Integer d = 10;
		Integer e = new Integer(10);
		
		
		System.out.println("a == b: " + (a == b));
		System.out.println(c == d);
		System.out.println(d == e);
		System.out.println(e.equals(e));
		
		//Sexo[] sexos = Sexo.values();
		//System.out.println(sexos[1].getDescricao());
		
		try {
			System.out.println(Sexo.recuperarSexoPorOrdinal(1).getDescricao());
		} catch (IllegalArgumentException e2) {
			
		}
		
		
		
	}
	
	
	
}
