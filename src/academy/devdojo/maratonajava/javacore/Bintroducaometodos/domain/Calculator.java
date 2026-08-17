// MÉTODOS
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    public void twoNumbersSum() {
        System.out.println(10 + 10);
    }


    public void twoNumbersSubtraction() {
        System.out.println(10 - 20);
    }

    public void twoNumbersMultiplication(int num, int num2) {
        System.out.println(num * num2);
    }

    public double twoNumbersDivision(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double twoNumbersDivision2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void printTwoNumbersDivision(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Dont exist division per 0 ");
            return;
        }
        System.out.println(num1 / num2);


    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside calculator");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void arrayVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
// R
