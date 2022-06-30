package exercicio04;

public class EstacionamentoTeste {
	
	public static void main(String[] args) {
		
		Estacionamento carro1 = new Estacionamento();
		
		carro1.adicionarNovaVaga(1, 4);
		
		carro1.estacionarVaga(1, 5);
		
		carro1.estacionarVaga(1, 3);
		
		carro1.retirarVaga(2, 4);
		
		carro1.retirarVaga(1, 10);
		
	}

}
