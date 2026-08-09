package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("MacOS", 9000);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.calculeTaxe());

        System.out.println("-------");

        Product product2 = new Tomato("Green tomato", 9);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculeTaxe());


    }
}
