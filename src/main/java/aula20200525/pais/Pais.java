package aula20200525.pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nome;
	private Integer codigoDDD;
	private List<Estado> estados;
	
	public Pais(String nome, Integer codigoDDD) {
		this.nome = nome;
		this.codigoDDD = codigoDDD;
		estados = new ArrayList<Estado>();
	}

	public String getNome() {
		return nome;
	}

	public Integer getCodigoDDD() {
		return codigoDDD;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void addEstado(Estado estado) {
		this.estados.add(estado);
	}
	
	public int contarEstados() {
		int contador = 0;
		for (Estado estado : estados) {
			contador++;
		}
		
		return contador;
	}
	
	
	
	
	
}
