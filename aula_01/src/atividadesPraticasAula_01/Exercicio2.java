package atividadesPraticasAula_01;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Nota 1: ");
		nota1 = ler.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = ler.nextFloat();
		System.out.println("Nota 3: ");
		nota3 = ler.nextFloat();
		System.out.println("Nota 4: ");
		nota4 = ler.nextFloat();
		media = (nota1+nota2+nota3+nota4)/ 4;
		System.out.printf("Média Final: %.1f", media);

	}

}
