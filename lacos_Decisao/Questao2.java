package lacosDecisao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextInt();
		
		System.out.println("Ordem dos números: ");
		if(n1<=n2 && n2<=n3){
			System.out.print(n1+" "+n2+" "+n3);
		}
		
		if(n1<=n3 && n3<=n2){
			System.out.print(n1+" "+n3+" "+n2);
		}
		
		if(n2<=n1 && n1<=n3){
			System.out.print(n2+" "+n1+" "+n3);
		}
		
		if(n2<=n3 && n3<=n1){
			System.out.print(n2+" "+n3+" "+n1);
		}
		
		if(n3<=n1 && n1<=n2){
			System.out.print(n3+" "+n1+" "+n2);
		}
		
		if(n3<=n2 && n2<=n1){
			System.out.print(n3+" "+n2+" "+n1);
		}
		
	}

}
