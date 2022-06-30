package exercicio02;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Eduardo Bento","Masculino",469962398,27,1.71,71.5);
		
		pessoa1.imprimirDados();
		
		pessoa1.andar();
		pessoa1.falar();
		pessoa1.correr();
		pessoa1.dormir();
	}

}
