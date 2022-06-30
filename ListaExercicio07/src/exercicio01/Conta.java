package exercicio01;

public class Conta {
	
	private long numeroConta;
	
	private Double saldo;
	
	private Cliente cliente;

	public Conta(long numeroConta, Double saldo,String nome,long cpf) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cliente = new Cliente(nome,cpf);
	}
	
	public void realizarSaque(double valor) {
		
		if(valor > 0 && valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque Realizado com Sucesso!! Conta: " + this.numeroConta);
		}else {
			System.out.println("Saldo insuficiente.Conta: " +this.numeroConta);
		}
		
	}
	
	public void realizarDeposito(double valor) {
		
		if(valor > 0) {
			this.saldo = this.saldo + valor;
			System.out.println("Depósito Realizado com Sucesso!!! Conta: " + this.numeroConta);
		}
		
	}
	
	public void verificarSaldo() {
		System.out.println("******************** SALDO ********************");
		System.out.println("Numero da Conta: " + this.numeroConta);
		System.out.println("Nome do Cliente: " + this.cliente.getNome());
		System.out.println("CPF: " + this.cliente.getCpf());
		System.out.println("Saldo Atual: " + this.saldo);
	}

	public long getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	

}
