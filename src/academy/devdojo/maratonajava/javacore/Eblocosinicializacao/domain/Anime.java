package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name, int[] episodes) {

        this.name = name;
        this.episodes = episodes;


    }


    public Anime() {

        for (int episode : this.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
// REVIEWWWWWWWWWWWWWWWWWWWWWWD