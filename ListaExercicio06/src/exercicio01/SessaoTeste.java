package exercicio01;

public class SessaoTeste {
	
	public static void main(String[] args) {
		
		Sessao sessao1 = new Sessao("24/05/1988","22:00","O Grande Dragão Branco",92,"69",25);
		
		sessao1.imprimirDados();
		
		
		sessao1.venderIngresos(4);
		
		sessao1.venderIngresos(21);
		
		sessao1.venderIngresos(2);
	}

}
