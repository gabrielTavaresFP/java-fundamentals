package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Star
    public static void main(String[] args) {
        double totalPrice = 100000;
        for (int installment = (int) totalPrice; installment >= 1; installment --) {
            double installmentPrice = totalPrice / installment;
            if (installmentPrice < 1000) { // enquanto a condicao for falsa, ele ira voltar para o inicio do loop, apos ser verdadeira,
                continue;                  // ele passa para o proximo passo
            }
            System.out.println("installment " + installment + " R$ " + (int) installmentPrice);
        }
    }
}
