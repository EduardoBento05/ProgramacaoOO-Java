package exercicio02;

public class Sobremesa {
	
	private int id;
	private String nome;
	private String descricao;
	private double valor;

	public Sobremesa(int id, String nome, String descricao, double valor) {
		super();
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
