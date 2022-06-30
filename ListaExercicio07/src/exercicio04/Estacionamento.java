package exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	
	private List<Vagas> carros;
	
	public  Estacionamento() {
		this.carros = new ArrayList<Vagas>();
	}
	
	
	public void adicionarNovaVaga(int numeroVaga,int placa) {
		
		Vagas veiculo1 = new Vagas(numeroVaga,placa);
		
		this.carros.add(veiculo1);
		
		System.out.println("Vaga: " + numeroVaga + " Carro com a Placa: " + placa + " Adicionado com Sucesso");
		
	}
	
	
	public void estacionarVaga(int numeroVaga,int horaInicial) {
		
		boolean verificacao = false;
		
		for (Vagas vagas : carros) {
			
			if(vagas.getNumeroVaga() == numeroVaga) {
				
				vagas.estacionarVaga(horaInicial);
				verificacao = true;
			}
			
		}
		
		if(verificacao == false ) {
			System.out.println("Vaga Inexistente");
		}
		
		
	}
	
	public void retirarVaga(int numeroVaga,int horaFinal) {
		
		boolean verificacao = false;
		
		for (Vagas vagas : carros) {
			
			if(vagas.getNumeroVaga() == numeroVaga) {
				
				vagas.retirarVaga(horaFinal);
				verificacao = true;
			}
			
		}
		
		if(verificacao == false ) {
			System.out.println("Vaga Inexistente");
		}
		
	}

}
