package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.twoNumbersDivision(30,3);
        double result2 = calculator.twoNumbersDivision2(30,3);

        System.out.println(result);
        System.out.println("-----------");
        System.out.println(result2);
        System.out.println("-----------");
        calculator.printTwoNumbersDivision(30,0);

    }
}
