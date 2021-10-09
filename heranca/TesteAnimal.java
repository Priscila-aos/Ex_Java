package br.com.generation.heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Cachorro dog = new Cachorro();
		Cavalo  horse = new Cavalo();
		Preguica preguica = new Preguica();
		
		//Atributos
				
		dog.setNome("Caramelo ");
		dog.setIdade(13);
				
		horse.setNome("Pangar� ");
		horse.setIdade(30);
				
		preguica.setNome("AluneGenetx ");
		preguica.setIdade(20);
				
		System.out.println("O nome do cavalo �: " + horse.getNome());
        System.out.println("A idade do cavalo �: " + horse.getIdade());
        System.out.println("O som que o cavalo faz �: " + horse.emiteSom());
        System.out.println("O cavalo gosta de: " + horse.corre());
        System.out.println();

        System.out.println("O nome do cachorro �: " + dog.getNome());
        System.out.println("A idade do cachorro �: " + dog.getIdade());
        System.out.println("O som que o cachorro faz �: " + dog.emiteSom());
        System.out.println("O cachorro gosta de: " + dog.corre());
        System.out.println();

        System.out.println("O nome da pregui�a �: " + preguica.getNome());
        System.out.println("A idade da pregui�a �: " + preguica.getIdade());
        System.out.println("O som que a pregui�a faz �: " + preguica.emiteSom());
        System.out.println("A pregui gosta de: " + preguica.sobeArvore());
	
	
	}

}
