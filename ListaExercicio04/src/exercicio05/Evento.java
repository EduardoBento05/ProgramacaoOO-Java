package exercicio05;

public class Evento {
	
	private String nomeEvento;
	
	private Artista artista;
	
	private String data;
	
	private Local local;
	
	private String classificacaoEtaria;
	
	private int ingressos;
	
	public Evento(String nomeEvento, Artista artista, String data, Local local, String classificacaoEtaria,
			int ingressos) {
		this.nomeEvento = nomeEvento;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.classificacaoEtaria = classificacaoEtaria;
		this.ingressos = ingressos;
	}
	
	public void venderIngressos(int valor) {
		
		
		if (valor <= this.ingressos) {
			this.ingressos = this.ingressos - valor;
			System.out.println("Venda de Ingressos Realizada com Sucesso");
		}else {
			System.out.println("Número Insuficiente de Ingressos");
		}
		
	}
	
	public void imprimirDados() {
		System.out.println("$$$$$$$$$$$$$$$$ Evento $$$$$$$$$$$$$$$$");
		System.out.println("Nome do Evento: " + this.nomeEvento);
		System.out.println("Data do Evento: " + this.data);
		System.out.println("Classificação Etária: " + this.classificacaoEtaria);
		System.out.println("Ingressos Disponíveis: " + this.ingressos);
		System.out.println("$$$$$$$$$$$$$$$$ Local $$$$$$$$$$$$$$$$");
		System.out.println("Nome do Local: " + this.local.getNomeLocal());
		System.out.println("Capacidade Máxima: " + this.local.getCapacidadeMaxima());
		System.out.println("Logradouro: " + this.local.getEndereco().getLogradouro());
		System.out.println("Numero: " + this.local.getEndereco().getNumero());
		System.out.println("Bairro: " + this.local.getEndereco().getBairro());
		System.out.println("Cidade: " + this.local.getEndereco().getCidade());
		System.out.println("Estado: " + this.local.getEndereco().getEstado());
		System.out.println("$$$$$$$$$$$$$$$$ Artista $$$$$$$$$$$$$$$$");
		System.out.println("Nome do Artista: " + this.artista.getNomeArtista());
		System.out.println("Nacionalidade do Artista: " + this.artista.getNacionalidadeArtista());
		System.out.println("Biografia do Artista: " + this.artista.getBiografiaArtista());
		
	}

	
	
	

}
