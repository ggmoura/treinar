package br.com.treinarminas.treinar.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCurso {

	public static void main(String[] args) {
		
		DateFormat formatador = new SimpleDateFormat("EE dd MMMM yyyy");
		
		Calendar inicio = Calendar.getInstance();
		
		System.out.println(inicio.get(Calendar.DAY_OF_WEEK));
		
		
		inicio.set(Calendar.DAY_OF_MONTH, 4);
		inicio.set(Calendar.MONTH, 0);
		inicio.set(Calendar.YEAR, 2016);
		inicio.set(Calendar.HOUR_OF_DAY, 18);
		inicio.set(Calendar.MINUTE, 45);
		inicio.set(Calendar.SECOND, 00);
		
		System.out.println("Inicio: " + formatador.format(inicio.getTime()));
		
		inicio.add(Calendar.DAY_OF_MONTH, 9);
		
		System.out.println("Término: " + formatador.format(inicio.getTime()));
		
		
		Calendar diaPrimeiro = Calendar.getInstance();
		diaPrimeiro.set(Calendar.DAY_OF_MONTH, 1);
		diaPrimeiro.set(Calendar.MONTH, 0);
		diaPrimeiro.set(Calendar.YEAR, 2016);
		diaPrimeiro.set(Calendar.HOUR_OF_DAY, 00);
		diaPrimeiro.set(Calendar.MINUTE, 00);
		diaPrimeiro.set(Calendar.SECOND, 00);
		
		Integer qtdDiasNaoUteis = 0;
		
		for (; diaPrimeiro.get(Calendar.DAY_OF_MONTH) < 31; diaPrimeiro.add(Calendar.DAY_OF_MONTH, 1)) {
			System.out.print(diaPrimeiro.get(Calendar.DAY_OF_MONTH) + " ");
			if (diaPrimeiro.get(Calendar.DAY_OF_WEEK) == 1 || diaPrimeiro.get(Calendar.DAY_OF_WEEK) == 7 ) {
				qtdDiasNaoUteis++;
			}
		}
		
		System.out.println(qtdDiasNaoUteis);
		
		
	}
	
}
