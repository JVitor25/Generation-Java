package atividade_ClasseObjeto;

public class Cliente {
	//atributos
	private String nome;
	private int numeroIdentificacao;
	private double debitos;
	
	//construtor
	public Cliente (String nome, int numueroIdentificacao, double debitos){
		this.nome = nome;
		this.numeroIdentificacao = numueroIdentificacao;
		this.debitos = debitos; 
	}
	//métodos
	//atualizar o valor da divida.
	public double novaDivida(double divida){
		double dividaTotal = debitos + divida;
		debitos = dividaTotal;
		return dividaTotal;
	}
	//quita a divida.
	public void quitaDivida(){
		debitos = 0;
		System.out.println("Dívida quitada.");
	}
	//Imprimir dados
	public void imprimirDados(){
		System.out.println("Nome: "+nome+".\tIdentificação: "
	+numeroIdentificacao+"\nDívida: "+debitos);
	}
	
	//get & set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public double getDebitos() {
		return debitos;
	}

	public void setDebitos(double debitos) {
		this.debitos = debitos;
	}
	
	
}
