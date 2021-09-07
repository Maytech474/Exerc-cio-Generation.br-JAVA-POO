package Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		//Criar Objetos
		carro meuCarro = new carro();
		carro meuCarro1= new carro();
		carro meuCarro2= new carro();
		
		//Instanciar todos os atributos
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "Corsa";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		// Chamar métodos
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
		
		
		
        //Instanciar todos os atributos
		
		meuCarro1.cor = "Azul";
		meuCarro1.modelo = "Gol";
		meuCarro1.velocidadeAtual = 0;
		meuCarro1.velocidadeMaxima = 80;
		
		// Chamar métodos
		meuCarro1.liga();
		meuCarro1.acelera(60);
		System.out.println(meuCarro1.velocidadeAtual);
		meuCarro.pegaMarcha();
		
	
		
		//Instanciar todos os atributos
		meuCarro2.cor = "Preto";
		meuCarro2.modelo = "Porche";
		meuCarro2.velocidadeAtual = 0;
		meuCarro2.velocidadeMaxima = 80;
		
		// Chamar métodos
		meuCarro2.liga();
		meuCarro2.acelera(80);
		System.out.println(meuCarro2.velocidadeAtual);
		meuCarro.pegaMarcha();
		
		
		
        
		
		
	}
	
	
	

}
