package exercicio03;

public class Processo {

	private int numero;

	private String dataCriacao;

	private String descricao;

	public Processo(int numero, String dataCriacao, String descricao) {
		super();
		this.numero = numero;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
