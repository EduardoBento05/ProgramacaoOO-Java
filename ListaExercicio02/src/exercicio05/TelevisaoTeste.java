package exercicio05;

public class TelevisaoTeste {
	
	public static void main(String[] args) {
		
		Televisao tv = new Televisao("LG",30.7,"4k-Full-HD");
		
		tv.emitirRelatorio();
		tv.ligar();
		tv.ligar();
		tv.desligar();
		tv.desligar();
		tv.ligar();
		tv.alterarCanalBaixo();
		tv.emitirRelatorio();
		tv.abaixarVolume();
		tv.emitirRelatorio();
		tv.alterarCanalCima();
		tv.emitirRelatorio();
		tv.alterarCanalCima();
		tv.alterarCanalCima();
		tv.emitirRelatorio();
		tv.alterarCanalCima();
		tv.emitirRelatorio();
		tv.alterarCanalCima();
		tv.emitirRelatorio();
		tv.abaixarVolume();
		tv.emitirRelatorio();
	}

}
