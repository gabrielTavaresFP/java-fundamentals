package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Attack on Titan",  "TV", 150);
        anime.init("Attack on Titan",  "TV", 150, "Action");

        anime.print();
    }
}
// R