package br.com.treinar.avancado.aula.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AulaData {

	public static void main(String[] args) {
		Date d = new Date(1443655731173l);
		System.out.println(d.getTime());
		
		System.out.println(d);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(d));
		
		String dataNiver = "03/12/1980";
		//System.out.println(formatador.parse(dataNiver));
		
		
	}

}
