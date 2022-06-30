package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}

	public void adicionarNovoLivro(String titulo, String autor, int anoPublicacao, String editora, int totalPaginas) {

		Livro livro1 = new Livro(titulo, autor, anoPublicacao, editora, totalPaginas);

		this.livros.add(livro1);

		System.out.println("Livro: " + titulo + " Adicionado com Sucesso");
	}

	public void emprestarLivro(String titulo, int dia) {

		boolean verificacao = false;

		for (Livro livro : livros) {

			if (livro.getTitulo().equals(titulo)) {

				livro.emprestarLivro(dia);
				verificacao = true;
			}

		}

		if (verificacao == false) {
			System.out.println("Livro Inexistente");
		}

	}

	public void devolverLivro(String titulo, int dia) {

		boolean verificacao = false;

		for (Livro livro : livros) {

			if (livro.getTitulo().equals(titulo)) {

				livro.devolverLivro(dia);
				verificacao = true;
			}

		}

		if (verificacao == false) {
			System.out.println("Livro Inexistente");
		}

	}

	public void verificarDisponibilidade(String titulo) {

		boolean verificacao = false;

		for (Livro livro : livros) {

			System.out.println("Livro Existente");
			if (livro.getTitulo().equals(titulo)) {

				livro.verificarDisponibilidade();
				verificacao = true;

			}
		}

		if (verificacao == false) {
			System.out.println("Livro Inexistente");
		}

	}

	public void imprimirLivros(String titulo) {

		boolean verificacao = false;

		for (Livro livro : livros) {

			System.out.println("Livro Existente");
			if (livro.getTitulo().equals(titulo)) {

				livro.exibirDados();
				verificacao = true;

			}
		}

		if (verificacao == false) {
			System.out.println("Livro Inexistente");
		}
	}

}
