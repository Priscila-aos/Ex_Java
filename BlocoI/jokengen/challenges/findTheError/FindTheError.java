package jokengen.challenges.findTheError;

import jokengen.Player;
import jokengen.challenges.Challenge;

import java.util.Scanner;

public class FindTheError extends Challenge {

    private final Scanner scanner = new Scanner(System.in);

    public FindTheError(String name, Player player) {
        super(name, player);
    }

    private String getAnswer(){
        return scanner.next();
    }

    public void introduction(){
        System.out.println("*** Parab�ns participante do jokenGen *** "
                + "\nAgora voc� est� na terceira fase do jogo\n");
    }

    public void questionOne(){
        System.out.println("Questão 1 - Criando uma variável numérica");
        System.out.println(
                "Selecione a opção que mostra como podemos criar e definir o  valor de uma variável para representar a quantidade de dias de um mês?\n"
                        +"\n(a) int Dias;" + "\nDias => 31;\n"
                        +"\n(b) diasDoMes;" + "\ndiasDoMes = 30;\n"
                        +"\n(c) int diasDoMes;" + "\ndiasDoMes = 30;\n"
                        +"\n(d) int diasDoMes" + "\ndiasDoMes = 30\n");
        verifyQuestionOne(getAnswer());
    }

    private void verifyQuestionOne(String answer){
        if (answer.equalsIgnoreCase("c")) {
            super.getPlayer().addPoints(1);
            System.out.println("Resposta Correta! " + "você ganhou 1 ponto");
        }
        if(answer.equalsIgnoreCase("a")) {
            System.out.println("// Errado, para definir ou atribuir um valor a variável no java precisamos usar\r\n"
                    + "		'=' ao invés de '=>' como no exemplo. O nome da variável 'Dias' não dá erro\r\n"
                    + "		 no compilador, mas temos que lembrar que não é a convenção da comunidade\r\n"
                    + "		 Java. Variáveis normalmente são iniciadas com letras minúsculas.\r\n"
                    + "		");
        }

        if (answer.equalsIgnoreCase("C")) {
            System.out.println("Errado, no java, por ser uma linguagem estaticamente tipada é necessário definir o tipo das variáveis. Faltou dizer que o tipo é int.");
        }
        if (answer.equalsIgnoreCase("D")) {
            System.out.println("Errado, faltou o ponto e vírgula neste caso");
        }
    }

    public void questionTwo(){
        System.out.println("\nQuestão 2");
        System.out.println(
                "Paulo Passivo, fez um código para somar dois valores quaisquer." + "\n\nString parcela1 = \"10\";"
                        + "\nString parcela2 = \"20\";" + "\nSystem.out.println(parcela1 + parcela2);\n "
                        + "\nPaulo terá o resultado esperado (30) com este trecho de código?"
                        + "\n(a) Sim, o resultado será 30."
                        + "\n(b) Sim, porém o resultado será \"30\" e não 30."
                        + "\n(c) Não, pois não podemos utilizar o sinal + neste caso."
                        + "\n(d) Não, o resultado será 1020.\n");
        verifyQuestionTwo(getAnswer());

    }

    private void verifyQuestionTwo(String answer){
        if(answer.equalsIgnoreCase("a")) {
            System.out.println("Errado, veja que ele declarou como String, então o resultado será concatenado.");
        }

        if(answer.equalsIgnoreCase("B")) {
            System.out.println("Errado, veja que ele declarou como String, então o resultado será concatenado.");
        }

        if(answer.equalsIgnoreCase("C")) {
            System.out.println("Não será 30 porém podemos usar o sinal + para concatenar.");
        }

        if(answer.equalsIgnoreCase("D")) {
            super.getPlayer().addPoints(1);
            System.out.println("Resposta Correta! " + "você ganhou 1 ponto");
            System.out.println("Correto. O resultado será a concatenação das duas parcelas. \n");
        }
    }

    public void questionThree(){
        System.out.println("\nQuestão 3 - Fixando o comando break");
        System.out.println(
                "Léo está em dúvida sobre o modo como o break funciona quando utilizado dentro de laços de repetição."
                        + "\nEscolha a opção que descreve exatamente o funcionamento desse comando nessas situações.\n\n ");
        System.out.println("\n(a) Finaliza a execução do programa no momento em que é chamado."
                + "\n(b) Para a execução do laço mais interno que contém o comando break e continua executando os laços mais externos."
                + "\n(c) Para a execução de todos os laços de repetição aninhados que o contém e continua normalmente o programa.");
        verifyQuestionThree(getAnswer());

    }

    private void verifyQuestionThree(String answer){
        if(answer.equalsIgnoreCase("A")) {
            System.out.println("Errado… O break não interrompe todo o programa, apenas o mais interno que o contém.");
        }

        if(answer.equalsIgnoreCase("B")) {
            super.getPlayer().addPoints(1);
            System.out.println("Resposta Correta! " + "você ganhou 1 ponto");
            System.out.println("Muito bem! O break irá interromper apenas o laço de repetição mais interno que o contém.");
        }
        ;
        if(answer.equalsIgnoreCase("C")){
            System.out.println("Errado… O break não interrompe todos os laços de repetição, apenas o mais interno que o contém.");
        }
    }

}
