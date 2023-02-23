package exercicio_02;



public class Vendedor extends Funcionario{
	
	private int quantVendas;

	public Vendedor(String nome, String cpf, String setor, int idade, float salario, int cargo, int quantVendas) {
		super(nome, cpf, setor, idade, salario, cargo);
		this.quantVendas = quantVendas;
		
	}

	public int getQuantVendas() {
		return quantVendas;
	}

	public void setQuantVendas(int quantVendas) {
		this.quantVendas = quantVendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade de Vendas: " + this.quantVendas);

	}

}
