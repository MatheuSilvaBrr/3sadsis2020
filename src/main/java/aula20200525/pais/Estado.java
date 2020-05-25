package aula20200525.pais;

public class Estado {
	
	private String nome;
	private String sigla;
	private Integer codigoDDD;
	
	public Estado(String nome, String sigla, Integer codigoDDD) {
		this.nome = nome;
		this.sigla = sigla;
		this.codigoDDD = codigoDDD;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public Integer getCodigoDDD() {
		return codigoDDD;
	}

	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", sigla=" + sigla + ", codigoDDD=" + codigoDDD + "]";
	}
	
	
	
	
	
}
