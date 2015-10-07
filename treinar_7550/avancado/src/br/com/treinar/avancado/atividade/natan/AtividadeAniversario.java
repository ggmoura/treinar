package br.com.treinar.avancado.atividade.natan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AtividadeAniversario {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.YEAR, 1992);
		cal.set(Calendar.MONTH, 0);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(df.format(cal.getTime()));
	}
}