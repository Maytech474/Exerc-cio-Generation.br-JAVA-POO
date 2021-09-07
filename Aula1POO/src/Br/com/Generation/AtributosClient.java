package Br.com.Generation;


public class AtributosClient {

	public static void main(String[] args) {
	
	Cliente cliente1 = new Cliente();
	Cliente cliente2 = new Cliente();
		
	cliente1.setNome("Maicon");
	cliente1.setPeso(79.0);
	cliente1.setAltura(1.70);
	cliente1.setRG("xxx.xxx.xxx.xx");
	
	cliente2.setNome("Fulano");
	cliente2.setPeso(45.00);
	cliente2.setAltura(1.32);
	cliente2.setRG("xxx.xxx.xxx.xx");
	
	System.out.println(" |Clientes| \n");
	System.out.println("Nome do Cliente: " + cliente1.getNome());
	System.out.println("Peso do Cliente: " + cliente1.getPeso());
	System.out.println("Altura do Cliente: " + cliente1.getAltura());
	System.out.println("RG: " + cliente1.getRG());
	
	
	System.out.println("\n");
	System.out.println("Nome do Cliente: " + cliente2.getNome());
	System.out.println("Peso do Cliente: " + cliente2.getPeso());
	System.out.println("Altura do Cliente: " + cliente2.getAltura());
	System.out.println("RG: " + cliente2.getRG());

}
}