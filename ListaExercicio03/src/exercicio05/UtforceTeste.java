package exercicio05;

public class UtforceTeste {
	
	public static void main(String[] args) {
		
		Utforce carro = new Utforce();
		
		carro.acelerar();
		carro.frear();
		carro.ligar();
		carro.ligar();
		carro.acelerar();
		carro.acelerar();
		carro.emitirVelocidade();
		carro.frear();
		carro.frear();
		carro.emitirVelocidade();
		carro.desligar();
		carro.desligar();
		carro.emitirVelocidade();
	}

}
