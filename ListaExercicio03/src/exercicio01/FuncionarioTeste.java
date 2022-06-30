package exercicio01;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(2319152,"Eduardo de Almeida Bento Dias","29/04/1995","Masculino"
				,"Desenvolvedor",1599710013,"Senador Pinheiro Machado",656,"Centro","Ponta Grossa","Paraná");
		
		funcionario.emitirRelatorio();
	}

}
