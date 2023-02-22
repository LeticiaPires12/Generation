package exercicio_01;

class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private String genero;
	private String rg;

	public Cliente(String nome, String cpf, int idade, String genero, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.genero = genero;
		this.rg = rg;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void visualizar() {
		System.out.println("Cliente [nome=" + this.nome + ", cpf=" + this.cpf + ", idade=" + this.idade + ", genero="
				+ this.genero + ", rg=" + this.rg + "]");
	}
	
}
