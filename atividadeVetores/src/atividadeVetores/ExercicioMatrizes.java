package atividadeVetores;

import java.util.Scanner;

public class ExercicioMatrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float matriz[][] = new float[10][4];
		float media[] = new float[10];
		float soma = 0.0f;

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.println("Digite a nota: ");
				matriz[linha][coluna] = leia.nextFloat();
			}

		}

		for (int linha = 0; linha < matriz.length; linha++) {

			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				soma += matriz[linha][coluna];

			}

			media[linha] = soma / matriz[linha].length;

			soma = 0.0f;

		}

		for (int indice = 0; indice < media.length; indice++) {
			System.out.printf("%.1f \n", media[indice]);
		}

		leia.close();
	}

}