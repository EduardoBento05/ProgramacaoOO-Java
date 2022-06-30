package exercicio01;

public class Sessao {
	
	
	
	private String data;
	
	private String horario;
	
	private int numeroIngressos;
	
	private Filme filme;
	
	private Sala sala;
	
	public Sessao(String data, String horario, String titulo,int duracao,String numeroIdentificacao,int capMaxima) {
		super();
		this.data = data;
		this.horario = horario;
		this.numeroIngressos = capMaxima;
		this.filme = new Filme(titulo,duracao);
		this.sala = new Sala(numeroIdentificacao,capMaxima);
	}

	
	
	public void venderIngresos(int ingressos) {
		
		
		
		if(ingressos <= this.numeroIngressos) {
			this.numeroIngressos = this.numeroIngressos - ingressos;
			System.out.println("Ingressos Disponiveis " +this.numeroIngressos);
			
		}else {
			System.out.println("Sessão Lotada");
		}
		
		
		
	}
	
	public void imprimirDados() {
		System.out.println("Data do Filme: "+this.data);
		System.out.println("Horario da Sessao: " +this.horario);
		System.out.println("Filme: " +this.filme.getTitulo());
		System.out.println("Duração do Filme: "+this.filme.getDuracao() + " minutos");
		System.out.println("Numero de Identificação da Sala: "+this.sala.getNumeroIdentificao());
		System.out.println("Capacidade Máxima da Sala: " +this.sala.getCapMaxima());
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getHorario() {
		return horario;
	}



	public void setHorario(String horario) {
		this.horario = horario;
	}



	public int getNumeroIngressos() {
		return numeroIngressos;
	}



	public void setNumeroIngressos(int numeroIngressos) {
		this.numeroIngressos = numeroIngressos;
	}



	public Filme getFilme() {
		return filme;
	}



	public void setFilme(Filme filme) {
		this.filme = filme;
	}



	public Sala getSala() {
		return sala;
	}



	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
	

}
