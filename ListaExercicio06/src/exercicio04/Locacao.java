package exercicio04;

public class Locacao {
	
	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;
	private Cliente cliente;

	private double valorMulta;
	private double valorLocacao;
	
	private final int TOTAL_DIAS_LOCACAO;
	private final double VALOR_MULTA_DIARIA;
	
	public Locacao(Cliente cliente, int diaLocacao, double valorLocacao) {
		
		this.VALOR_MULTA_DIARIA = 2.00; // considerando que a multa por dia de atraso é de R$2,00
		this.TOTAL_DIAS_LOCACAO = 3; 	// um filme pode ficar locado por, no máximo, 3 dias sem gerar multa
		this.valorMulta = 0.00;			// quando instancio uma nova locação, a multa é zero, apenas na devolução que pode ser alterada.
		
		this.cliente = cliente;
		this.diaLocacao = diaLocacao;
		this.valorLocacao = valorLocacao;

		this.diaPrevistoDevolucao = this.calcularDiaPrevisaoDevolucao(diaLocacao);
	}
	
	private int calcularDiaPrevisaoDevolucao(int diaLocacao) {
		
		return diaLocacao + this.TOTAL_DIAS_LOCACAO;
	}
	
	public void calcularValorTotalLocacao(double precoLocacaoFilme) {
		
		if(this.diaPrevistoDevolucao < this.diaDevolucao) {
			
			this.valorMulta = (this.diaDevolucao - this.diaPrevistoDevolucao) * this.VALOR_MULTA_DIARIA;
			this.valorLocacao += valorMulta;
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getDiaDevolucao() {
		return diaDevolucao;
	}

	public void setDiaDevolucao(int diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}

	public int getDiaPrevistoDevolucao() {
		return diaPrevistoDevolucao;
	}

	public double getVALOR_MULTA_DIARIA() {
		return VALOR_MULTA_DIARIA;
	}

	public int getDiaLocacao() {
		return diaLocacao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public double getValorMulta() {
		return valorMulta;
	}

}
