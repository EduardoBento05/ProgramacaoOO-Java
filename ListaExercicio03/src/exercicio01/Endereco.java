package exercicio01;

public class Endereco {
	
	private String nomeRua;
	
	private int numero;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
	public Endereco(String nomeRua, int numero, String bairro, String cidade, String estado) {
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	
	
	

}
