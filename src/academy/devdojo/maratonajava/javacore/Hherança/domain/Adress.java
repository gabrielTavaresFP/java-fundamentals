package academy.devdojo.maratonajava.javacore.Hherança.domain;

public class Adress {
    private String street;
    private int cep;

    public Adress(String street, int cep) {
        this.street = street;
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
