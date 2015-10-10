package br.com.treinar.agenda;

public class PoolInteiro {

	public static void main(String[] args) {
		Integer i = 100;
		Integer j = 100;
		Integer k = 1000; 
		Integer l = 1000;
		Integer m = new Integer(100);
		Integer n = new Integer(100);
		
		
		System.out.println(i == j);
		System.out.println(k == l);
		System.out.println(m == n);
		
		String g = "Gleidson";
		String h = "Gleidson";
		
		String o = new String("Gleidson");
		String p = new String("Gleidson");
		
		System.out.println(g == h);
		System.out.println(o == p);
		System.out.println(o.equals(p));
		
		
		
	}
	
}
