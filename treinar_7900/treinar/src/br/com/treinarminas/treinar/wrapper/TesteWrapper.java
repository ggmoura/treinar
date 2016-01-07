package br.com.treinarminas.treinar.wrapper;

public class TesteWrapper {

	
	public static void main(String[] args) {
		int i = 9;
		Integer iw = 5;
		
		System.out.println(iw.compareTo(i));
		
		Integer a = 1000;
		Integer b = 1000;
		
		int c = 1000;
		int d = 1000;
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(c == d);
		
		
		String s1 = "gleidson";
		String s2 = "gleidson";
		String s3 = new String("gleidson");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}
	
}
