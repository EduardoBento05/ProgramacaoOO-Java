package exercicio04;

public class Animal {
	
	private String nome;
	
	private int idade;
	
	private String sexo;
	
	private Dono dono;
	
	private Tratamento tratamento;
	
	public Animal(String nome, int idade, String sexo,long cpf,String nome1,long telefone,String email,String logradouro
			,int numero,String bairro,String cidade,String estado, Tratamento tratamento) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = new Dono(cpf,nome1,telefone,email,logradouro,numero,bairro,cidade,estado);
		this.tratamento = tratamento;
	}
	
	
	public void emitirRelatorio() {
		System.out.println("****************** Animal ******************");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("\"****************** Tratamento******************\"");
		System.out.println("Descrição do Tratamento: " + this.tratamento.getDescricao());
		System.out.println("Data de Inicio: " + this.tratamento.getDataInicio());
		System.out.println("Data de Fim: " + this.tratamento.getDataFim());
		System.out.println("****************** Dono ******************");
		System.out.println("CPF: " + this.dono.getCpf());
		System.out.println("Nome: " + this.dono.getNome());
		System.out.println("Telefone: " + this.dono.getTelefone());
		System.out.println("Email: " + this.dono.getEmail());
		System.out.println("****************** Endereço ******************");
		System.out.println("Logradouro: " + this.dono.getEndereco().getLogradouro());
		System.out.println("Número: " + this.dono.getEndereco().getNumero());
		System.out.println("Bairro: " + this.dono.getEndereco().getBairro());
		System.out.println("Cidade: " + this.dono.getEndereco().getCidade());
		System.out.println("Estado: " + this.dono.getEndereco().getEstado());
		
	}
	
	
	
	

}
