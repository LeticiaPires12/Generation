package beecrowd;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int ddd;
		
		ddd = leia.nextInt();

		
		switch (ddd) {
		
		case 61 -> System.out.println("Brasilia");
		case 71 -> System.out.println("Salvador");
		case 11 -> System.out.println("Sao Paulo");
		case 21 -> System.out.println("Rio de Janeiro");
		case 32 -> System.out.println("Juiz de Fora");
		case 19 -> System.out.println("Campinas");
		case 27 -> System.out.println("Vitoria");
		case 31 -> System.out.println("Belo Horizonte");
		default -> System.out.println("DDD nao cadastrado");
		}
		
		
		
		leia.close();
		
	}

}
