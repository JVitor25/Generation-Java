package atividade_ClasseObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double teste;
		
		Cliente pessoa1 = new Cliente("Jo�o Vitor Lima",70225,175.55);
		//Mostrando o panorama inicial.
		pessoa1.imprimirDados(); 
		
		//aumentar a d�vida.
		System.out.println("\nNova d�vida passou a ser de :"+pessoa1.novaDivida(20.0)+"\n");
		pessoa1.imprimirDados();
		System.out.println("----------------");
		
		//Mostrandoa ap�s quitar a d�vida.
		pessoa1.quitaDivida();
		pessoa1.imprimirDados();
		
		
	}
}
