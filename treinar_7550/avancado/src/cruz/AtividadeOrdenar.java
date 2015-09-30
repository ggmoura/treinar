package cruz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.avancado.Banheiro;
import br.com.treinar.avancado.Sexo;

public class AtividadeOrdenar {

	public static void main(String[] args) {
		
		List<Banheiro> b = new ArrayList<>();
		
		Banheiro b1 = new Banheiro();
		b1.setSexo(Sexo.F);
		Banheiro b2 = new Banheiro();
		b2.setSexo(Sexo.M);
		Banheiro b3 = new Banheiro();
		b3.setSexo(Sexo.F);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		
		Collections.sort(b, new Comparator<Banheiro>() {
			@Override
			public int compare(Banheiro o1, Banheiro o2) {
				return Integer.compare(o1.getSexo().ordinal(), o2.getSexo().ordinal());
			}
		});
		
		for (Banheiro banheiro : b) {
			System.out.println(banheiro.getSexo().getDescricao());	
		}
		

	}

}
