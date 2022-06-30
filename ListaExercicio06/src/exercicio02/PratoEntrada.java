package exercicio02;

public class PratoEntrada {
	
	private int id;
	private String nome;
	private String descricao;
	private double valor;

	public PratoEntrada(int id, String nome, String descricao, double valor) {

		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

}
