package atividade_heranca;

public class Cavalo extends Animal{
	private String som;
	private boolean correr;
	
	public Cavalo(String nome, int idade, String som) {
		super(nome,idade);
		this.som = som;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	public void imprimirDados() {
		System.out.println("\nNome: "+getNome()+"\tIdade: "+getIdade()+"\nSom: "+this.som);
	}
	
	public void corre() {
		this.correr = true;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
}
