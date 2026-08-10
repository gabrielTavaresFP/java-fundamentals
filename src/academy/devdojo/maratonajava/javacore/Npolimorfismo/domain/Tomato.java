package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product {
    public final static double TAX_PERCENT = 0.06;

    private String dayExpiration;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculeTaxe() {
        System.out.println("Calculating taxes");
        return this.price * TAX_PERCENT;
    }

    public String getDayExpiration() {
        return dayExpiration;
    }

    public void setDayExpiration(String dayExpiration) {
        this.dayExpiration = dayExpiration;
    }
}
