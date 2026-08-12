package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        // Print every pair number from 0 to 1000000

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(" a "+ ++i);
            }
        }

        for (int a = 0; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
