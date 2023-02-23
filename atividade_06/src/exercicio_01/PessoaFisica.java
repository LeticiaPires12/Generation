package exercicio_01;

public class PessoaFisica extends Cliente{

	private String cpf;
	
	public PessoaFisica(String nome, String endereco, String tipo, String telefone, String nacionalidade, String cpf) {
		super(nome, endereco, tipo, telefone, nacionalidade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}


	
	
		
		
	
	
	

}
