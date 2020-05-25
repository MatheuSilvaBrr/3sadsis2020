package aula20200525.pais;

public class AppPais {
	
	public static void main(String[] args) {
		Pais brasil = new Pais("Brasil", 55);
		
		Estado parana = new Estado("Paraná", "PR", 41);
		Estado saopaulo = new Estado("São Paulo", "SP", 11);
		Estado santacatarina = new Estado("Santa Catarina", "SC", 48);
		
		brasil.addEstado(santacatarina);
		brasil.addEstado(saopaulo);
		brasil.addEstado(parana);
		
		
		System.out.println(brasil.getEstados());
		System.out.println(brasil.contarEstados());
	}
}

