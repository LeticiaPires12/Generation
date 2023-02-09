package estudos1;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		
	
		
		System.out.print("Digite o número 1 ");
		n1 = ler.nextInt();
		System.out.print("Digite o número 2 ");
		n2 = ler.nextInt();
		System.out.print("Digite o número 3 ");
		n3 = ler.nextInt();
		System.out.print("Digite o número 4 ");
		n4 = ler.nextInt();
		System.out.print("A diferença é: " + ((n1 * n2) - (n3 * n4)));
	   ler.close();
		
		

	}
}

