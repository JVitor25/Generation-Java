package lista_Array;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		int i,j,op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n-------------\nRecebendo valores da primeira matriz.");
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com um número: ");
				matriz1[i][j] = leia.nextFloat();
			}
		}
		
		System.out.println("\n-------------\nRecebendo valores da segunda matriz.");
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com um número: ");
				matriz2[i][j] = leia.nextFloat();
			}
		}
		
		do {
			System.out.println("\n=====\nEscolha uma das opções: ");
			System.out.println("(1) - Somar as duas matrizes.");
			System.out.println("(2) - subtrair a primeira matriz da segunda.");
			System.out.println("(3) - adicionar uma constante as duas matrizes.");
			System.out.println("(4) - imprimir as matrizes.");
			System.out.println("\n(0) - Encerrar o programa.");
			op = leia.nextInt();
					
			if(op==1) {
				float[][] matriz3 = new float[2][2];
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j]+matriz2[i][j];
					}
				}
				System.out.println("\nResultado da soma: ");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print(matriz3[i][j]+" ");
					}
					System.out.println();
				}
				
			}
			
			if(op==2) {
				float[][] matriz3 = new float[2][2];
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
					}
				}
				System.out.println("\nResultado da subtração: ");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print(matriz3[i][j]+" ");
					}
					System.out.println();
				}
				
			}
			
			if(op==3) {
				int constante;
				System.out.println("Insira o valor da constante: ");
				constante = leia.nextInt();
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz1[i][j]+=constante;
					}
				}
				
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz2[i][j]+=constante;
					}
				}
			}
			
			if(op==4) {
				System.out.println("Primeira matriz:");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print(matriz1[i][j]+" ");
					}
					System.out.println();
				}
				
				System.out.println("\nSegunda matriz:");
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.print(matriz2[i][j]+" ");
					}
					System.out.println();
				}
			}
				
			
		}while(op!=0);
			 
		System.out.println("Encerrado.");
	}

}
