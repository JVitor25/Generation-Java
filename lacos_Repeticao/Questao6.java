package lacos_Repeticao;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, multi3=0, quant=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			
			if(num!=0) {
				if(num%3==0) {
					multi3+=num;
					quant++;
				}
			}
				
			
		}while(num!=0);
		media = (float)multi3/quant;
		System.out.printf("Média dos número multiplos de 3 é: %.2f",media);
	}

}
