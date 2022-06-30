package exercicio04;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(2658,884946,2500.2);
		
		conta.imprimirDados();
		conta.verificarSaldo();
		conta.sacar(2600);
		conta.sacar(2400);
		conta.verificarSaldo();
		conta.sacar(200);
		conta.depositar(400);
		conta.depositar(-2300);
		conta.verificarSaldo();
	}

}
