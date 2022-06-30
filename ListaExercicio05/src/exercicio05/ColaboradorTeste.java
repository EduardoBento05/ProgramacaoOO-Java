package exercicio05;

public class ColaboradorTeste {
	
	public static void main(String[] args) {
		
		System.out.println("Empregado");
		Empregado empregado1 = new Empregado("Carlos", "Ponta Grossa", "01/03/1990", 
				"Entregador", 2000, 24);
		empregado1.imprimirDados();
		System.out.println("================================");
		
		System.out.println("Estagiário");
		Estagiario estagiario1 = new Estagiario("Rafaela", "São Paulo", "27/06/2015",
				"Recepcionista", 1000, 05);
		estagiario1.imprimirDados();
		System.out.println("================================");
		
		System.out.println("Empresa");
		Empresa empresa1 = new Empresa("Extra", "Curitiba", "30/01/2008", 10,
				"Doador de Alimentos",624353500);
		empresa1.imprimirDados();
		System.out.println("================================");
		
		System.out.println("Autonomo");
		Autonomo autonomo1 = new Autonomo("Ricardo", "Cotia", "21/08/2017", 8,
				"Entregador", 357789521);
		autonomo1.imprimirDados();
	}

}
