// METODOS
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator; // variavel de referencia

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // <-- objeto


        calculator.twoNumbersSum();
        System.out.println("finishing CalculatorTest01");
        calculator.twoNumbersSubtraction();
        System.out.println("finishing CalculatorTest01");
        calculator.changeTwoNumbers(10, 15);
        int[] test1 = {1, 2, 3, 4, 5};
        calculator.sumArray(test1);
        System.out.println("finishing CalculatorTest01");

    }
}
