package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player p1 = new Player("Roberto Carlos");
        Player p2 = new Player("Ronaldo");
        Team t1 = new Team("Real Madrid");

        Player[] ps = {p1,p2};

        p1.setTeam(t1);
        t1.setPlayers(ps);

        System.out.println("Definindo o time do jogador");
        p1.print();

        System.out.println("definindo os jogadores do time");
        t1.print();
    }

}
