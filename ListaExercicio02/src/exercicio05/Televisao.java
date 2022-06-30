package exercicio05;

public class Televisao {

	private String marca;

	private Double polegadas;

	private String resolucao;

	private int canalAtual;

	private int volumeAtual;
	
	private boolean ativado;

	public Televisao(String marca, Double polegadas, String resolucao) {
		this.marca = marca;
		this.polegadas = polegadas;
		this.resolucao = resolucao;
		this.canalAtual = 1;
		this.volumeAtual = 1;
		this.ativado = false;
	}

	public void ligar() {
		
		if(false == this.ativado) {
			System.out.println(this.marca + " est� ligando");
			this.ativado = true;
		}else {
			System.out.println(this.marca + " j� est� ligada");
		}

	}

	public void desligar() {
		
		if(true == this.ativado) {
			System.out.println(this.marca + " est� desligando");
			this.ativado = false;
		}else {
			System.out.println(this.marca + " j� est� desligada");
		}

	}

	public void alterarCanalCima() {
		
		if(this.canalAtual >= 0 && this.canalAtual < 3) {
			System.out.println(this.marca + " est� mudando o canal");
			this.canalAtual = this.canalAtual + 1;
		}else {
			System.out.println("Imposs�vel mudar o canal");
		}
		
	}

	public void alterarCanalBaixo() {
		
		if(this.canalAtual >= 0 && this.canalAtual < 3) {
			System.out.println(this.marca + " est� mudando o canal");
			this.canalAtual = this.canalAtual - 1;
		}else {
			System.out.println("Imposs�vel mudar o canal");
		}

	}

	public void aumentarVolume() {
		
		if(this.volumeAtual >= 0 && this.volumeAtual < 3) {
			System.out.println(this.marca + " est� mudando o volume");
			this.volumeAtual = this.volumeAtual + 1;
		}else {
			System.out.println("Imposs�vel mudar o volume");
		}

	}

	public void abaixarVolume() {
		
		if(this.volumeAtual >= 0 && this.volumeAtual < 3) {
			System.out.println(this.marca + " est� mudando o volume");
			this.volumeAtual = this.volumeAtual - 1;
		}else {
			System.out.println("Imposs�vel mudar o volume");
		}

	}

	public void emitirRelatorio() {

		System.out.println("Marca: " + this.marca + ", Polegadas: " + this.polegadas + ", Resolu��o: " + this.resolucao + ", Canal Atual: " + this.canalAtual + 
				", Volume Atual " + this.volumeAtual);

	}

}
