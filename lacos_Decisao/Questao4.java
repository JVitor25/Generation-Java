package lacosDecisao;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
	double numero,x;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Insira um n�mero: ");
	numero = leia.nextInt();
	
	if(numero == 0) {
		System.out.println("O numero inserido � neutro.");
	}else if(numero % 2 ==0) {
		System.out.println("O numero inserido � par.");
		x = Math.sqrt(numero);
		System.out.printf("Raiz desse n�mero: %.2f",x);
	}else {
		System.out.println("O numero inserido � impar.");
		x = Math.pow(numero,2);
		System.out.printf("Quadrado desse n�mero: %.2f",x);
	}
	
	
	}

}
