package cruz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.treinar.avancado.Pessoa;
import br.com.treinar.avancado.Sexo;

public class AtividadeAniversario {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("cruz" ,Sexo.M); 
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.DAY_OF_MONTH, 20);
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.YEAR, 1989);
		
		p.setDataNascimento(c.getTime());
		DateFormat n = new SimpleDateFormat("dd - MM - yyyy");
		System.out.println(n.format(p.getDataNascimento()));

	}

}
