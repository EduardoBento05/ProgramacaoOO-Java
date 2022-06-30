package exercicio02;

public class Imovel {
	
	protected Endereco endereco;
	
	protected double valorBase;
	
	
	public Imovel(String logradouro,int numero,String bairro,String cidade,String estado, double valorBase) {
		this.endereco = new Endereco(logradouro,numero,bairro,cidade,estado);
		this.valorBase = valorBase;
	}


	public double getValorBase() {
		return valorBase;
	}


	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	
	
	public void imprimirDados() {
		System.out.println("Valor Base: " + this.valorBase);
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Estado: " + this.endereco.getEstado());
	}

	
	
	
	

}
