package beecrowd;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		int soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		soma = num1 + num2;
		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma);
		leia.close();
		
		
	}

}
