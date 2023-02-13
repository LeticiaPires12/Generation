package aula01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double salario;
		double abono;
		double novoSalario;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu salario: R$ ");
		salario = ler.nextDouble();
		System.out.println("Digite seu Abono: R$ ");
		abono = ler.nextDouble();
		novoSalario = salario + abono;
		System.out.printf( "Seu novo salario é de R$ %.2f", novoSalario);

	}

}
