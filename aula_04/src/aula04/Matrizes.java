package aula04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
		
		int matrizInteiros [][] = {{10,15,35}, {70,120,140}, {50,100,150}};
	
		float [][] matriz = new float [2][2];
		
		
	
		for (int indiceI = 0;  indiceI < matriz.length; indiceI ++) {
			
			
			for (int indiceJ = 0;  indiceJ < matriz.length; indiceJ ++) {
			
				System.out.println("Digite um vlor real: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();
			}
			
		}
		
		
		for(float[] vetor : matriz) {
			for(var elemento : vetor) {
				System.out.println(elemento);
				
			}
		}
		
		leia.close();
	}

}