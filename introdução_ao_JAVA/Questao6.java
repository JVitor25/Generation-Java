package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		float d,x1,x2,y1,y2;
		double resultado,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira as coordenadas do ponto 1.");
		System.err.println("x: ");
		x1 = leia.nextFloat();
		System.err.println("y: ");
		y1 = leia.nextFloat();
		
		
		System.out.println("\nInsira as coordenadas do ponto 2.");
		System.err.println("x: ");
		x2 = leia.nextFloat();
		System.err.println("y: ");
		y2 = leia.nextFloat();
		
		x = Math.pow(x1-x2,2);
		y = Math.pow(y1-y2,2);
		
		resultado = Math.sqrt(x+y);
		
		System.out.println("\nDistância entre os dois pontos: "+resultado);
	}

}
