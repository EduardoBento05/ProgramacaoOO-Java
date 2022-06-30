package exercicio03;

public class TecnicoAdministrativo {

	private String registro;

	private String nome;

	private String dataAdmissao;

	private double salarioBase;
	
	private double salarioTotal;

	private double adicionalNoturno;

	private Processo processo;

	public TecnicoAdministrativo(String registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno, int numero, String dataCriacao, String descricao) {
		
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
		this.setSalarioTotal(0);
		this.adicionalNoturno = adicionalNoturno;
		this.processo = new	Processo(numero,dataCriacao,descricao);
	}
	
	public void salario() {
		
		this.salarioTotal = this.salarioBase + this.adicionalNoturno;
		
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

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
	public void imprimirDados() {
		
		System.out.println("Registro: " +this.registro);
		System.out.println("Nome: " +this.nome);
		System.out.println("Data de Admissão: " +this.dataAdmissao);
		System.out.println("Salario Total: " +this.salarioTotal);
		System.out.println("Numero de Processo: " +this.processo.getNumero());
		System.out.println("Data da criação: " +this.processo.getDataCriacao());
		System.out.println("Descrição do Processo: " +this.processo.getDescricao());
		
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

}
