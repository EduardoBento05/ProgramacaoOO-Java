package exercicio04;

public class Socio extends Cliente{
	
	private String cpf;
	private Dependente dependente;

	public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf, Dependente dependente) {

		super(nome, dataNascimento, telefone, endereco);
		this.cpf = cpf;
		this.dependente = dependente;
	}

	public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf) {

		super(nome, dataNascimento, telefone, endereco);
		this.cpf = cpf;
	}

}
