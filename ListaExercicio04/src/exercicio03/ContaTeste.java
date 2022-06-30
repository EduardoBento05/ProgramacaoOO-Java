package exercicio03;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("121",469962398,43305318,"Eduardo de Almeida Bento Dias","29/04/1995","Masculino",
				2500.00,5000.00,"Rua Senador Pinheiro Machado",424,"Centro","Ponta Grossa","Paraná");
		
		conta1.emitirRelatorio();
		conta1.sacar(234);
		conta1.emitirSaldo();
		conta1.sacar(4800);
		conta1.depositar(-1);
		conta1.depositar(2300);
		conta1.emitirSaldo();
		
	}

}
