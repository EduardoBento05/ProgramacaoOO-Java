package exercicio05;

public class EventoTeste {
	
	public static void main(String[] args) {
		
		Local local1 = new Local("Black-Bar","Rua Senador Pinheiro Machado",869,"Uvaranas","Ponta Grossa","Paraná",300);
		
		Artista artista1 = new Artista("Ozzy Osbourne","Ingles","Cantor de Rock");
		
		Evento evento = new Evento("Rock in Ponta Grossa",artista1,"3/06/2022",local1,"+18",300);
		
		evento.imprimirDados();
		
		evento.venderIngressos(301);
		evento.venderIngressos(27);
		
		evento.imprimirDados();
		
	}

}
