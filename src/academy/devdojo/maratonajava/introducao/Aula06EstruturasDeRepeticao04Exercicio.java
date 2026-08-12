package academy.devdojo.maratonajava.introducao;

import java.awt.event.WindowStateListener;

public class Aula06EstruturasDeRepeticao04Exercicio {
    // Given the price of a car, find how many installments can it be paid in
    // Condition installmentsPrice >= 1000
    // Installment X + Price / Installment X
    // Star

    public static void main(String[] args) {
        double carPrice = 100000;
        for (int installment = 1; installment <= carPrice; installment++) {
            double priceInstallment = carPrice / installment;
            if (installment > 36) {
                break;
            } System.out.println("Installment : " + installment + " Price  : " + (int) priceInstallment + " dollars");
        }
    }

}
