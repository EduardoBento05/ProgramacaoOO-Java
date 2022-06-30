package exercicio02;

public class Pessoa {
	
	private	String nome;
	
	private String	sexo;
	
	private	int idade;
	
	private int cpf;
	
	private Double altura;
	
	private Double peso;
	
	public Pessoa(String nome, String sexo, int idade, int cpf, Double altura, Double peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void andar() {
		
	}
	
	public void correr() {
		
	}
	
	public void falar() {
		
	}
	
	public void dormir() {
		
	}

	public void imprimirDados() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Idade: " +this.idade);
		System.out.println("Altura: "+this.altura);
		System.out.println("Peso: " +this.peso);
	}

	
	

}
