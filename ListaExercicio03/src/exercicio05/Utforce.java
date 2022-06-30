package exercicio05;

public class Utforce {
	
	private int velocidade;
	
	private boolean ligado;
	
	public Utforce() {
		this.velocidade = 0;
		this.ligado = false;
	}
	
	public void ligar() {
		if(this.ligado == false) {
			System.out.println("Carro da UTForce e-Racing está ligando");
			setLigado(this.ligado = true);
		}else {
			System.out.println("Carro da UTForce e-Racing  está ligado");
		}
		
		trocarMarcha();
		
		
	}
	
	public void desligar() {
		if(true == this.ligado) {
			System.out.println("Carro da UTForce e-Racing está desligando");
			setLigado(this.ligado = false);
		}else {
			System.out.println("Carro da UTForce e-Racing está desligado");
		}
		
		trocarMarcha();
		
	}
	
	public void trocarMarcha() {
		

			
			if(this.velocidade == 0) {
				System.out.println("Modo Neutro");
			}
			
			else if(this.velocidade > 0  &&  this.velocidade <= 19) {
				System.out.println("1ª Marcha");
			}
			
			else if(this.velocidade > 19  &&   this.velocidade <= 39) {
				System.out.println("2ª Marcha");
			}
			
			else if(this.velocidade > 39  &&  this.velocidade <= 59) {
				System.out.println("3ª Marcha");
			}
			
			else if(this.velocidade > 59  && this.velocidade <= 89 ) {
				System.out.println("4ª Marcha");
			}
			
			else if(this.velocidade > 89  &&  this.velocidade <= 130  ) {
				System.out.println("5ª Marcha");
			}
			
		
		
	}
	
	public void acelerar() {
		
		if(true == this.ligado) {
			if(this.velocidade >= 0 && this.velocidade < 131) {
			System.out.println("O carro da UTForce e-Racing está acelerando");
			setVelocidade(this.velocidade = this.velocidade + 5);
			}else {
				System.out.println("Chegou ao Limite");
			}
		}else {
			desligar();
		}
		
		trocarMarcha();
	}
	
	public void frear() {
		
		if(true == this.ligado) {
			
			if(this.velocidade > 0 && this.velocidade < 131) {
			
					System.out.println("O carro da UTForce e-Racing está desacelerando");
					setVelocidade(this.velocidade = this.velocidade - 5);
			
				
			}else {
				System.out.println("Chegou ao Limite");
			}
			
		
		}else {
			desligar();
		}
		
		trocarMarcha();
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void emitirVelocidade() {
		System.out.println("Velocidade Atual: " + this.velocidade);
	}
	

}
