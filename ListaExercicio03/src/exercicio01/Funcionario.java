package exercicio01;

public class Funcionario {

	private long numeroRegistro;

	private String nome;

	private String dataNascimento;

	private String sexo;

	private String setor;

	private long telefone;

	private Endereco endereco;

	public Funcionario(long numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
			long telefone, String nomeRua, int numero, String bairro, String cidade, String estado) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = new Endereco(nomeRua,numero,bairro,cidade,estado);
	}
	
	public void emitirRelatorio() {
		System.out.println("Numero de Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("************** Endereço **************");
		System.out.println("Nome da Rua: " + this.endereco.getNomeRua());
		System.out.println("Número da Residencia: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Estado: " + this.endereco.getEstado());
	}
	
	
	

}
