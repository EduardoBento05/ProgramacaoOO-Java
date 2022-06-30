package exercicio02;

public class Disciplina {
	

	private long codigo;
	
	private String nome;
	
	private String modalidade;
	
	private int cargaHoraria;
	
	private String conteudo;
	
	
	
	public Disciplina(long codigo, String nome, String modalidade, int cargaHoraria, String conteudo) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudo = conteudo;
	}

	
	public void emitirRelatorio() {
		System.out.println("********************* Relatório da Disciplina *********************");
		System.out.println("Codigo da Disciplina: " + this.codigo);
		System.out.println("Nome da Disciplina: " + this.nome);
		System.out.println("Modalidade da Disciplina: " + this.modalidade);
		System.out.println("Carga Horária: " + this.cargaHoraria);
		System.out.println("Conteúdo: " + this.conteudo);
	}
	
	

}
