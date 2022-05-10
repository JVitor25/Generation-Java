package lista_Array;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linha=3, coluna=3;
		int[][] numeros = new int[linha][coluna];
		int contMaior10=0, i,j;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("\nEntre com um número: ");
				numeros[i][j] = leia.nextInt();
			}
		}
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(numeros[i][j]>10) {
					contMaior10++;
					System.out.println(numeros[i][j]+" <-- Maior que 10.");
				}
					
			}
			
		}
		System.out.println("\nTemos: "+contMaior10+" números maiores que 10.");

	}

}
