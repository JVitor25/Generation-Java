package lacosDecisao;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a idade da pessoa: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Classifica��o: infantil.");
		}else if(idade>=15 && idade<=17) {
			System.out.println("Classifica��o: juvenil.");
		}else if(idade>=18 && idade<=25) {
			System.out.println("Classifica��o: adulto.");
		}else {
			System.out.println("A idade inserida n�o ");
		}
			
		
		
	}

}
