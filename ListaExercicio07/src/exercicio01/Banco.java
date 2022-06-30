package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List <Conta> conta;

	public Banco() {
		this.conta = new ArrayList<Conta>();
	}
	
	
	public void adicionarNovaConta(long numeroConta,Double saldo,String nome,long cpf) {
		
		Conta conta1 = new Conta(numeroConta,saldo,nome,cpf);
		this.conta.add(conta1);
		System.out.println("Conta " + numeroConta + " Criada com Sucesso");
	}
	
	
	public void realizarSaque(long numeroConta,Double valor) {
		
		boolean verificacao = false;
		
		for (Conta conta2 : conta) {
			
				if(conta2.getNumeroConta() == numeroConta) {
					
					conta2.realizarSaque(valor);
					verificacao = true;
				}
		}
		
		if(verificacao == false) {
			System.out.println("Conta Inexistente");
		}
		
	}
	
	public void realizarDeposito(long numeroConta,Double valor) {
		
		boolean verificacao = false;
		
		for (Conta conta2 : conta) {
			
				if(conta2.getNumeroConta() == numeroConta) {
					
					conta2.realizarDeposito(valor);
					verificacao = true;
				}
		}
		
		if(verificacao == false) {
			System.out.println("Conta Inexistente");
		}
		
	}
	
	public void verificarSaldo(long numeroConta) {
		
		boolean verificacao = false;
		
		for (Conta conta2 : conta) {
			
				if(conta2.getNumeroConta() == numeroConta) {
					
					conta2.verificarSaldo();
					verificacao = true;
				}
		}
		
		if(verificacao == false) {
			System.out.println("Conta Inexistente");
		}
		
	}

}
