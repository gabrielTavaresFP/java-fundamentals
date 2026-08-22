package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numberss = {1, 2, 3, 4, 5};
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] aaaa = {1, 2, 3, 4, 5, 6, 7};
     //   calculator.sumArray(numberss);
        calculator.arrayVarArgs(1,2,3);
        calculator.arrayVarArgsNOTSUM(numberss,numeros, aaaa);


    }
}
// R