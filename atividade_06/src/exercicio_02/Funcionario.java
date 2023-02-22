package exercicio_02;

public class Funcionario {

	
	private String nome;
	private String cpf;
	private String setor;
	private int idade;
	private float salario;
	
	
	
	
	public Funcionario(String nome, String cpf, String setor, int idade, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.idade = idade;
		this.salario = salario;
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
	

	public void visualizar() {
		System.out.println("Funcionario [nome=" + this.nome + ", cpf=" + this.cpf + ", setor=" + this.setor + ", idade="
				+ this.idade + ", salario= R$ " + this.salario+ "]");
		
	}
}
