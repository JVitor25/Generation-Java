package lista_Array;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int[] array = new int[6];
		int i,somaPar=0,somaImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<6;i++) {
			System.out.println("Insira o primeiro valor: ");
			array[i] = leia.nextInt();
		}
		
		System.out.print("=====================\nNúmeros pares digitados:");
		for(i=0;i<6;i++) {
			if(array[i]%2==0) {
				System.out.print(" "+array[i]);
				somaPar+=array[i];
			}
		}
		System.out.println("\nSoma dos pares digitados: "+somaPar);
		
		System.out.print("----------------------\nNúmeros Impares digitados:");
		for(i=0;i<6;i++) {
			if(array[i]%2!=0) {
				System.out.print(" "+array[i]);
				somaImpar+=array[i];
			}
		}
		System.out.println("\nSoma dos imppares digitados: "+somaImpar);
		
	}

}
