package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.WorkersData;

public class Anime {

    private String name;
    private String genre;
    private String type;
    private int episodes;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;

    }

    public void init(String name, String type, int episodes, String genre) {
        this.init(name, type, episodes);
        this.genre = genre;

    }


    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}


