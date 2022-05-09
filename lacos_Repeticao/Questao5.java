package lacos_Repeticao;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("Insira um número: ");
			num = leia.nextInt();
			soma+=num;
		}while(num!=0);
		System.out.println("Soma dos número digitados: "+ soma);
	}

}
