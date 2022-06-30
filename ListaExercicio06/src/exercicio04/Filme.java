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

			System.out.println("N�o � poss�vel realizar a loca��o. O filme " + this.titulo + " encontra-se locado.");
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

			System.out.println("N�o � poss�vel realizar a devolu��o. O filme " + this.titulo + " n�o encontra-se locado.");
		}
	}

	private void exibirRelatorio() {

		System.out.println("============== Relat�rio ==============");
		System.out.println("T�tulo do Filme: " + this.titulo);
		System.out.println("Cliente: " + this.locacao.getCliente().getNome());
		System.out.println("Dia da Loca��o: " + this.locacao.getDiaLocacao());
		System.out.println("Dia Previsto para Devolu��o: " + this.locacao.getDiaPrevistoDevolucao());
		System.out.println("Dia Devolu��o: " + this.locacao.getDiaDevolucao());
		System.out.println("Valor do Filme: R$" + this.preco);
		System.out.println("Valor da Multa: R$" + this.locacao.getValorMulta());
		System.out.println("Valor Total da Loca��o: R$" + this.locacao.getValorLocacao());
		System.out.println("=======================================");
	}

}
