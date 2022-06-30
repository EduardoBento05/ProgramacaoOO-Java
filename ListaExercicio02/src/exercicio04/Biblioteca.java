package exercicio04;

public class Biblioteca {

	private String titulo;

	private String autor;

	private String editora;

	private int npaginas;

	private int anoPublicacao;

	private boolean situacao;

	public Biblioteca(String titulo, String autor, String editora, int npaginas, int anoPublicacao, String situacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.npaginas = npaginas;
		this.anoPublicacao = anoPublicacao;
		this.situacao = true;
	}
	
	public void emprestar() {
		
		if(true == this.situacao) {
			System.out.println(" Empr�stimo Realizado com Sucesso.");
			this.situacao = false;
		}else {
			System.out.println(" Livro Indispon�vel no momento.");
		}
	}
	
	public void devolver() {
		
		if(false == this.situacao) {
			System.out.println(" Devolu��o Realizada Com sucesso");
			this.situacao = true;
		}else {
			System.out.println(" Livro est� na Biblioteca");
		}
	}
	

	
	public void emitirRelatorio() {
		System.out.println(this.titulo + ", " + this.autor + ", " + this.npaginas + " p�ginas," + this.anoPublicacao + ", " + this.situacao + "");
	}

}
