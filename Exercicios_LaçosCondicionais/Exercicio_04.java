/* 
 	4)Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. 
	Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
	
	package Exercicios_La�osCondicionais;
	import javax.swing.JOptionPane;
	public class Exercicio_04 {

		public static void main(String[] args) {
			
			double num;
				
			num = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu numero"));
				
			if (num % 2 == 0 ) {
				JOptionPane.showMessageDialog(null, "O numero informado � par e a sua raiz quadrada �: "
				+ Math.sqrt(num), "AVISO", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
			else {
				JOptionPane.showMessageDialog(null, "O n�mero informado � impar e, elevado ao quadrado �: "+ Math.pow(num, 2.0), "AVISO", 
				JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
		}
	}
