package lacosDecisao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		int maior,n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextInt();
		maior = n1;
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextInt();
		if(n2>maior) {
			maior = n2;
		}
		
		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextInt();
		if(n3>maior) {
			maior = n3;
		}
		
		System.out.println("\nMaior número inserido: "+maior);
		
	}

}
