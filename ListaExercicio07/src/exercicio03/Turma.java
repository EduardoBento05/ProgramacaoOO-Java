package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private List <Alunos> poo;
	
	private String nomeTurma;
	
	private double mediaTurma;
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.mediaTurma = mediaTurma;
		this.poo = new ArrayList<Alunos>();
	}
	
	public void adicionarNovoAluno() {
		
		Alunos aluno1 = new Alunos("Eduardo",1,10.0,10.0,10.0,10.0);
		
		Alunos aluno2 = new Alunos("Lucas",2,10.0,10.0,10.0,10.0);
		
		Alunos aluno3 = new Alunos("Lais",3,10.0,10.0,10.0,10.0);
		
		Alunos aluno4 = new Alunos("Gilberto",4,10.0,10.0,10.0,10.0);
		
		Alunos aluno5 = new Alunos("Silvana",5,10.0,10.0,10.0,10.0);
		
		this.poo.add(aluno1);
		this.poo.add(aluno2);
		this.poo.add(aluno3);
		this.poo.add(aluno4);
		this.poo.add(aluno5);
		
		System.out.println("Aluno:  adicionado com Sucesso");
	}
	
	public void calcularMediaAluno(long ra) {
		boolean verificacao = false;
		
		for (Alunos alunos : poo) {
			
			if(alunos.getRa() == ra) {
				
				alunos.calcularMediaAluno();
				
				verificacao = true;
			}
		}
		
		if(verificacao == false) {
			System.out.println("Aluno Inexistente");
		}
	}
	
	
	public void imprimirDadosAluno(long ra) {
		
		boolean verificacao = false;
		
			for (Alunos alunos : poo) {
				
				if(alunos.getRa() == ra) {
					
					alunos.imprimirDadosAluno();
					
					verificacao = true;
				}
			}
		
			if(verificacao == false) {
				System.out.println("Aluno Inexistente");
			}
	}
	
	
	public void calcularMediaTurma() {
		
		for (Alunos alunos : poo) {
			
		}
		
		
	}
	

}
