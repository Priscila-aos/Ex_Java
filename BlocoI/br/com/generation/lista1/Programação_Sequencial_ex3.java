	package br.com.generation.lista1;

	import java.util.Scanner;

	public class Programação_Sequencial_ex3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os segundos: ");
			int segundos = leia.nextInt();
			
		int minutos = segundos / 60;
		int restoSegundos = segundos % 60;
		int horas = minutos / 60;
		int restoMinutos = minutos % 60;
		
		System.out.println("Duração total: "+ horas +" horas, "+restoMinutos+"  minutos e "
				+restoSegundos+ " segundos.");
		
		leia.close();
}
}
