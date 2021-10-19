package jokengen.challenges.jokenpo;

import jokengen.Player;
import jokengen.challenges.Challenge;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Jokenpo extends Challenge {

    private int computerScore = 0;
    private int rodadas = 3;
    private final Scanner scanner = new Scanner(System.in);

    public Jokenpo(String name, Player player) {
        super(name, player);
    }

    private enum jokenpoOptions {
        PEDRA(), PAPEL(), TESOURA();

        jokenpoOptions(){
        }
    }

    private List<String> jokenpoOptions(){
        return Stream.of(jokenpoOptions.values()).map(Enum::name).collect(Collectors.toList());
    }

    private String computerChoice(){
        return jokenpoOptions.values()[new Random().nextInt(3)].toString();
    }

    public void winGame(){
        if(super.getPlayer().getTotalPoints() > this.computerScore){
            System.out.println("\nParabéns, você ganhou essa rodada. Vamos ver como se sai na próxima ;)");
        } else {
            System.out.println("\nQue peninha! Começou perdendo, mas quem sabe na próxima rodada melhora.");
        }
    }

    private void minusRound() throws Exception {
        if(this.rodadas - 1 < 0){
            throw new Exception("Jokenpo max rounds reached");
        }
        this.rodadas--;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void jokenpoGame() throws Exception {
        if(this.rodadas == 3){
            System.out.println("""
                Você conhece Jokenpô?
                O famoso pedra, papel e tesoura, será que você tem sorte?
                """);

            List<String> options = jokenpoOptions();
            for(int i = 0; i < options.size(); i++){
                System.out.println(options.get(i));
            }
        }
        System.out.print("\nFaça sua escolha: ");
        String playerChoice = scanner.next();

        if((playerChoice.equalsIgnoreCase("pedra")) ||
                (playerChoice.equalsIgnoreCase("tesoura")) ||
        playerChoice.equalsIgnoreCase("papel")){
            jokenpoLogic(playerChoice);
        } else {
            throw new IllegalArgumentException("Espertinho perde cedo.");
        }
    }

    private void printGameMoves(String playerChoice, String computerChoice){
        System.out.println("O computador jogou: " + computerChoice.toUpperCase());
        System.out.println("E você jogou: "+ playerChoice.toUpperCase());
    }

    private void jokenpoLogic(String playerChoice) throws Exception {
        String computerChoice = computerChoice();
        minusRound();
        if (playerChoice.equalsIgnoreCase(computerChoice.toString())) {
            printGameMoves(playerChoice, computerChoice);
            System.out.println("\nEmpate! Melhor que perder, não é mesmo?");
        }
        else {
            if ((playerChoice.equalsIgnoreCase("pedra")) &&
                    (computerChoice.equalsIgnoreCase("tesoura")) ||
                    (playerChoice.equalsIgnoreCase("papel")) &&
                            (computerChoice.equalsIgnoreCase("pedra"))||
                    (playerChoice.equalsIgnoreCase("tesoura"))
                            && (computerChoice.equalsIgnoreCase("papel"))){
                super.getPlayer().addPoints(1);
                printGameMoves(playerChoice, computerChoice);
                System.out.println("\nPelo menos uma vez na vida a gente tem que ganhar, nénon?");
            }
            else {
                this.computerScore++;
                printGameMoves(playerChoice, computerChoice);
                System.out.println("\nA derrota de hoje foi certa, mas e a de amanhã?");
                System.out.println("Também");
            }
        }
    }
}
