/* 
 	4)Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. 
	Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
	
	package Exercicios_LaçosCondicionais;
	import javax.swing.JOptionPane;
	public class Exercicio_04 {

		public static void main(String[] args) {
			
			double num;
				
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu numero"));
				
			if (num % 2 == 0 ) {
				JOptionPane.showMessageDialog(null, "O numero informado é par e a sua raiz quadrada é: "
				+ Math.sqrt(num), "AVISO", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
			else {
				JOptionPane.showMessageDialog(null, "O número informado é impar e, elevado ao quadrado é: "+ Math.pow(num, 2.0), "AVISO", 
				JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
		}
	}
