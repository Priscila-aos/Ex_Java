package lista03_repeticao;
/*
 * 4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
 * Para tanto, a cada uma das pessoas era perguntado: 
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.

 */
	import java.util.Scanner;
	
	public class Ex_04 {
		
		public static void main(String[] args) {
		
			
		int pessoas =0, idade, sexo, caracteristica, pessoaCalma = 0, mulheresNervosas = 0;
		int homensAgressivos=0, outrosCalmos=0, pessoas40=0, pessoas18=0;
		Scanner leia = new Scanner(System.in);
		
		while (pessoas < 150) {
			
			System.out.println("Informe sua idade:" );
			idade = leia.nextInt();
			
			System.out.println("Informe seu sexo: (1: Feminio) (2:Masculino) (3:Outros)" );
			sexo = leia.nextInt();
			
		    System.out.println("Informe sua caracteristica: [1- Calma(o)] [2-Nervosa(o)] [3-Agressiva(o)]");
			caracteristica = leia.nextInt();
			
				
			if(caracteristica ==1) {
			pessoaCalma++;	
			}
			if(sexo == 1 && caracteristica ==2) {	
			mulheresNervosas++;
			}
			if(sexo == 2 && caracteristica==3) {
			homensAgressivos++;	
			}
			if(sexo == 3 && caracteristica==1) {
			outrosCalmos++;
			}
			if(caracteristica==2 && idade >= 40) {
			pessoas40++;
			}
			if(caracteristica==1 && idade < 18) {
			pessoas18++;}
			
		    pessoas++;
				    
		    }
		System.out.println("O n�mero de pessoas calmas s�o: " + pessoaCalma);
		System.out.println("O n�mero de mulheres nervosas s�o: " + mulheresNervosas);
		System.out.println("O n�mero de homens agressivos "+ homensAgressivos);
		System.out.println("O n�mero de outros calmos: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: " + pessoas40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos: " + pessoas18);
		
		leia.close();
		

		}
			
	}

	
