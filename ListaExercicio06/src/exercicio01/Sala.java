package exercicio01;

public class Sala {
		
	private String numeroIdentificao;
	
	private int capMaxima;
	
	
	public Sala(String numeroIdentificao, int capMaxima) {
		
		this.numeroIdentificao = numeroIdentificao;
		this.capMaxima = capMaxima;
	}


	public String getNumeroIdentificao() {
		return numeroIdentificao;
	}


	public void setNumeroIdentificao(String numeroIdentificao) {
		this.numeroIdentificao = numeroIdentificao;
	}


	public int getCapMaxima() {
		return capMaxima;
	}


	public void setCapMaxima(int capMaxima) {
		this.capMaxima = capMaxima;
	}

	
	
}
