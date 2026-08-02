package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("MacOS", 9000);
        Tomato tomato = new Tomato("Sicilian Tomato", 10);
        TaxCalculator.computerTaxCalculate(computer);
        TaxCalculator.tomatoTaxCalculate(tomato);
    }
}
