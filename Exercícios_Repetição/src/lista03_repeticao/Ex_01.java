package lista03_repeticao;

/*	1-Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/

public class Ex_01 {

	public static void main(String[] args) {
		
		 int valor, contador = 0;
			 
		 for(valor = 1000; valor <= 1999; valor ++) {
		 contador ++;
				 
		 if (valor % 11 == 5) {
		 System.out.println( contador + "°" + " Valor: " + valor);	  	 
		 }			 
		
		 }
		 
	 }
 }
