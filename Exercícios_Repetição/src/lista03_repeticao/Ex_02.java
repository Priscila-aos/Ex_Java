package lista03_repeticao;

import java.util.Scanner;

//2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

public class Ex_02 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
		int num = 0, contador=0;
			
		for(num = 0; num < 10; num++) {
		System.out.println("Digite um número: ");
		contador = ler.nextInt();
					
	    if (contador % 2 == 0) {
	    System.out.println(num+1 + "° valor:" + " Par = " + contador);
	    }
		
	    else {
	    System.out.println(num+1 + "° valor:" + " Impar = " + contador);{	
	    }
	    ler.close();
	    }	
		}
	}
}
