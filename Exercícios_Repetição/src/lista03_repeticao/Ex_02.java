package lista03_repeticao;

import java.util.Scanner;

//2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class Ex_02 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
		int num = 0, contador=0;
			
		for(num = 0; num < 10; num++) {
		System.out.println("Digite um n�mero: ");
		contador = ler.nextInt();
					
	    if (contador % 2 == 0) {
	    System.out.println(num+1 + "� valor:" + " Par = " + contador);
	    }
		
	    else {
	    System.out.println(num+1 + "� valor:" + " Impar = " + contador);{	
	    }
	    ler.close();
	    }	
		}
	}
}
