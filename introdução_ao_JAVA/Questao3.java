package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int horas, minutos, segundos, totalSegundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a duração total do evento em Segundos: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos /3600;
		minutos = (totalSegundos %3600) / 60;
		segundos = (totalSegundos %60) % 60;
		
		System.out.println("\n\tDuração do evento.");
		System.out.println("Horas: "+horas);
		System.out.println("Minutos: "+minutos);
		System.out.println("Segundos: "+ segundos);

	}

}
