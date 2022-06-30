package exercicio04;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private int cep;
	private String cidade;
	private String unidadeFederativa;
	
	public Endereco(String logradouro, int numero, String bairro, int cep, String cidade, String unidadeFederativa) {
		
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

}
