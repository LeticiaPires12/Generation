package exercicios;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite o primeiro número do intervalo:  ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o ultimo número do intervalo:  ");
		n2 = leia.nextInt();
		
		if (n1 < n2) {
			System.out.println("No Intervalo entre " + n1 + " e " + n2 + ":");
			for (int c = n1; c <= n2; c++) {
				
				if (c % 3 == 0 && c % 5 == 0) {
					
					System.out.println(c + " é múltiplo de 3 e 5");
				}
				
			}
		} else 
			System.out.println("Intervalo inválido! ");
		
		
		
		
		
		leia.close();

	}

}
