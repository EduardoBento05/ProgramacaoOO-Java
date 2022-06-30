package exercicio02;

public class Pessoa {

	private String nome;

	private String sexo;

	private long cpf;

	private int idade;

	private Double altura;

	private Double peso;

	public Pessoa(String nome, String sexo, long cpf, int idade, Double altura, Double peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public void andar() {
		System.out.println(this.nome + " está andando");
	}

	public void falar() {
		System.out.println(this.nome + " está falando");
	}

	public void correr() {
		System.out.println(this.nome + " está correndo");
	}

	public void dormir() {
		System.out.println(this.nome + " está dormindo");
	}
	
	public void imprimirDados() {
		
		System.out.println("Nome: " +this.nome);
		System.out.println("Sexo: " +this.sexo);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Idade: " +this.idade);
		System.out.println("Altura: " +this.altura);
		System.out.println("Peso: " +this.peso);
		
	}

}
