package exercicio05;

public class Local {
	
	private String	nomeLocal;
	
	private Endereco endereco;
	
	private int capacidadeMaxima;
	
	
	public Local(String nomeLocal,String logradouro,int numero,String bairro,String cidade,String estado, int capacidadeMaxima) {
		super();
		this.nomeLocal = nomeLocal;
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado);
		this.capacidadeMaxima = capacidadeMaxima;
	}


	public String getNomeLocal() {
		return nomeLocal;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	
	

}
