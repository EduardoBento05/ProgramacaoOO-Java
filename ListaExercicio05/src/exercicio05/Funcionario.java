package exercicio05;

public class Funcionario extends Colaborador{
	
		protected String funcao;
		
		protected double salario;
		

		
		public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}



		public String getFuncao() {
			return funcao;
		}



		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}



		public double getSalario() {
			return salario;
		}



		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public void imprimirDados() {
			System.out.println("Função do Funcionário: " + this.funcao);
			System.out.println("Salário do Funcionário: " + this.salario);
		}



		@Override
		public String toString() {
			return "Funcionario [funcao=" + funcao + ", salario=" + salario + "]";
		}

	
		
	
	
}
