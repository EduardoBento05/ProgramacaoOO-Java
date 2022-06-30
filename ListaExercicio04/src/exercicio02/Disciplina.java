package exercicio02;

public class Disciplina {
	
	private long codigo;
	
	private String nome;
	
	private String modalidade;
	
	private int horas;
	
	private Professor professor;
	
	public Disciplina(long codigo, String nome, String modalidade, int horas, long registro,String nome1, String dataNascimento,
			Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.horas = horas;
		this.professor = new Professor(registro,nome1,dataNascimento,salario);
	}
	
	public void imprimirRelatorio() {
		
		System.out.println("Codigo da Disciplina: " + this.codigo);
		System.out.println("Nome da Disciplina: " + this.nome);
		System.out.println("Modalidade da Disciplina: " + this.modalidade);
		System.out.println("Carga Horária: " + this.horas);
		System.out.println("Registro do Professor: " + this.professor.getRegistro());
		System.out.println("Nome do Professor: " + this.professor.getNome());
		System.out.println("Data de Nascimento: " + this.professor.getDataNascimento());
		System.out.println("Salário: " + this.professor.getSalario());
	}

	

}
