package exercicios;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //Permite que o usuario digite e o computador leia o que ele digitou 

		int numero; // variavel numero inteiro sem valor
		int posicaoNumero = 0; // variavel posiça numero inteiro sem valor valor da posicao do numero que o cara digitou
		
		int vetoresInteiros [] = {2,5,1,3,4,9,7,8,10,6}; // variavel vetor inteiro que guarda os valores dentro da chave no vetor
		
		System.out.println("Digite o número que você deseja encontrar: "); // vai aparecer no console do usuario esta mensagem
		numero = leia.nextInt(); // variavel numero passa a receber o valor que for digitado
		
		for (int posicao = 0; posicao < vetoresInteiros.length; posicao = posicao + 1) {
			 // laço repetitivo que iniciou com variavel com valor 0 e uma condiçao de
			 //posiçao menor do que o tamanho do vetor e com acrescimo de +1 na variavel posiçao.
			if (numero == vetoresInteiros[posicao]) {//se o numero digitado for igual ao valor da posição 
				posicaoNumero = posicao;// achei o que queria agora vou ter que guardar o resultado
			}
		}
		
		if (posicaoNumero >= 0) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicaoNumero);
		}else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		
		leia.close();

	}

}
