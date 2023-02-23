package exercicio_01;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João", "Rua Teste", "PF", "11-99999-9999", "Brasileiro");
		cliente1.visualizar();

		Cliente cliente2 = new Cliente("Lais", "Rua Teste2", "PF", "11-99999-8888", "Brasileira");
		cliente2.visualizar();
		
		PessoaFisica pessoaFisica1 = new PessoaFisica("João", "Rua Teste", "PF", "11-99999-9999", "Brasileiro", "491.664.356-92");
		pessoaFisica1.visualizar();
		
		Cliente pessoaFisica2 = new PessoaFisica("Lais", "Rua Teste2", "PF", "11-99999-8888", "Brasileira", "156.217.782-60");
		pessoaFisica2.visualizar();
		
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Bem Casados ltda", "Rua Teste2", "PJ", "11-99999-8888", "Brasileira", "53.810.433/0001-79");
		pessoaJuridica1.visualizar();
		
		Cliente pessoaJuridica2 = new PessoaJuridica("Roupas Testes", "Rua Teste2", "PJ", "11-99999-8888", "Brasileira", "60.420.293/0001-98");
		pessoaJuridica2.visualizar();
	}
}
