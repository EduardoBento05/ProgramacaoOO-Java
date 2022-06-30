package exercicio03;

public class TitularConta {
	
	private long cpf;

	private long rg;

	private String nome;

	private String dataNascimento;

	private String sexo;

	private Double rendaMensal;

	private Endereco endereco;


	public TitularConta(long cpf, long rg, String nome, String dataNascimento, String sexo, Double rendaMensal,
			String logradouro,int numero,String bairro,String cidade,String estado) {
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado);
	}


	public long getCpf() {
		return cpf;
	}


	public long getRg() {
		return rg;
	}


	public String getNome() {
		return nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public String getSexo() {
		return sexo;
	}


	public Double getRendaMensal() {
		return rendaMensal;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	
}
