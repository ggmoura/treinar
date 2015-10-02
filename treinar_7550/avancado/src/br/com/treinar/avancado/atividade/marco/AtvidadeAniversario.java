package br.com.treinar.avancado.atividade.marco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AtvidadeAniversario {

	public static void main(String[] args) {
		Calendar aniversario = Calendar.getInstance();
		aniversario.set(Calendar.DAY_OF_MONTH,9);
		aniversario.set(Calendar.MONTH,11);
		aniversario.set(Calendar.YEAR,1986);
		
		DateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		String format = formatador.format(aniversario.getTime());
		System.out.println(format);
		
		

	}

}
