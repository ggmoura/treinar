package br.com.treinarminas.treinar.objeto;

public class Aluno {

	//construtor padrao
	public Aluno() {
		System.out.println("CRIOU UM ALUNO!");
	}
	
	//qdo crio um construtor diferente do defout (padrao) este deverah ser informado
	//explicitamente, caso contrario nao podera ser utilizado
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(Integer idade) {
		this.idade = idade;
	}
	
	public Aluno(String nome, Integer idade) {
		this(nome);
		this.idade = idade;
	}
	
	public String nome;
	
	public Integer idade;
	
	public String comoTexto() {
		return "Nome: " + nome + " Idade: " + idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		//Instancia do objeto (endereco de memoria)
		if (this == obj) {
			return true;			
		}
		
		
		if (obj == null) {
			return false;	
		}
		
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Aluno other = (Aluno) obj;
		
		if (idade == null) {
			if (other.idade != null) {
				return false;				
			}
		} else if (!idade.equals(other.idade)) {
			return false;			
		}
		
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		return idade.equals(((Aluno)obj).idade);
	}*/
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("deletado");
	}
	
	
}
