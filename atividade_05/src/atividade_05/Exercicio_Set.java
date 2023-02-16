package atividade_05;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio_Set {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero = 0;
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			numeros.add(numero);
			
		}
			
		System.out.println("Sem Iterator");
		for(var num : numeros)
			System.out.println(num);
		
		System.out.println("Com Iterator");
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext());

		
		
		leia.close();
		
	}

}
