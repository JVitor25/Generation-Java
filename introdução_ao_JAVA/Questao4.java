package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		float A,B,C;
		double R,S,D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor de A: ");
		A = leia.nextInt();
		System.out.println("Insira o valor de B: ");
		B = leia.nextInt();
		System.out.println("Insira o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow(A+B,2);
		S = Math.pow(B+C,2);
		D = (R+S)/2;
		
		System.out.println("Valor de R: "+ R);
		System.out.println("Valor de S: "+ S);
		System.out.println("Valor de D: "+ D);
	}

}
