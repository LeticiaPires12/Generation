package aula02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		double n1, n2;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();
		
		
		
		System.out.println("O número " + n1 + " subtraido ao número " + n2 + " é igual a " + (n1 - n2));
		
		System.out.println("O número " + n1 + " multiplicado ao número " + n2 + " é igual a " + (n1 * n2));
		
		if (n2 != 0)
		System.out.println("O número " + n1 + " dividido ao número " + n2 + " é igual a " + (n1 /n2));
		
		else
			System.out.println("Não é possível dividir um número por 0!");
		
		System.out.println("A raiz quadrada do número " + n1 +  " é igual a " + Math.sqrt(n1));
		
		/*System.out.println("Pré Incremento");
		System.out.println(n1);
	    System.out.println(++ n1);
		
		System.out.println("Pós Incremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);
		
		System.out.println(n1 = n1 + n2);
		System.out.println(n1 += n2);*/
		
		
		leia.close();

	}

}
