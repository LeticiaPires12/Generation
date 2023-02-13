package exercicios;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n = 1, soma_menor = 0, soma_maior = 0;
		
		while(n > 0) {
			System.out.println("Digite uma idade: ");
			n = leia.nextInt();
			
			if(n < 0) {
				System.out.println(">>>> Fim <<<<\n");
				
			}else {
				if(n < 21) {
					soma_menor += 1;
				}else if(n > 50) {
					soma_maior += 1;
				}		
				
			}
		}
		
		System.out.println(" Total de pessoas com menos de 21 anos: " + soma_menor);
		System.out.println(" Total de pessoas com mais de 50 anos: " + soma_maior);

		
		leia.close();
		
	}

}
