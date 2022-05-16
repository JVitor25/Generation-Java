package atividade_Polimorfismo;

public class CavaloPoli extends Animal{
	private String som;
	
	public CavaloPoli(){
	}
	
	public String getSom() {
		return som;
	}
	
	public void setSom(String som) {
		this.som = som;
	}

	public String acao() {
		return "corre muito rápido";
	}
	
	public String getNome() {
		return "Animal: Cavalo.\nNome: "+super.getNome()+
				"\tIdade: "+super.getIdade()+" anos\nAção: "+this.acao()+
				"\tSom: "+this.getSom()+"\n";
	}
}
