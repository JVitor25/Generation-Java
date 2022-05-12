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
}
