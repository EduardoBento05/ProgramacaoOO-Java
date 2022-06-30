package exercicio03;

public class Calculadora {
	
	private String marca;
	
	private String modelo;
	
	private String tipo;
	
	private int megabytes;
	
	public Calculadora(String marca, String modelo, String tipo, int megabytes) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.megabytes = megabytes;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getMegabytes() {
		return megabytes;
	}
	
	
	public void somar(double x , double y) {
		System.out.println("Soma: " + (x+y));
	}
	
	public void subtrair(double x, double y) {
		System.out.println("Subtrair: " + (x-y));
	}
	
	public void multiplicacao(double x, double y) {
		System.out.println("Multiplicação: " + (x*y));
	}
	
	public void divisao(double x, double y) {
		System.out.println("Divisão: " + (x/y));
	}
	
	public void emitirRelatorio() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Megabytes: " + this.megabytes);
	}
	
	
	


	
	

}
