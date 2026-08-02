package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Product implements Taxeable {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculeTaxe() {
        System.out.println("Calculating taxes");
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
