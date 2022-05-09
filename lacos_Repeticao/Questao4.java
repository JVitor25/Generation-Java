package lacos_Repeticao;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, idade, sexo, op, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, pessoasNervosas40=0, pessoasCalmas18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(i<=150){
			System.out.printf("\nInsira os dados da %dª pessoa.\nInsira a idade da pessoa: ",i);
			idade = leia.nextInt();
			
			System.out.println("Insira o sexo da pessoa.\n1 - Feminino.\n2 - Masculino.\n3 - Outros.");
			sexo = leia.nextInt();
			
			System.out.println("Marque o perfil dessa pessoa.\n1 - Pessoa Calma.\n2 - Pessoa Nervosa.\n3 - Pessoa Agressiva.");
			op = leia.nextInt();
			
			
			
			if(op==1) {
				pessoasCalmas++;
			}
			if(sexo==1 && op ==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && op ==3) {
				homensAgressivos++;
			}
			if(sexo==3 && op ==1) {
				outrosCalmos++;
			}
			if(idade>40 && op ==2) {
				pessoasNervosas40++;
			}
			if(idade<18 && op ==1) {
				pessoasCalmas18++;
			}
			i++;
		}
		
		System.out.println("O numero de pessoas calmas é: "+pessoasCalmas);
		System.out.println("O numero de mulheres nervosas é: "+mulheresNervosas);
		System.out.println("O numero de homens agressivos é: "+homensAgressivos);
		System.out.println("O numero de outros calmos é: "+outrosCalmos);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos é: "+pessoasNervosas40);
		System.out.println("O numero de pessoas calmas com menos de 18 anos é: "+pessoasCalmas18);
		
	}

}
