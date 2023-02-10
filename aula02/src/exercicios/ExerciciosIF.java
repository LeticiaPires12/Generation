package exercicios;

import java.util.Scanner;

public class ExerciciosIF {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite um numero: ");
		a = leia.nextInt();
		System.out.println("Digite um numero: ");
		b = leia.nextInt();
		System.out.println("Digite um numero: ");
		c = leia.nextInt();
		
		if(a + b > c) {
		System.out.println(a + "+" + b + " = " + (a + b) + " > " + c);
		System.out.println("A soma de A + B é maior que C");
		}
		else if(a + b < c) {
		System.out.println(a + "+" + b + " = " + (a + b) + " < " + c);
		System.out.println("A soma de A + B é menor que C");
		}
		else  {
		System.out.println(a + "+" + b + " = " + (a + b) + " = " + c);
		System.out.println("A soma de A + B é igual a C");
		
		
		
		
		}
		leia.close();
	}

}
