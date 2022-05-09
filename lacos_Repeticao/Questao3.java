package lacos_Repeticao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, idade,quant21=0, quant50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Insira a idade da %d pessoa: ",i);
		idade = leia.nextInt();
		i++;
		while (idade != -99) {
			if(idade>50) {
				quant50++;
			}
			if(idade<21) {
				quant21++;
			}
			System.out.printf("Insira a idade da %d pessoa: ",i);
			idade = leia.nextInt();
			i++;
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+quant21);
		System.out.println("Total de pessoas com mais de 50 anos: "+quant50);
	}

}
