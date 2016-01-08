package treinar_Cristiano;

public class Seminovos {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.marca  = "Fiat";
		v.modelo = "Palio";
		v.km	 =  55000;
		v.ano	 =  "2008";
			
		Carro c = new Carro();
		c.portas = 4;
		c.cavalos = 97;
				
		System.out.println(v.marca + "\n" + v.modelo + "\n" + v.ano + "\n" + v.km + " mil km "+ "\n" + c.portas +" portas " + "\n" + c.cavalos + " cavalos");
	}
}
