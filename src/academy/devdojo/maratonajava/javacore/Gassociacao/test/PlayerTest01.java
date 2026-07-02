package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("A");
        Player p2 = new Player("B");
        Player p3 = new Player("C");
        Player[] ps = {p1,p2,p3};

        for (Player player : ps) {
            player.print();
        }
    }
}
