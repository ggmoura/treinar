package br.com.treinar.agenda.test;

public class PoolLong {

	
	public static void main(String[] args) {
		Long a = 10l;
		Long b = 10l;
		
		Long c = 1000l;
		Long d = 1000l;
		
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
	
}
