package exercicio03;

public class IngressoVip extends Ingresso {
	
	private double valorAdicional;
	
	private String localizacao;
	
	public IngressoVip(double valorReais, String tipoIngresso, double valorAdicional, String localizacao) {
		super(valorReais, tipoIngresso);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	
	
	public double calcularValorIngressoVip() {
		
		return (super.valorReais + this.valorAdicional);
		
	}

	
	public void imprimirDadosIngresso() {
		super.imprimirDadosIngresso();
		System.out.println("Localização: " + this.localizacao);
		System.out.println("Valor Ingresso Vip: " + calcularValorIngressoVip());
	}
	
	

}
