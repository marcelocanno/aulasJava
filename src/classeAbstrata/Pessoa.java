package classeAbstrata;

public abstract class Pessoa {
	
	protected String nome;
	
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}

	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
