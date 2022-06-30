package exercicio05;

public class Empresa extends Prestador{
		
		private long cnpj;
	
	
		public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}


		public long getCnpj() {
			return cnpj;
		}


		public void setCnpj(long cnpj) {
			this.cnpj = cnpj;
		}

		
		public void imprimirDados() {
			System.out.println("CNPJ da Empresa: " + this.cnpj);
		}


		@Override
		public String toString() {
			return "Empresa [cnpj=" + cnpj + "]";
		}
	
	
	
}
