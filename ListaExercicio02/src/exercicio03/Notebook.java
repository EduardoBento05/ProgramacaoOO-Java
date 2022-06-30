package exercicio03;

public class Notebook {

	private String marca;

	private String modelo;

	private Double polegadas;

	private String modeloProcessador;

	private int quantidadeMemoria;

	private String capacidadeArmazenamento;

	public Notebook(String marca, String modelo, Double polegadas, String modeloProcessador, int quantidadeMemoria,
			String capacidadeArmazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.modeloProcessador = modeloProcessador;
		this.quantidadeMemoria = quantidadeMemoria;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	public void ligar() {
			System.out.println(this.modelo + " está ligando");
	}

	public void desligar() {
			System.out.println(this.modelo + " está desligando");
	}

	public void conectarInternet() {
			System.out.println(this.modelo + " está conectando a internet");
	}

	public void processarInformacoes() {
			System.out.println(this.modelo + " está processando informações");
	}

	public void imprimirDados() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Polegadas: " + this.polegadas);
		System.out.println("Modelo de Processador: " + this.modeloProcessador);
		System.out.println("Capacidade da Memória: " + this.quantidadeMemoria + "GB");
		System.out.println("Quantidade de Armazenamento: " + this.capacidadeArmazenamento);
	}

}
