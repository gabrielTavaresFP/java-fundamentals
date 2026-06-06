package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public Anime() {
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
        episodes[i] = i+1;
        }

        for (int num : this.episodes) {
            System.out.print(num + " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
