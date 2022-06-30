package exercicio03;

public class Conta {
	
	private String numero;
	
	private TitularConta titular;
	
	private Double saldo;
	
	
	public Conta(String numero,long cpf,long rg,String nome,String dataNascimento,String sexo,Double rendaMensal,
			 Double saldo,String logradouro,int numero1,String bairro,String cidade,String estado) {
		this.numero = numero;
		this.titular = new TitularConta(cpf,rg,nome,dataNascimento,sexo,rendaMensal,logradouro,numero1,bairro,cidade,estado);
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		
		if(valor > 0 && valor < this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque Realizado com Sucesso");
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
	
	public void depositar(double valor) {
		
		if(valor > 0) {
			this.saldo = this.saldo + valor;
			System.out.println("Depósito Realizado com Sucesso");
		}
		
		
	}
	
	public void emitirSaldo() {
		
		System.out.println("Saldo: " + this.saldo);
		
	}
	
	public void emitirRelatorio() {
		System.out.println("************** Conta **************");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Saldo da Conta: " +this.saldo);
		System.out.println("************** Titular **************");
		System.out.println("CPF: " +  this.titular.getCpf());
		System.out.println("RG: " + this.titular.getRg());
		System.out.println("Nome: " + this.titular.getNome());
		System.out.println("Data de Nascimento: " + this.titular.getDataNascimento());
		System.out.println("Sexo: " + this.titular.getSexo());
		System.out.println("Renda Mensal: " + this.titular.getRendaMensal());
		System.out.println("************** Endereço **************");
		System.out.println("Logradouro: " + this.titular.getEndereco().getLogradouro());
		System.out.println("Numero: " + this.titular.getEndereco().getNumero());
		System.out.println("Bairro: " + this.titular.getEndereco().getBairro());
		System.out.println("Cidade: " + this.titular.getEndereco().getCidade());
		System.out.println("Estado: " + this.titular.getEndereco().getEstado());
	}

	
	
	

}
