package aula01;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1;
		float n2;
		float n3;
		float n4;
		float diferenca;
		Scanner ler = new Scanner(System.in);
		System.out.println("Número1: ");
		n1 = ler.nextFloat();
		System.out.println("numero2: ");
		n2 = ler.nextFloat();
		System.out.println("numero3: ");
		n3 = ler.nextFloat();
		System.out.println("numero4: ");
		n4 = ler.nextFloat();
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.print("Diferença: " + diferenca);
		
	}

}
