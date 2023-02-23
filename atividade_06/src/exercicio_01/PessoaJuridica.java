package exercicio_01;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String tipo, String telefone, String nacionalidade, String cnpj) {
		super(nome, endereco, tipo, telefone, nacionalidade);
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}


	
	
		
		
	
	
	

}
