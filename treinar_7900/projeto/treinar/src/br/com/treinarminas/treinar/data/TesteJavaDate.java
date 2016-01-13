package br.com.treinarminas.treinar.data;

import java.util.Calendar;
import java.util.Date;

public class TesteJavaDate {

	public static void main(String[] args) {
		System.out.println(new Date());
		
		Date futuroOuPassado = new Date(1565465486545L);
		System.out.println(futuroOuPassado);
		
		Long inicio = new Date().getTime();
		
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println("a");
//		}
		
		Long termino = new Date().getTime();
		
		System.out.println((termino - inicio) / 1000);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		
		
		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.HOUR_OF_DAY, 13);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 59);
		
		c.add(Calendar.MONTH, -9);
		
		System.out.println(c.getTime());
		
		c.add(Calendar.YEAR, 18);
		
		System.out.println(c.getTime());
		
		System.out.println(c.before(futuroOuPassado));
		
		
	}
	
}
