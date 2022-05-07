package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double custoFabrica, custoConsumidor, imposto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o custo da fábrica: ");
		
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (custoFabrica*1.28)+(custoFabrica*0.45);
		
		System.out.println("Custo do consumidor: "+ custoConsumidor);
	}

}
