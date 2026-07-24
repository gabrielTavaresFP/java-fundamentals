package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double SPEED_CAP = 250;
    public final Comprador  COMPRADOR = new Comprador();

    public void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
