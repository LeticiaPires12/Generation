package exercicios;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		int quantidade;
		float produto;
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para pedir um Cachorro Quente--");
		System.out.println("\n--Digite 2 para pedir um X-Salada--");
		System.out.println("\n--Digite 3 para pedir um X-Bacon--");
		System.out.println("\n--Digite 4 para pedir um Bauru--");
		System.out.println("\n--Digite 5 para pedir um Refrigerante--");
		System.out.println("\n--Digite 6 para pedir um Suco de laranja--");
		
		opcao = leia.nextInt();
				
		switch (opcao) {
		case 1: 
			produto = 10.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: cachorro quente");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;
			
		case 2:
			produto = 15.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: X- Salada");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;
			
		case 3:
			produto = 18.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: X - Bacon");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;
			
		case 4:
			produto = 12.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: Bauru");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;
			
		case 5:
			produto = 8.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: Refrigerante");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;
			
		case 6:
			produto = 13.00F;
			System.out.println("quantidade") ;
			quantidade = leia.nextInt();
			System.out.println("Produto: Suco de laranja");
			System.out.printf("valor total: %.2f" , (quantidade * produto));
			break;

			default:
				System.out.println("Opção Inválida"); }
				
			
		
		
		leia.close();

	}

}
