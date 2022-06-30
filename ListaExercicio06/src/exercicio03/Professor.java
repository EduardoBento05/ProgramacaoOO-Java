package exercicio03;

public class Professor {
	
	private String registro;
	
	private String nome;
	
	private String titulacao;
	
	private String dataAdmissao;
	
	private double salarioBase;
	
	private double salarioTotal;
	
	private int gratificacao;
	
	private Disciplina disciplina;
	
	
	
	public Professor(String registro, String nome, String titulacao, String dataAdmissao, double salarioBase,
			int gratificacao, String codigo,String nomeDisciplina, String ementa, int cargaHoraria) {
		this.registro = registro;
		this.nome = nome;
		this.titulacao = titulacao;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.setSalarioTotal(0);
		this.gratificacao = gratificacao;
		this.disciplina = new Disciplina(codigo,nomeDisciplina,ementa,cargaHoraria);
	}
	
	
	
	public void salario() {
		
		this.setSalarioTotal(this.salarioBase + this.gratificacao);
		
	}
	



	public String getRegistro() {
		return registro;
	}



	public void setRegistro(String registro) {
		this.registro = registro;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTitulacao() {
		return titulacao;
	}



	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}



	public String getDataAdmissao() {
		return dataAdmissao;
	}



	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public int getGratificacao() {
		return gratificacao;
	}



	public void setGratificacao(int gratificacao) {
		this.gratificacao = gratificacao;
	}



	public Disciplina getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}



	public double getSalarioTotal() {
		return salarioTotal;
	}



	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	
	public void imprimirDados() {
		
		this.setSalarioTotal(this.salarioBase + this.gratificacao);
		System.out.println("Registro: "  +this.registro);
		System.out.println("Nome: " +this.nome);
		System.out.println("Titulação" +this.titulacao);
		System.out.println("Data de Admissão: "+this.dataAdmissao);
		System.out.println("Salario Total: " +this.salarioTotal);
		System.out.println("Codigo da Disciplina: " +this.disciplina.getCodigo());
		System.out.println("Nome da Disciplina: " +this.disciplina.getNomeDisciplina());
		System.out.println("Ementa: " +this.disciplina.getEmenta());
		System.out.println("Carga Horária: " + this.disciplina.getCargaHoraria());
		
	}
	
	
	
	
	

}
