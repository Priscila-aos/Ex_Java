package lista03_repeticao;

import java.util.Scanner;

/*
 * 	5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num=0, soma =0;
		
		do { System.out.println("Informe um n�mero ou digite zero para finalizar: ");
		num = leia.nextInt();
		
		soma += num;
					
		} while(num !=0);
		System.out.println("O resultado �: " + soma);
	
		leia.close();
	}
      
}
