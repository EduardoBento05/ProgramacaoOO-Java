package exercicio02;

public class ImovelNovo extends Imovel{
	
	private double valorAdicional;
	
	public ImovelNovo(String logradouro, int numero, String bairro, String cidade, String estado, double valorBase,
			double valorAdicional) {
		super(logradouro, numero, bairro, cidade, estado, valorBase);
		this.valorAdicional = valorAdicional;
	}

	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor Adicional: " + this.valorAdicional);
		System.out.println("Valor Final: " + (super.valorBase + this.valorAdicional));
	}
	
	
	

}
