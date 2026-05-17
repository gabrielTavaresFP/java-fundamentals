package academy.devdojo.maratonajava.introducao;

import java.awt.event.WindowStateListener;

public class Aula06EstruturasDeRepeticao04Exercicio {
    // Given the price of a car, find how many installments can it be paid in
    // Condition installmentsPrice >= 1000
    // Installment X + Price / Installment X

    public static void main(String[] args) {
        double carPrice = 30000;
        for (int installment = 1; installment <= carPrice; installment++) {
            double priceInstallment = carPrice / installment;
            if (priceInstallment >= 1000) {
                System.out.println("Installment : " + installment + " Price : " + priceInstallment);
            }else break;
        }
    }

}
