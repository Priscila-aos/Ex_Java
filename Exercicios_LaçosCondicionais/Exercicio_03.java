/*  3)Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
/*	10-14 infantil
	15-17 juvenil
	18-25 adulto*/

	package Exercicios_LaçosCondicionais;
	import java.util.Scanner;
	public class Exercicio_03 {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
				
			int idade;
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			if(idade >=10  && idade <=14) {
				System.out.println("Sua categoria é infantil");
			} else if(idade < 10) {
				System.out.println("Você ainda não tem idade para se matricular");
			}
			else if(idade >=15 && idade <=17) {
				System.out.println("Sua categoria é juvenil");
			} else if(idade >=18 && idade <=25) {
				System.out.println("Sua categoria é adulto");
			} else if(idade > 25) {
				System.out.println("Você não tem idade para se matricular");
			} 
		}		
}
