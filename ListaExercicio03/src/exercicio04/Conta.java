package exercicio04;

public class Conta {
	
	private long numeroAgencia;
	
	private long numeroConta;
	
	private double saldo;
	
	
	public Conta(long numeroAgencia, long numeroConta, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void sacar(double n) {
		
		if( n > 0 && n < this.saldo) {
			System.out.println(this.numeroConta + " está realizando Saque");
			setSaldo(this.saldo = this.saldo - n);
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
	
	public void depositar(double n) {
		
		
		if(n > 0) {
			System.out.println("Depósito Realizado com Sucesso");
			setSaldo(this.saldo = this.saldo + n);
		}else {
			System.out.println("Impossível Realizar Depósito");
		}
		
	}
	
	public void verificarSaldo() {
		System.out.println("Saldo Atual: " + this.saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirDados() {
		System.out.println("Numero Agencia: " + this.numeroAgencia);
		System.out.println("Número Conta: " + this.numeroConta);
	}

	
	

}
