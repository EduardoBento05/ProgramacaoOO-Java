package exercicio04;

public class LocacaoTeste {
	
	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Vicente Machado", 512, "Centro", 84100000, "Ponta Grossa", "Paraná");
		Cliente cliente1 = new Socio("João da Silva", "10/08/1998", "9988-7766", endereco1, "111.222.333-44");
		
		Endereco endereco2 = new Endereco("Balduíno Taques", 256, "Centro", 84987000, "Ponta Grossa", "Paraná");
		Cliente cliente2 = new Socio("Maria de Oliveira", "25/03/1995", "9119-5566", endereco2, "999.888.777-66");
		
		Filme filme1 = new Filme("Velozes e Furiosos", 120, 5.00);
		Filme filme2 = new Filme("Batman", 150, 7.00);
		
		filme2.locarFilme(cliente1, 10);
		filme2.locarFilme(cliente2, 10);
		
		filme2.devolverFilme(15);
		
		filme2.locarFilme(cliente2, 16);
		
	}

}
