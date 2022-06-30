package exercicio02;

public class Conta {

	private PratoEntrada pratoEntrada;
	private PratoPrincipal pratoPrincipal;
	private Sobremesa sobremesa;
	private double valorConta;

	public Conta() {

		this.valorConta = 0;
		this.pratoEntrada = null;
		this.pratoPrincipal = null;
		this.sobremesa = null;
	}

	public void pedirEntrada() {

		if (this.pratoEntrada == null) {

			this.pratoEntrada = new PratoEntrada(1, "Sopa", "Prato de entrada", 10.00);
			this.valorConta += this.pratoEntrada.getValor();
		} else
			System.out.println("Prato de entrada já pedido.");
	}

	public void pedirPrincipal() {

		if (this.pratoPrincipal == null) {

			this.pratoPrincipal = new PratoPrincipal(2, "Carne", "Prato Principal", 20.00);
			this.valorConta += this.pratoPrincipal.getValor();
		} else
			System.out.println("Prato principal já pedido.");
	}

	public void pedirSobremesa() {

		if (this.sobremesa == null) {

			this.sobremesa = new Sobremesa(3, "Pudim", "Sobremesa", 8.00);
			this.valorConta += this.sobremesa.getValor();
		} else
			System.out.println("Sobremesa já pedida.");
	}

	public PratoEntrada getPratoEntrada() {
		return pratoEntrada;
	}

	public PratoPrincipal getPratoPrincipal() {
		return pratoPrincipal;
	}

	public Sobremesa getSobremesa() {
		return sobremesa;
	}

	public double getValorConta() {
		return valorConta;
	}

}