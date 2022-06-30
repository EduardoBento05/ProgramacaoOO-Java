package exercicio02;

public class BibliotecaTeste {
	
	public static void main(String[] args) {
		
		Biblioteca livro1 = new Biblioteca();
		
		
		livro1.adicionarNovoLivro("Livro1","Jose",2022,"editora1",256);
		
		livro1.verificarDisponibilidade("Livro1");
		
		livro1.imprimirLivros("Livro1");
		
		livro1.emprestarLivro("Livro1", 5);
		livro1.emprestarLivro("Livro1", 2);
		
		livro1.devolverLivro("Livro1", 13);
		livro1.devolverLivro("Livro1", 2);
		
		
		
	}

}
