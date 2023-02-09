package estudos1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.print("Digite o Salário: R$ ");
		salario = ler.nextFloat();
		System.out.print("Digite o abono: R$ ");
		abono = ler.nextFloat();
		novoSalario = salario + abono; 
		System.out.printf("Seu novo salário é: R$ %.2f " , novoSalario);
		ler.close();		
		
		
		
		

	}

}
