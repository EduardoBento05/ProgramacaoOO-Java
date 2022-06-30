package exercicio02;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente("Roberto", 132456, conta1);

		conta1.pedirEntrada();
		conta1.pedirEntrada();
		conta1.pedirPrincipal();
		conta1.pedirSobremesa();
		cliente1.fecharConta();
	}

}
