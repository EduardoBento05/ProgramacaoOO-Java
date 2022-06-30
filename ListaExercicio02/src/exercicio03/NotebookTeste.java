package exercicio03;

public class NotebookTeste {
	
	public static void main(String[] args) {
		
		Notebook note1 = new Notebook("Lenovo","Ideapad-3",15.6,"AMD-Ryzen 5500U",8,"256GB");
		
		note1.imprimirDados();
		note1.ligar();
		note1.conectarInternet();
		note1.processarInformacoes();
		note1.desligar();
	}

}
