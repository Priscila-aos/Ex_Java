package lista03_repeticao;

import java.util.Scanner;

/*
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

public class Ex_06 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int num =0, soma = 0, contagem = 0, media = 0;
		
     do { System.out.println("Infome um n�mero: ");
     num = leia.nextInt();
     
     if (num % 3 == 0 && num !=0 ) {
     soma += num;
     contagem++;
     }
    	   
     } while (num !=0);
     
     media = soma / contagem;
     System.out.println("Sua m�dia �: " + media);
     
     leia.close();
     	
     
	}

}
