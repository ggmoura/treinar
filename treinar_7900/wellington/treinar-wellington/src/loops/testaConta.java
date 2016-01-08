package loops;

public class testaConta {

	public static void main(String[] args) {
		
		Apartamento a = new Apartamento();
		
		
		
		a.setEndereco("Rua de teste");
		a.setNumeroAp(201);
		a.setBloco(10);
		a.setEstado("Minas Gerais");
		a.setPais("Brasil");
		a.setCidade("Belo Horizonte");
		
		
		
		System.out.println(a.getEndereco() +  a.getNumeroAp()
		+ a.getBloco()
		+ a.getEstado()
		+ a.getCidade()
		+ a.getPais()
		);
	}

}
