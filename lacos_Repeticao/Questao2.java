package lacos_Repeticao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, num, quantPar=0, quantImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0 ; i<10 ; i++) {
			System.out.printf("\nInsira o %d� numero: ", i+1);
			num = leia.nextInt();
			
			if(num%2==0) {
				quantPar++;
			}else {
				quantImpar++;
			}
		}
		
		System.out.println("Quantidade de n�mero Pares: "+ quantPar);
		System.out.println("Quantidade de n�mero Impares: "+ quantImpar);
		
	}
}