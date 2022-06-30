package exercicio01;

public class BancoTeste {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		banco.adicionarNovaConta(1,5000.00, "João da Silva",111111);
		banco.adicionarNovaConta(2,6000.00, "Maria de Oliveira",2222222);
		banco.adicionarNovaConta(3,3000.00, "Ricardo Carvalho",333333333);
		
		banco.realizarDeposito(5, 500.00); // conta inexistente
		
		banco.realizarDeposito(2, 1000.00);
		banco.realizarDeposito(3, 650.00);
		
		banco.realizarSaque(2, 150.00);
		
		banco.verificarSaldo(1);
		banco.verificarSaldo(2);
		banco.verificarSaldo(3);
	}

}
