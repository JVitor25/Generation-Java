package introdução_ao_JAVA;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		float a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o coeficiente a: ");
		a = leia.nextFloat();
		System.out.println("Insira o coeficiente b: ");
		b = leia.nextFloat();
		System.out.println("Insira o coeficiente c: ");
		c = leia.nextFloat();
		System.out.println("Insira o coeficiente d: ");
		d = leia.nextFloat();
		System.out.println("Insira o coeficiente e: ");
		e = leia.nextFloat();
		System.out.println("Insira o coeficiente f: ");
		f = leia.nextFloat();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("Valor de x: "+x);
		System.out.println("Valor de y: "+y);

	}

}
