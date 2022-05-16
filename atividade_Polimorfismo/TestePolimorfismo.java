package atividade_Polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		CachorroPoli cachorro = new CachorroPoli();
		cachorro.setNome("Bidu");
		cachorro.setIdade(7);
		cachorro.setSom("AuAu");
		
		CavaloPoli cavalo = new CavaloPoli();
		cavalo.setNome("Spirit");
		cavalo.setIdade(17);
		cavalo.setSom("Hihihihihi");
		
		PreguicaPoli preguica = new PreguicaPoli();
		preguica.setNome("Hoffman"); 
		preguica.setIdade(12);
		preguica.setSom("Ahhhhhnnn");
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[2]=preguica;
		
		for(Animal animal:animais) {
			System.out.println(animal.getNome());
			System.out.println("");
		}
		
	}

}
