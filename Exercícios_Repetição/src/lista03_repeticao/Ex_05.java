package lista03_repeticao;

import java.util.Scanner;

/*
 * 	5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE)
 */

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num=0, soma =0;
		
		do { System.out.println("Informe um número ou digite zero para finalizar: ");
		num = leia.nextInt();
		
		soma += num;
					
		} while(num !=0);
		System.out.println("O resultado é: " + soma);
	
		leia.close();
	}
      
}
