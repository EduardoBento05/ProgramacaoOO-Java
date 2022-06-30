package exercicio02;

public class Livro {
		
	
	private String titulo;
	
	private String autor;
	
	private int anoPublicacao;
	
	private String editora;
	
	private int totalPaginas;
	
	private boolean disponibilidade;
	
	private int dias;

	public Livro(String titulo, String autor, int anoPublicacao, String editora, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.totalPaginas = totalPaginas;
		this.disponibilidade = true;
		this.dias = 0;
	}
	
	
	public void emprestarLivro(int dia) {
		
		if(this.disponibilidade == true) {
			this.disponibilidade = false;
			this.dias = dia;
			System.out.println("Livro: " + this.titulo + " Empréstimo Efetuado com Sucesso");
			System.out.println("Dia do Emprestimo: " + dia);
		}else {
			System.out.println("Livro: " + this.titulo + " Indisponivel para Empréstimo");
		}
		
		
	}
	
	
	public void devolverLivro(int dia) {
		
		if(this.disponibilidade == false) {
				this.disponibilidade = true;
				System.out.println("O Livro: " + this.titulo + " está sendo devolvido");
				int multa = dia - this.dias;
			
				if(multa >= 0 && multa < 7) {
					System.out.println("Livro: " + this.titulo + " Devolvido com Sucesso e sem Multa");
				}
				else if(multa >= 7) {
					System.out.println("Livro: " + this.titulo + " Está em atraso");
					System.out.println("Valor da Multa: " + (multa - 7) * 1.50 + " reais");
				}
		}else {
			verificarDisponibilidade();
		}
		
	}
	
	public void verificarDisponibilidade() {
		
		
			if( this.disponibilidade == true) {
				System.out.println("Livro: " + this.titulo + " Disponível na Biblioteca");
			}else {
				System.out.println("Livro: " + this.titulo + " Indisponivel na Biblioteca,logo para Empréstimo");
			}
		
		
		
	}
	
	public void exibirDados() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de Publicação: " + this.anoPublicacao);
		System.out.println("Editora: " + this.editora);
		System.out.println("Total de Páginas: " + +this.totalPaginas);
		System.out.println("Disponibilidade: " + this.disponibilidade);
	}


	public String getTitulo() {
		return titulo;
	}
	
	
	
	
}
