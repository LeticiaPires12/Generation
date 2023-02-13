package exercicios;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
	
		
		System.out.print("Digite Salário Bruto: R$ ");
		salarioBruto = ler.nextFloat();
		System.out.print("Digite Adicional Noturno: R$ ");
		adicionalNoturno = ler.nextFloat();
		System.out.print("Digite Horas Extras: ");
		horasExtras = ler.nextFloat();
		System.out.print("Digite Descontos: ");
		descontos = ler.nextFloat();
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	    System.out.printf("Seu Salário líquido é: R$ %.2f" , salarioLiquido);
	   ler.close();
		
		

	}
}

