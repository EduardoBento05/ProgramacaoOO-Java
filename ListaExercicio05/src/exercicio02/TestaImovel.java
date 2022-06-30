package exercicio02;

public class TestaImovel {
	
	public static void main(String[] args) {
		
		ImovelVelho imovel1 = new ImovelVelho("Senador Pinheiro Machado",656,"Centro","Ponta Grossa","Paraná",55000.00,5000.00);
		
		imovel1.imprimirDados();
		
		ImovelNovo imovel2 = new ImovelNovo("Senador Pinheiro Machado",656,"Centro","Ponta Grossa","Paraná",55000.00,10000.00);
		
		imovel2.imprimirDados();
	}

}
