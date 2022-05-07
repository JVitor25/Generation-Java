package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int totalDias, anos, meses, dias;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira sua idade em dias (total de dias): ");
		totalDias = leia.nextInt();
		
		anos = totalDias /365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.println("Sua idade em anos: "+ anos);
		System.out.println("Sua idade em meses: "+ meses);
		System.out.println("Sua idade em dias: "+ dias);

	}

}
