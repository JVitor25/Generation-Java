package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int totalDias, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a sua idade.");
		System.out.println("Em anos: ");
		anos = leia.nextInt();

		System.out.println("Em meses: ");
		meses = leia.nextInt();
		
		System.out.println("Em dias: ");
		dias = leia.nextInt();
		
		
		totalDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias: "+totalDias);
	}

}

