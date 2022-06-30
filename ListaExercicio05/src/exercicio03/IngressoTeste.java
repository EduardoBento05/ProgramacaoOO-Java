package exercicio03;



public class IngressoTeste {
	
	public static void main(String[] args) {
	
		IngressoNormal ingresso1 = new IngressoNormal(259.99,"Ingresso normal tipo A");
		
		CamaroteSuperior ingresso2 = new CamaroteSuperior(400,"Ingresso tipo VIP - 1",50,"Camarote Superior");
		
		CamaroteInferior ingresso3 = new CamaroteInferior(400,"Ingresso Tipo VIP = 2",100,"Camarote Inferior");
		
		
		ingresso1.imprimirDadosIngresso();
		ingresso2.imprimirDadosIngresso();
		ingresso3.imprimirDadosIngresso();
		
	}

}
