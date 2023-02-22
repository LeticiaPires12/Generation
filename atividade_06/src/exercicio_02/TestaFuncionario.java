package exercicio_02;


public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", "436.719.691-72", "comercial", 28, 1500.00f);
		funcionario1.visualizar();
		
		Funcionario funcionario2 = new Funcionario("Fabiana", "374.453.276-30", "financeiro", 37, 3000.00f);
		funcionario2.visualizar();

		
	}

}
