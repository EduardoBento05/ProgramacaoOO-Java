package exercicio04;

public class Vagas {

	private int numeroVaga;

	private Veiculo veiculo;

	private int horaInicial;

	private int horaFinal;

	private int horaTotal;

	private boolean disponibilidade;

	public Vagas(int numeroVaga, int placa) {
		this.numeroVaga = numeroVaga;
		this.veiculo = new Veiculo(placa);
		this.horaInicial = 0;
		this.horaFinal = 0;
		this.horaTotal = 0;
		this.disponibilidade = true;
	}

	public void estacionarVaga(int tempoInicial) {

		if (this.disponibilidade == true) {
			this.disponibilidade = false;
			System.out.println("Carro com a Placa: " + this.veiculo.getPlaca() + " Estacionado na vaga: "
					+ this.numeroVaga + "Com Sucesso");
			if (tempoInicial >= 0) {
				this.horaInicial = tempoInicial;
				System.out.println("Hora Inicial: " + this.horaInicial);
			} else {
				System.out.println("Impossível Tempo Negativo");
			}
		} else {
			System.out.println("Vaga Ocupada.");
		}

	}

	public void retirarVaga(int tempoFinal) {

		if (this.disponibilidade == false) {

			this.disponibilidade = true;
			System.out.println("Carro com a Placa: " + this.veiculo.getPlaca() + " Retirado na vaga: " + this.numeroVaga
					+ "Com Sucesso");

			this.horaFinal = tempoFinal;

			this.horaTotal = tempoFinal - this.horaInicial;

			if (this.horaTotal >= 0 && this.horaTotal <= 3) {
				System.out.println("Carro com a Placa: " + this.veiculo.getPlaca() + " não obteve multa de Atraso");
				System.out.println("Valor sem multa a ser Cobrado: R$" + 2.00);
			} else {
				System.out.println("Carr com a Placa: " + this.veiculo.getPlaca() + " Terá que pagar: "
						+ ((this.horaTotal - 3) * 0.5 + 2));
			}
		} else {
			System.out.println("Vaga Está Disponível");
		}

	}

	public int getNumeroVaga() {
		return numeroVaga;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

}
