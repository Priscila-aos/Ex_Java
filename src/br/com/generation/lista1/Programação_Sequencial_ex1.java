package br.com.generation.lista1;

/*
 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
 */

	import java.util.*;
	public class Programa��o_Sequencial_ex1  {

	public static void main(String[] args) {
		
		int dias, meses, anos, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o dia em que voc� nasceu: ");
		dias = leia.nextInt();
	
		System.out.println("Digite o m�s em que voc� nasceu: ");
		meses = leia.nextInt();
	
		System.out.println("Digite o ano em que voc� nasceu: ");
		anos = leia.nextInt();
	
		resultado = dias + (meses * 30) + ((2021 - anos)* 365);
		
		System.out.println("O total de dias vividos �: " + resultado);
		
		leia.close();

	}

}
