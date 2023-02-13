package atividadesPraticasAula_01;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		Scanner ler = new Scanner(System.in);
		System.out.println("Salário Bruto: R$");
		salarioBruto = ler.nextFloat();
		System.out.println("Adicional Noturno: R$: ");
		adicionalNoturno = ler.nextFloat();
		System.out.println("Horas Extras: R$: ");
		horasExtras = ler.nextFloat();
		System.out.println("Descontos: R$: ");
		descontos = ler.nextFloat();
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("Salário Líquido: R$ %.2f", salarioLiquido);
		

	}

}
