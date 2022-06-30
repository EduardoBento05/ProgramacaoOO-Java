package exercicio01;

public class Pessoa {
	
		protected String nome;
		
		protected String nascimento;
		
		protected long rg;
		
		protected long cpf;
	
	
		public Pessoa(String nome, String nascimento, long rg, long cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
		
		public void imprimirDados() {
			
			System.out.println("Nome: " + this.nome);
			System.out.println("Data de Nascimento: " + this.nascimento);
			System.out.println("RG: " +  this.rg);
			System.out.println("CPF: " + this.cpf);
			
		}

		
		

}
