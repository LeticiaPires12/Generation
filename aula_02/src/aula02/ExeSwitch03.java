package aula02;

import java.util.Scanner;

public class ExeSwitch03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
double n1, n2, n3;
int operacao;
System.out.println("Digite o 1º número: ");
n1 = leia.nextDouble();

System.out.println("Digite o 2º número: ");
n2 = leia.nextDouble();

		
System.out.println("# ## ### #### #########   Operação   ########## #### ### ## #");
System.out.println("\n--Digite 1 para Soma--");
System.out.println("\n--Digite 2 para Subtração--");
System.out.println("\n--Digite 3 para Multiplicação--");
System.out.println("\n--Digite 4 para Divisão--");

	

System.out.println("Digite o número da operação desejada: ");

operacao = leia.nextInt();

switch (operacao) {
case 1: 
	n3 = n1 + n2;
	System.out.println(n1  + " + " + n2 + " = " + n3 );
	break;
	
case 2:
	n3 = n1 - n2;
	System.out.println(n1 + " - " + n2 + " = " + n3);
	break;
	
case 3:
	n3 = n1 * n2;
	System.out.println(n1 + " * " + n2 + " = " + n3);
	break;
	
case 4:
	n3 = n1 / n2;
	System.out.println(n1 + " / " + n2 + " = " + n3);
	break;
	
	default:
		System.out.println("Operação Inválida");
	
}

	

		
		leia.close();
	}

}
