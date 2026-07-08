package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The greatest predictor software");
        System.out.println("Enter your question and i'll answer it with YES or NO");
        if (input.nextLine().charAt(0) == ' '){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
