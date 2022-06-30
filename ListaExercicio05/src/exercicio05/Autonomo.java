package exercicio05;

public class Autonomo extends Prestador{
	
	private long cpf;
		
	 public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	 public void imprimirDados() {
		System.out.println("CPF do Autonomo: " + this.cpf);
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + "]";
	}
	 
	 
	
}
