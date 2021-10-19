package jokengen;

import jokengen.challenges.abilities.Abilities;
import jokengen.challenges.findTheError.FindTheError;
import jokengen.challenges.jokenpo.Jokenpo;

import java.util.Scanner;

public class Game {

    private final Player player;

    public Game() throws Exception {
        player = new Player(welcomeScreen());
        String delimiter = "-".repeat(20);
        startJokenpo(player);
        System.out.println(delimiter);
        abilities(player);
        System.out.println(delimiter);
        findTheError(player);
        System.out.println(delimiter);
    }

    private void playerGrade(){
        System.out.println("E aqui chegamos ao final do Jokengen sua pontuação foi " + player.getTotalPoints());
    }

    private String welcomeScreen(){
        System.out.println("""
                Caros alunes, aqueles que estão dentro deste novo programa JOKENGEN devem estar com\s
                bastante dificuldades com as aulas ou então perdeu muito conteúdo, felizmente poderão recuperar\s
                o tempo perdido através desta mega gincana e assim continuar com o nosso programa, boa sorte
                """);
        System.out.print("Insira seu nome: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private void startJokenpo(Player player) throws Exception {
        Jokenpo jokenpo = new Jokenpo("Jokenpo", player);
        while(jokenpo.getRodadas() > 0){
            jokenpo.jokenpoGame();
        }
        jokenpo.winGame();
    }

    private void findTheError(Player player){
        FindTheError fe = new FindTheError("Encontre o erro", player);
        fe.introduction();
        fe.questionOne();
        fe.questionTwo();
        fe.questionThree();
    }

    private void abilities(Player player){
        Abilities abilities = new Abilities("Soft Skills",player);
        abilities.question();
    }

}
