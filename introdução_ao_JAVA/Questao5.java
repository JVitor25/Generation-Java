package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a nota 1: ");
		n1 = leia.nextInt();
		System.out.println("Insira a nota 2: ");
		n2 = leia.nextInt();
		System.out.println("Insira a nota 3: ");
		n3 = leia.nextInt();
		
		media = (n1*2+n2*3+n3*5) / (2+3+5);
			
		System.out.println("Valor da Média Ponderada: "+ media);
	}

}