package lacosDecisao;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
	double numero,x;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Insira um número: ");
	numero = leia.nextInt();
	
	if(numero == 0) {
		System.out.println("O numero inserido é neutro.");
	}else if(numero % 2 ==0) {
		System.out.println("O numero inserido é par.");
		x = Math.sqrt(numero);
		System.out.printf("Raiz desse número: %.2f",x);
	}else {
		System.out.println("O numero inserido é impar.");
		x = Math.pow(numero,2);
		System.out.printf("Quadrado desse número: %.2f",x);
	}
	
	
	}

}
