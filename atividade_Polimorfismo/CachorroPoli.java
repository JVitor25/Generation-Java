package atividade_Polimorfismo;

public class CachorroPoli extends Animal{
	private String som;
	
	public CachorroPoli(){
	}
	
	public String getSom() {
		return som;
	}

	
	public void setSom(String som) {
		this.som = som;
	}
	
	
	public String acao() {
		return "corre";
	}
	
	public String getNome() {
		return "Animal: Cachorro.\nNome: "+super.getNome()+
				"\tIdade: "+super.getIdade()+"anos\nAção: "+this.acao()+
				"\tSom: "+this.getSom()+"\n";
	}
}
