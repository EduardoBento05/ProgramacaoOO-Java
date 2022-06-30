package exercicio04;

public class Alunos {
	
	private String ra;
	
	private String nome;
	
	private String curso;
	
	private int periodo;
	
	private Double coeficiente;
	
	private	String situacao;
	
	public Alunos(String ra, String nome, String curso, int periodo, Double coeficiente, String situacao) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.periodo = periodo;
		this.coeficiente = coeficiente;
		this.situacao = situacao;
	}
	
	public void imprimirRelatorio() {
		System.out.println("RA: " +this.ra);
		System.out.println("Nome: " +this.nome);
		System.out.println("Curso: "+this.curso);
		System.out.println("Periodo: "+this.periodo);
		System.out.println("Coeficiente: " +this.coeficiente);
		System.out.println("Situação: "+this.situacao);
		
	}



}
