// MÉTODOS
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    public void twoNumbersSum() {
        System.out.println(10 + 10);
    }


    public void twoNumbersSubtraction() {
        System.out.println(10 - 10);
    }

    public void twoNumbersMultiplication(int num, int num2) {
    }

    public double twoNumbersDivision(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1/num2;
    }
}
