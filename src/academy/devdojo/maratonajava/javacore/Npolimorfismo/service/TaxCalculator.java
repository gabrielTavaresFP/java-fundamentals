package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {
    public static void taxCalculate(Product product) {
        System.out.println("Product tax relatory");
        double tax = product.calculeTaxe();
        System.out.println("Product: " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Tax  " + tax);
        if (product instanceof Tomato) {
            // Tomato tomato = (Tomato) product;
            // System.out.println("Expiration day: " +((Tomato) product).getDayExpiration());

            String expirationDay = ((Tomato) product).getDayExpiration();
            System.out.println(expirationDay);


        }


    }
}
