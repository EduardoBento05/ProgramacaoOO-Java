package exercicio04;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		Tratamento tratamento = new Tratamento("Problema no Est�mago","2/06/2022");
		
		Animal animal = new Animal("Bruce",6,"Masculino",469962398,"Eduardo de Almeida Bento Dias",1532051434,"eduardo_bd29@hotmail.com"
				,"Rua Helena Dal Pozzo Bertin",424,"Jardim S�o Paulo","Tatu�","S�o Paulo",tratamento);
		
		animal.emitirRelatorio();
		
	}

}
