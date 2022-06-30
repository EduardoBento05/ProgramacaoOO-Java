package exercicio05;

public class Empregado extends Funcionario{
			
			private int carteiraTrabalho;
		
			public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
			int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}

			public int getCarteiraTrabalho() {
				return carteiraTrabalho;
			}

			public void setCarteiraTrabalho(int carteiraTrabalho) {
				this.carteiraTrabalho = carteiraTrabalho;
			}
			
			
			public void imprimirDados() {
				System.out.println("Número da Carteira de Trabalho: " + this.carteiraTrabalho);
			}

			@Override
			public String toString() {
				return "Empregado [carteiraTrabalho=" + carteiraTrabalho + "]";
			}

			
			
			
	
	
	
}
