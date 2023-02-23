package exercicio_01;

class Cliente {

	private String nome;
	private String endereco;
	private String tipo;
	private String telefone;
	private String nacionalidade;
	

	public Cliente(String nome, String endereco, String tipo, String telefone, String nacionalidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
		this.telefone = telefone;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case "PF" -> tipo = "Pessoa Fisica";
		case "PJ" -> tipo = "Pessoa Juridica";

		}
		System.out.println("*******************************");
		System.out.println("          DADOS DO CLIENTE     ");
		System.out.println("*******************************");
		System.out.println("NOME DO CLIENTE: " + this.nome);
		System.out.println("ENDEREÇO: " + this.endereco);
		System.out.println("TIPO DO CLIENTE: " + tipo);
		System.out.println("TELEFONE: " + this.telefone);
		System.out.println("NACIONALIDADE: " + this.nacionalidade);

	}

}
