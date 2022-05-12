package atividade_ClasseObjeto;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double teste;
		
		Cliente pessoa1 = new Cliente("João Vitor Lima",70225,175.55);
		//Mostrando o panorama inicial.
		pessoa1.imprimirDados(); 
		
		//aumentar a dívida.
		System.out.println("\nNova dívida passou a ser de :"+pessoa1.novaDivida(20.0)+"\n");
		pessoa1.imprimirDados();
		System.out.println("----------------");
		
		//Mostrandoa após quitar a dívida.
		pessoa1.quitaDivida();
		pessoa1.imprimirDados();
		
		
	}
}
