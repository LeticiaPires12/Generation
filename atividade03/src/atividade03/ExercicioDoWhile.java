package atividade03;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
 
		Scanner leia = new Scanner(System.in);
		
		int numero, quantLidos = 0, soma = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			
		
			if(numero > 0) {
				
			soma += numero;
			
			}
	        	quantLidos++;
	        	
	        
				
				
			}
			while (numero !=0) ;
	
		
			
			if (quantLidos == 0) {
				System.out.println("Você não informou nenhum número.");
				
			} 
			else {
				System.out.println("A soma dos números positivos é: "  + soma);
	
			
				leia.close();
			}
				
		}
		
		
	}


