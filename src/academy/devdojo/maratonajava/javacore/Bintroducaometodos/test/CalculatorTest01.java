// METODOS
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator; // variavel de referencia

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // <-- objeto
        calculator.twoNumbersSum();
        System.out.println("finishing CalculatorTest01");
        calculator.twoNumbersSubtrair();
        System.out.println("finishing CalculatorTest01");
    }
}
