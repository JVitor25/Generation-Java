package atividade_Polimorfismo;

public class PreguicaPoli extends Animal{
		
	private String som;
	
	public PreguicaPoli(){
	}
	
	public String getSom() {
		return som;
	}
	
	public void setSom(String som) {
		this.som = som;
	}
	
	public String acao() {
		return "Sobe em árvore";
	}
	

	public String getNome() {
		return "Animal: Preguiça.\nNome: "+super.getNome()+
				"\tIdade: "+super.getIdade()+" anos\nAção: "+this.acao()+
				"\tSom: "+this.getSom()+"\n";
	}
}
