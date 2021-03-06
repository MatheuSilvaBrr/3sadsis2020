package aula20200522.turmas;

import java.util.ArrayList;

public class Turma {
	private String código;
	
	private Aluno lider;
	
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	
	public Turma(String código) {
		this.código = código;
	}
	
	public String getCódigo() {
		return código;
	}
	
	public void adicionarAluno(Aluno a) {
		this.alunos.add(a);
	}
	public ArrayList<Aluno> getAlunos() {
		return this.alunos;
	}
	public void setLider(Aluno a) {
		this.lider = a;
	}
	public Aluno getLider() {
		return this.lider;
	}
}
