package exercicio03;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora("HP","HP-450","Científica",400);
		
		calculadora.somar(2, 4);
		calculadora.subtrair(4, 2);
		calculadora.multiplicacao(5, 3);
		calculadora.divisao(15, 3);
		calculadora.emitirRelatorio();
		
	}

}
