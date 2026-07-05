package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player p1 = new Player("Roberto Carlos");
        Team t1 = new Team("Real Madri gitd");

        p1.setTeam(t1);
    }
}
