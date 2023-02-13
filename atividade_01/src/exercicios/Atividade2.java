package exercicios;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.print("Digite nota 1: ");
		n1 = ler.nextFloat();
		System.out.print("Digite nota 2: ");
		n2 = ler.nextFloat();
		System.out.print("Digite nota 3: ");
		n3 = ler.nextFloat();
		System.out.print("Digite nota 4: ");
		n4 = ler.nextFloat();
		System.out.printf("Media final: %.1f", (n1 + n2 + n3 + n4)/4 );
		ler.close();
		
		

	}
}

