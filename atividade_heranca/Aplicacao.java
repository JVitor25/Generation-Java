package atividade_heranca;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cavalo cavalo = new Cavalo("Spirit",22,"AuAu-AuAu");
		cavalo.imprimirDados();
		cavalo.getSom();
		cavalo.corre();
		
		Preguica preguica = new Preguica("Bela",22); 
		preguica.imprimirDados();
		
		Cachorro cachorro = new Cachorro("Doguinho",22,"Hihihihihi(som do cavalo kkkk)");
		cachorro.getSom();
		cachorro.imprimirDados();
		cavalo.corre();
		
		
	}

}
