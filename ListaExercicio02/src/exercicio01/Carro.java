package exercicio01;

public class Carro {
	
	private String modelo;
	
	private String marca;
	
	private String cor;
	
	private long ano;
	
	private long renavam;
	
	private String chassi;
	
	private String placa;
	
	public Carro(String modelo, String marca, String cor, long ano, long renavam, String chassi, String placa) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
	}

	public void ligar() {
		
		System.out.println( this.modelo +  " está ligando");
		
	}
	
	public void acelerar() {
		System.out.println(this.modelo + " está acelerando");
	}
	
	public void emitirRelatorio() {
		
		System.out.println("Modelo: " +this.modelo);
		System.out.println("Marca: "+this.marca);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ano: "+this.ano);
		System.out.println("Renavam: "+this.renavam);
		System.out.println("Chassi: "+this.chassi);
		System.out.println("Placa: "+this.placa);
		
	}
	
	
	

}
