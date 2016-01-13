package br.com.treinarminas.treinar.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ImpressaoData {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();

		c.set(Calendar.DAY_OF_MONTH, 15);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.HOUR_OF_DAY, 13);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 59);
		
		System.out.println(c.getTime());
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(df.format(c.getTime()));
		
		
		String dataNascimento = "25/12/2015";
		
		Date mariaCecilia = df.parse(dataNascimento);
		
		System.out.println(mariaCecilia.getTime());
		
	}

}
