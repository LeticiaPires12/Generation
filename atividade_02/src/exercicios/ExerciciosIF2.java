package exercicios;

import java.util.Scanner;

public class ExerciciosIF2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println(" O número " + num + " é par e positivo");
		}
		if(num % 2 == 0 && num < 0) {
			System.out.println(" O número " + num + " é par e negativo");

		}
		if(num % 2 != 0 && num > 0) {
		System.out.println(" O número " + num + " é ímpar e positivo");
		}
		
		if(num % 2 != 0 && num < 0) {
			System.out.println(" O número " + num + " é ímpar e negativo");
		}
		leia.close();
	}

}
