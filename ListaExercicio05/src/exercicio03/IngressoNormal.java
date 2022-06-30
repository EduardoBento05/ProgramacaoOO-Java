package exercicio03;

public class IngressoNormal extends Ingresso {
		
			
		public IngressoNormal(double valorReais,String tipoIngresso) {
			super(valorReais,tipoIngresso);
		}
		
		
		public void imprimirDadosIngresso() {
			super.imprimirDadosIngresso();
			System.out.println("Ingresso Norma: " + this.valorReais);
		}
			
}
