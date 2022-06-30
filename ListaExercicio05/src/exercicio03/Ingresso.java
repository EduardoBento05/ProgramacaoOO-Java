package exercicio03;

public class Ingresso {
	
	protected double valorReais;
	
	protected String tipoIngresso;
	
	
	public Ingresso(double valorReais, String tipoIngresso) {
		super();
		this.valorReais = valorReais;
		this.tipoIngresso = tipoIngresso;
	}
	
	
	public void imprimirDadosIngresso() {
		System.out.println("Tipo de Ingresso: " + this.tipoIngresso);
	}
	
	
	

	
	
	

}
