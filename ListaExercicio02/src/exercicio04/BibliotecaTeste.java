package exercicio04;

public class BibliotecaTeste {
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca1 = new Biblioteca("Java - Como Programar","Paul Deitel","Editora Pearson",968,2016,"Dispon�vel para Empr�stimo");
		
		biblioteca1.emitirRelatorio();
		biblioteca1.emprestar();
		biblioteca1.emprestar();
		biblioteca1.emitirRelatorio();
		biblioteca1.devolver();
		biblioteca1.devolver();
		biblioteca1.emitirRelatorio();
		biblioteca1.emprestar();
		biblioteca1.devolver();
	}

}
