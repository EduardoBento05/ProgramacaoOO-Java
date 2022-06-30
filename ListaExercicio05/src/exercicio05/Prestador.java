package exercicio05;

public class Prestador extends Colaborador{
		
			protected double valorHora;
			
			protected String tipoServico;
			
	
	
			public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}



			public double getValorHora() {
				return valorHora;
			}



			public void setValorHora(double valorHora) {
				this.valorHora = valorHora;
			}



			public String getTipoServico() {
				return tipoServico;
			}



			public void setTipoServico(String tipoServico) {
				this.tipoServico = tipoServico;
			}

			public void imprimirDados() {
				System.out.println("Valor da Hora do prestador: " + this.valorHora);
				System.out.println("Tipo de Serviço do prestador: " + this.tipoServico);
			}



			@Override
			public String toString() {
				return "Prestador [valorHora=" + valorHora + ", tipoServico=" + tipoServico + "]";
			}
			
	
	
}
