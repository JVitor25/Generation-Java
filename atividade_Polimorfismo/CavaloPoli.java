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
		return "corre muito r�pido";
	}
	
	public String getNome() {
		return "Animal: Cavalo.\nNome: "+super.getNome()+
				"\tIdade: "+super.getIdade()+" anos\nA��o: "+this.acao()+
				"\tSom: "+this.getSom()+"\n";
	}
}
