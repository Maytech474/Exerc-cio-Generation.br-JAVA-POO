package Aviao;

public class AtributosAviao {

	public static void main(String[] args) {
		
			
			Aviao Model1 = new Aviao();
			Aviao Model2 = new Aviao();
			Aviao Model3 = new Aviao();
				
			Model1.setModelo("Helicóptero");
			Model1.setAno(1979);
			Model1.setCor("Azul");
			Model1.setPeso(1000);
			
			
			Model2.setModelo("Jato");
			Model2.setAno(1959);
			Model2.setCor("Laranja");
			Model2.setPeso(1000);
			
			
			Model3.setModelo("Dirigivel");
			Model3.setAno(1990);
			Model3.setCor("Azul");
			Model3.setPeso(1000);
			
			
			
			System.out.println(" |Aviões| \n");
			System.out.println("Modelo do Avião: " + Model1.getModelo());
			System.out.println("Peso " + Model1.getPeso());
			System.out.println("Cor: " + Model1.getCor());
			System.out.println("Ano: " + Model1.getAno());
			
			System.out.println(" |Aviões| \n");
			System.out.println("Modelo do Avião: " + Model2.getModelo());
			System.out.println("Peso " + Model2.getPeso());
			System.out.println("Cor: " + Model2.getCor());
			System.out.println("Ano: " + Model2.getAno());
			
			System.out.println(" |Aviões| \n");
			System.out.println("Modelo do Avião: " + Model3.getModelo());
			System.out.println("Peso " + Model3.getPeso());
			System.out.println("Cor: " + Model3.getCor());
			System.out.println("Ano: " + Model3.getAno());
			
			
			
			
		
	}

}
