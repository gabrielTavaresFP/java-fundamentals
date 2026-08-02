package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {
    public static void computerTaxCalculate(Computer computer) {
        System.out.println("Computer tax relatory");
        double tax = computer.calculeTaxe();
        System.out.println("Computer name " + computer.getName());
        System.out.println("Price " + computer.getPrice());
        System.out.println("Tax " + tax);
    }


    public static void tomatoTaxCalculate(Tomato tomato) {
        System.out.println("Tomato tax relatory");
        double tax = tomato.calculeTaxe();
        System.out.println("Tomato name " + tomato.getName());
        System.out.println("Price " + tomato.getPrice());
        System.out.println("Tax " + tax);
    }
}
