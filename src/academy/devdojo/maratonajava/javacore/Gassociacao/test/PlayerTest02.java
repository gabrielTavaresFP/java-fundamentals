package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player p1 = new Player("Endrick");

        Team t1 = new Team("Lyon");

        p1.setTeam(t1);
        p1.print();
    }
}
