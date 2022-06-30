package exercicio02;

public class Cliente {

	private String nome;
	private long cpf;
	private Conta conta;

	public Cliente(String nome, long cpf, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
	}

	public void fecharConta() {

		if (this.conta.getPratoEntrada() != null) {

			System.out.println("Prato de entrada: " + this.conta.getPratoEntrada().getNome());
			System.out.println("Valor: R$" + this.conta.getPratoEntrada().getValor());
		}

		if (this.conta.getPratoPrincipal() != null) {

			System.out.println("Prato principal: " + this.conta.getPratoPrincipal().getNome());
			System.out.println("Valor: R$" + this.conta.getPratoPrincipal().getValor());
		}

		if (this.conta.getSobremesa() != null) {

			System.out.println("Sobremesa: " + this.conta.getSobremesa().getNome());
			System.out.println("Valor: R$" + this.conta.getSobremesa().getValor());
		}

		System.out.println("Valor da conta: R$" + (this.conta.getValorConta() + (this.conta.getValorConta() * 0.10)));
	}

}