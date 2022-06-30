package exercicio01;

public class Aluno extends Pessoa{
	
		private int numeroMatricula;
	
		public Aluno(String nome, String nascimento, long rg, long cpf, int numeroMatricula) {
		super(nome, nascimento, rg, cpf);
		this.numeroMatricula = numeroMatricula;
	}

		
		public void imprimirDados() {
			super.imprimirDados();
			System.out.println("Numero da Matrícula: " + this.numeroMatricula);
		}
		
	
}
