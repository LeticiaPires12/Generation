package exercicio_02;


public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", "436.719.691-72", "comercial", 28, 1500.00f, 1);
		funcionario1.visualizar();
		
		Funcionario funcionario2 = new Funcionario("Fabiana", "374.453.276-30", "financeiro", 37, 3000.00f, 1);
		funcionario2.visualizar();
		
		Funcionario gerente1 = new Gerente("João", "436.719.691-72", "comercial", 28, 15000.00f, 1, 15);
		gerente1.visualizar();
		
		Gerente gerente2 = new Gerente("Paula", "425.682.954-73", "financeiro", 35, 9500.00f, 1, 10);
		gerente2.visualizar();

		Funcionario vendedor1 = new Vendedor("João", "436.719.691-72", "comercial", 28, 1500.00f, 2, 50);
		vendedor1.visualizar();
		
		Vendedor vendedor2 = new Vendedor("Paula", "425.682.954-73", "financeiro", 35, 3500.00f, 2, 60);
		vendedor2.visualizar();

	}

}
