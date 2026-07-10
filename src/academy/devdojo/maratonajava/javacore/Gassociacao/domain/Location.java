package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Location {
    private String location;
    private Seminary seminary;

    public Location(String location) {
        this.location = location;
    }

    public Location(String location, Seminary seminary) {
        this.location = location;
        this.seminary = seminary;
    }

    public void print() {
        System.out.println("Endereço : " + this.location);
        if (seminary == null) return;
        System.out.println("Seminario localizado : " + seminary.getTitle());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Seminary getSeminary() {
        return seminary;
    }

    public void setSeminary(Seminary seminary) {
        this.seminary = seminary;
    }
}
