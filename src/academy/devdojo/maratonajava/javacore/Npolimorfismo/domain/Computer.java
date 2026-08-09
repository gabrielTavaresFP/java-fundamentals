package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product {
    public final static double TAX_PERCENT = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculeTaxe() {
        System.out.println("Calculating taxes");
        return this.price * TAX_PERCENT;
    }


}
