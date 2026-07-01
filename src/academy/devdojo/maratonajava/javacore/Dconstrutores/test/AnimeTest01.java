package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 150, "Action", "Toei");
        Anime anime2 = new Anime("Jujutsu Kaizen", "TV", 100, "Sci-fi");
        Anime anime3 = new Anime();
        anime.print();
        anime2.print();

    }
}
