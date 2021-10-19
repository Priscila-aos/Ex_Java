package jokengen.challenges.abilities;

import jokengen.Player;
import jokengen.challenges.Challenge;

import java.util.Scanner;

public class Abilities extends Challenge {

    private final Scanner scanner = new Scanner(System.in);

    public Abilities(String name, Player player) {
        super(name, player);
    }

    public void question(){
        System.out.println("Vamos agora testar suas soft skills... Analise a seguinte situação:");
        System.out.println("Jeff estava louco para curtir uma praia bebendo sua Heineken nesse feriadão, " +
                "\nporém ficou encarregado de revisar o projeto do seu grupo para tentar encontrar possíveis " +
                "erros e então resolvê-los, \nmas Jeff estava com muita pressa e nenhuma paciência então fez " +
                "uma revisão bem rápida e entregou o projeto com alguns erros sem ter percebido.\n");

        System.out.println("Quais das habilidades que se encaixaria melhor para resolver problema dessa situação?  \n\n(a) Trabalho em equipe. \n(b) Atenção aos detalhes. \n(c) Proatividade. \n(d) Comunicação.");
        System.out.print("\nDigite sua resposta: ");
        String resposta = scanner.next();

        if(resposta.equalsIgnoreCase("b")) {
            System.out.println("\nOlha só, uma vez na vida acertando.");
            super.getPlayer().addPoints(4);
        }

        else {
            System.out.println("\nResposta incorreta, aprendendo hoje para errar amanhã. Força campeão.");
        }
    }
}
