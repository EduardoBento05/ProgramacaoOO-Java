package exercicio04;

public class Data {
		
		protected int dia;
		
		protected int mes;
		
		protected int ano;
		
		public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
		
		public Data(int mes, int ano) {
			this(1,mes,ano);
		}
		
		
		public Data(int dia) {
			this(dia,01,2019);
		}
		
		public Data() {
			this(01,01,2019);
		}

		@Override
		public String toString() {
			return "Data [dia=" + dia + ", /mes=" + mes + ", /ano=" + ano + "]";
		}
		
		
		

}
