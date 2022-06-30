package exercicio03;

public class Notebooks {
	
	private String marca;
	
	private String modelo;
	
	private String polegadas;
	
	private String modeloProcessador;
	
	private int quantidadeMemoria;
	
	private String capacidadeArmazenamento;
	
	public Notebooks(String marca, String modelo, String polegadas, String modeloProcessador, int quantidadeMemoria,
			String capacidadeArmazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.modeloProcessador = modeloProcessador;
		this.quantidadeMemoria = quantidadeMemoria;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}
	
	public void processarInformacoes() {
		
	}
	
	public void conectarInternet() {
		
	}
	

	
	public void emitirRelatorio() {
		System.out.println("Marca: " +this.marca);
		System.out.println("Modelo: " +this.modelo);
		System.out.println("Polegadas: " +this.polegadas);
		System.out.println("Modelo do Processador: " +this.modeloProcessador);
		System.out.println("Quantidade de Memória: " +this.quantidadeMemoria + "GB");
		System.out.println("Capacidade de Armazenamento: " +this.capacidadeArmazenamento);
	}

	

}
