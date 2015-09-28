package br.com.treinar.avancado.aula;

public class Palavra {

	
	public static void main(String[] args) {
		String g = "Odio";
		//String concat = "";
		//concorrencia
		//StringBuffer sb = new StringBuffer();
		
		StringBuilder concat = new StringBuilder(g);
		
		System.out.println(concat.charAt(0));
		System.out.println(concat.length());
		System.out.println(concat);
		System.out.println(concat.replace(0, 1, "Ó"));
		
		for (int i = 0; i < 10; i++) {
 			concat.append(g);
			System.out.println(concat);
		}
	}
	
}
