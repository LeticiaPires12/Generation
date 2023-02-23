package exercicio_02;



public class Gerente extends Funcionario{
	
	private int numSubordinados;

	public Gerente(String nome, String cpf, String setor, int idade, float salario, int cargo, int numSubordinados) {
		super(nome, cpf, setor, idade, salario, cargo);
		this.numSubordinados = numSubordinados;
		
	}

	public int getNumSubordinados() {
		return numSubordinados;
	}

	public void setNumSubordinados(int numSubordinados) {
		this.numSubordinados = numSubordinados;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Numero de Subordinados: " + this.numSubordinados);

	}

}
