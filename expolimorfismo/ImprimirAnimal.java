package br.com.generation.expolimorfismo;

public class ImprimirAnimal {

	public static void main(String[] args) {

	        Cavalo cav1 = new Cavalo();
	        Cachorro cac1 = new Cachorro();
	        Preguica pre1 = new Preguica();
	        Som barulho = new Som();
	        Movimento mover = new Movimento();
	        
	        cac1.setNome("Bethoven");
	        cac1.setIdade(4);

	        cav1.setNome("Pé de Pano");
	        cav1.setIdade(7);

	        pre1.setNome("Cochilo");
	        pre1.setIdade(6);
	        
	        System.out.println("O cachorro chama " + cac1.getNome() + ".");
	        System.out.println("O cachorro tem " + cac1.getIdade() + " anos.");
			barulho.som(new Cachorro());
			mover.movimento(new Cachorro());
	        System.out.println();

	        System.out.println("O cavalo chama " + cav1.getNome() + ".");
	        System.out.println("O cavalo tem " + cav1.getIdade() + " anos.");
			barulho.som(new Cavalo());
			mover.movimento(new Cavalo());
	        System.out.println();

	        System.out.println("A preguiça chama " + pre1.getNome() + ".");
	        System.out.println("A preguiça tem " + pre1.getIdade() + " anos.");
			barulho.som(new Preguica());
			mover.movimento(new Preguica());
			
//			barulho.som(new Animal());
//			mover.movimento(new Animal());
		
		}

}
