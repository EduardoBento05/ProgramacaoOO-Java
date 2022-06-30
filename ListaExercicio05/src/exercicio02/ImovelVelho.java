package exercicio02;

public class ImovelVelho extends Imovel{
		
	
		private double valorDesconto;
		
		public ImovelVelho(String logradouro, int numero, String bairro, String cidade, String estado, double valorBase,
			double valorDesconto) {
		super(logradouro, numero, bairro, cidade, estado, valorBase);
		this.valorDesconto = valorDesconto;
	}
		
		public void imprimirDados() {
			super.imprimirDados();
			System.out.println("Valor de Desconto: " + this.valorDesconto);
			System.out.println("Valor Final: " + (super.valorBase - this.valorDesconto));
		}
		
		
		
	
}
