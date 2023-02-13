package exercicios;

import java.util.Scanner;

public class ExercicioSwitch02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int operacao;
		float saldo = 1000.00F;
		float saque;
		float deposito;
		
		System.out.println("# ## ### #### #########   Operação   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Saldo--");
		System.out.println("\n--Digite 2 para Saque--");
		System.out.println("\n--Digite 3 para Depósito--");
		
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println("Operação - Saldo"); 
            System.out.printf("Saldo: R$ %.2f" ,  saldo);
			break;
			
		case 2:
			System.out.println("Valor: R$  ");

			saque = leia.nextFloat();
			if (saque > saldo) {
				System.out.println("Operação - Saque"); 

				System.out.println("Saldo Insuficiente"); 
				
			} else {
				saldo = saldo - saque;
				
				
				System.out.println("Operação - Saque"); 

				System.out.printf("Novo Saldo: R$ %.2f" , saldo);

			}
			break;
			
		case 3:
			System.out.println("Depósito:  ");
			
			deposito = leia.nextFloat();
			if (deposito > 0) {
				System.out.println("Operação - Deposito"); 
				saldo = saldo + deposito;
	            System.out.printf("Novo Saldo: R$ %.2f" ,  saldo);



			} else {
				System.out.println("Operação Inválida");
			}
				
			break;
			
			default:
				System.out.println("Opção Inválida"); 

		}
		
		
		leia.close();
	}

}
