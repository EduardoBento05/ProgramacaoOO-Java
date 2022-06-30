package exercicio01;

public class Funcionario {
	
	private long numeroRegistro;
	
	private String nome;
	
	private String dataNascimento;
	
	private String sexo;
	
	private String setorTrabalho;
	
	private Endereco endereco;
	
	
	
	public Funcionario(long numeroRegistro, String nome, String dataNascimento, String sexo, String setorTrabalho,
			String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setorTrabalho = setorTrabalho;
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,unidadeFederativa);
	}
	
	
	public void imprimirDados() {
		System.out.println("Numero de Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setorTrabalho);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Unidade Federativa: " + this.endereco.getUnidadeFederativa());
	}

	

}
