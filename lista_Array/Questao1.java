package lista_Array;

public class Questao1 {

	public static void main(String[] args) {
		int[] A = new int[6];
		//passo a
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		//passo b
		int simples;
		simples = A[0]+A[1]+A[5];
		System.out.println("Valor da soma das posições A[0], A[1] e A[5]: "+simples);
		
		//passo c
		A[4] = 100;
		
		//passo d 
		int i;
		for(i=0;i<6;i++) {
			System.out.printf("\nPosição A[%d]: %d",i,A[i]);
		}
			
	}

}
