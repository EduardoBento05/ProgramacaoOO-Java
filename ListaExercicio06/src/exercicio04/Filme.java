package exercicio04;

public class Filme {
	
	private String titulo;
	private int duracao;
	private double preco;
	private Locacao locacao;

	public Filme(String titulo, int duracao, double preco) {

		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
	}

	public void locarFilme(Cliente cliente, int diaLocacao) {

		if (this.locacao == null) {

			this.locacao = new Locacao(cliente, diaLocacao, this.preco);

			System.out.println("O filme " + this.titulo + " foi locado com sucesso para o(a) cliente "	+ this.locacao.getCliente().getNome());

		} else {

			System.out.println("Não é possível realizar a locação. O filme " + this.titulo + " encontra-se locado.");
		}
	}

	public void devolverFilme(int diaDevolucao) {

		if (this.locacao != null) {

			this.locacao.setDiaDevolucao(diaDevolucao);
			
			this.locacao.calcularValorTotalLocacao(this.preco);

			System.out.println("O Filme " + this.titulo + " foi devolvido com sucesso pelo(a) cliente " + this.locacao.getCliente().getNome());
			this.exibirRelatorio();

			this.locacao = null;

		} else {

			System.out.println("Não é possível realizar a devolução. O filme " + this.titulo + " não encontra-se locado.");
		}
	}

	private void exibirRelatorio() {

		System.out.println("============== Relatório ==============");
		System.out.println("Título do Filme: " + this.titulo);
		System.out.println("Cliente: " + this.locacao.getCliente().getNome());
		System.out.println("Dia da Locação: " + this.locacao.getDiaLocacao());
		System.out.println("Dia Previsto para Devolução: " + this.locacao.getDiaPrevistoDevolucao());
		System.out.println("Dia Devolução: " + this.locacao.getDiaDevolucao());
		System.out.println("Valor do Filme: R$" + this.preco);
		System.out.println("Valor da Multa: R$" + this.locacao.getValorMulta());
		System.out.println("Valor Total da Locação: R$" + this.locacao.getValorLocacao());
		System.out.println("=======================================");
	}

}
