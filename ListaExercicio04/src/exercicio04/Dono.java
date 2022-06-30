package exercicio04;

public class Dono {
	
	private long cpf;
	
	private String nome;
	
	private long telefone;
	
	private String email;
	
	private Endereco endereco;
	
	
	
	public Dono(long cpf, String nome, long telefone, String email,String logradouro,int numero,String bairro,String cidade,String estado) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado);
	}



	public long getCpf() {
		return cpf;
	}



	public String getNome() {
		return nome;
	}



	public long getTelefone() {
		return telefone;
	}



	public String getEmail() {
		return email;
	}



	public Endereco getEndereco() {
		return endereco;
	}

	
	

}
