package exercicio_01;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Letícia", "834.173.646-20", 23, "feminino", "27.578.148-3");
		cliente1.visualizar();

		Cliente cliente2 = new Cliente("Paulo", "383.626.455-20", 49, "masculino", "38.471.470-5");
		cliente2.visualizar();
	}
}
