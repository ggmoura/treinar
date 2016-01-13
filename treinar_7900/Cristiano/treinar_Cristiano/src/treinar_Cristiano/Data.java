package treinar_Cristiano;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Data {
	
	public static void main(String[] args) {
		
		Calendar inicio = Calendar.getInstance();
		
		inicio.set(Calendar.DAY_OF_MONTH, 04);
		inicio.set(Calendar.MONTH, 01);
		inicio.set(Calendar.YEAR, 2016);
		inicio.set(Calendar.MINUTE, 45);
		inicio.set(Calendar.SECOND, 00);
				
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Início do Curso: " + df.format(inicio.getTime()));
		
			
		inicio.add(Calendar.DAY_OF_MONTH, 9);
				
		System.out.println("Término do Curso: " + df.format(inicio.getTime()));
		
		
		
	}

}
