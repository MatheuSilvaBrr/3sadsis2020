package aula20200615.analiseDiscurso;

import java.util.Calendar;

import aula20200518.conjuntos.Cor;

public class App {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 20);
		calendar.set(Calendar.YEAR, 20001);
		calendar.set(Calendar.MONTH, 8);
		
		Endereco endereco = new Endereco("Rua Euclides da Cunha", 0000, "Colégio", "Ouro verde", "Sarandi", "Paraná");
		
		Aluno matheus = new Aluno("Matheus ", "Silva", calendar, endereco, "19310522");
		Contrato contrato = new Contrato(matheus, Situacao.REGULAR);
		
		Avalista maeMaAvalista = new Avalista("Solange", "Silva", calendar, endereco);
		contrato.adicionarAvalista(maeMaAvalista);
		
		matheus.setContrato(contrato);
		
		Coordenador marcelo = new Coordenador("Marcelo", "Erick", calendar, endereco);
		
		Curso curso = new Curso("Analise e desenvolvimento de sistemas", 00001);
		curso.setCoordenador(marcelo);
		
		Turma turma = new Turma("ADSIS", 00001);
		curso.adicionarTurmas(turma);
		
		turma.adicionarAluno(matheus);
		turma.adicionarLider(matheus);
		
		System.out.println(curso);
		System.out.println(turma);
		
		
	}

}
