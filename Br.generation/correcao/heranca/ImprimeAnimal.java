package Correcao.heranca;

public class ImprimeAnimal extends Animal {

	public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
		
		ta.somAnimal(new Cavalo());
		ta.correr(new Cavalo());
		
		ta.somAnimal(new Cachorro());
		ta.subir(new Preguiça());

	}

}