package br.com.treinarminas.hudson.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DatasCurso {
		
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
		String dataInicio = "04/Janeiro/2016 18:45:00";
		Date inicioCurso = df.parse(dataInicio);
		Calendar c = Calendar.getInstance();
		
		System.out.println("A data de início do curso foi em : " + df.format(inicioCurso));
		c.set(Calendar.DAY_OF_MONTH, 4);
		c.set(Calendar.MARCH, 1);
		c.set(Calendar.YEAR, 2016);
		
		c.add(Calendar.DAY_OF_MONTH, 8);
		
		System.out.println("A data de fim do curso é em: " + df.format( c.getTime() ) );
		
	}

}
