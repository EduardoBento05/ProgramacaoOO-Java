package exercicio03;

public class Alunos {
	
	private String nome;
	
	private long ra;
	
	private double nota1;
	
	private double nota2;
	
	private double nota3;
	
	private double nota4;
	
	private double mediaAluno;

	public Alunos(String nome, long ra, double nota1, double nota2, double nota3, double nota4) {
		this.nome = nome;
		this.ra = ra;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.mediaAluno = 0.0;
	}
	
	public void calcularMediaAluno() {
		
		this.mediaAluno = ((this.nota1*0.1) + (this.nota2*0.2) + (this.nota3*0.3) + (this.nota4*0.4));
		
		if(this.mediaAluno >= 6.0) {
			System.out.println("Aluno: " + this.nome + " Aprovado!");
			System.out.println("Média: " + this.mediaAluno);
		}
		else {
			System.out.println("Aluno: " + this.nome + " Reprovado!");
			System.out.println("Média: " + this.mediaAluno);
		}
	}
	
	
	public void imprimirDadosAluno() {
		System.out.println("RA: " + this.ra);
		System.out.println("Nome: " + this.nome);
		System.out.println("P1: " + this.nota1 + " P2: " + this.nota2 + " P3: " + this.nota3 + " P4: " +this.nota4);
		System.out.println("Media: " + this.mediaAluno);
	}

	public String getNome() {
		return nome;
	}

	public long getRa() {
		return ra;
	}
	
	
	
	
	
	

}
