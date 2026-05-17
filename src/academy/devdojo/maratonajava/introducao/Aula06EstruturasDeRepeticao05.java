package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Star
    public static void main(String[] args) {
        double totalPrice = 10000;
        for (int installment = (int) totalPrice; installment >= 1; installment --) {
            double installmentPrice = totalPrice / installment;
            if (installmentPrice < 1000) {
                continue;
            }
            System.out.println("installment " + installment + " R$ " + installmentPrice);
        }
    }
}
