package exercicio04;

public class Tratamento {
	

	private String descricao;
	
	private String dataInicio;
	
	private String dataFim;
	
	public Tratamento(String descricao, String dataInicio, String dataFim) {
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public Tratamento(String descricao, String dataInicio) {
		this(descricao,dataInicio,"Data para o fim do Tratamento Inexistente");
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}


}
