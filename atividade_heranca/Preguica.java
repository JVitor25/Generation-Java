package atividade_heranca;

public class Preguica extends Animal{
	private String som;
	private boolean correr;
	
	public Preguica(String nome, int idade) {
		super(nome,idade);
	}
	
	public void imprimirDados() {
		System.out.println("\nNome: "+getNome()+"\tIdade: "+getIdade());
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
}
