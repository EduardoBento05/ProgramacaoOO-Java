package exercicio01;

public class CarroTeste {

	public static void main(String[] args) {
			
		Carro carro1 = new Carro();
		
		carro1.modelo = "Uno";
		carro1.marca  = "Fiat";
		carro1.cor  = "cinza";
		carro1.chassi = "54243232#$@";
		carro1.placa  = "AEPQ - 29856";
		carro1.ano = 2022;
		carro1.renavam  = 1995;
		
		System.out.println(carro1.toString());
		
	}

}
