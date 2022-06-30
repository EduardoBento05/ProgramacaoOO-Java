package exercicio04;

public class DataTeste {
	
	public static void main(String[] args) {
		
		
		Feriado data1 = new Feriado(01, 05, 2022, "Feriado");
		System.out.println(data1);
		
		Feriado data2 = new Feriado("Domingo");
		System.out.println(data2);
		
		Feriado data3 = new Feriado();
		System.out.println(data3);
		
		
		
	}

}
