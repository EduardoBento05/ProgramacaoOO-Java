package exercicio02;

public class Professor {
	
	private long registro;
	
	private String nome;
	
	private String dataNascimento;
	
	private Double salario;
	
	public Professor(long registro, String nome, String dataNascimento, Double salario) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public long getRegistro() {
		return registro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}


	
	

}
