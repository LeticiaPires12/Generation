package exercicio_02;

public class Funcionario {

	
	private String nome;
	private String cpf;
	private String setor;
	private int idade;
	private float salario;
	private int cargo;
	
	
	public Funcionario(String nome, String cpf, String setor, int idade, float salario, int cargo) {
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	

	public void visualizar() {
		String cargo = "";

		switch (this.cargo) {
		case 1 -> cargo = "Gerente";
		case 2 -> cargo = "Vendedor";

		}
		System.out.println("*******************************");
		System.out.println("      DADOS DO FUNCIONARIO     ");
		System.out.println("*******************************");
		System.out.println("NOME DO FUNCIONARIO: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("SETOR: " + this.setor);
		System.out.println("IDADE: " + this.idade);
		System.out.println("SALARIO: " + this.salario);
		System.out.println("CARGO: " + cargo);

	}
	
}
