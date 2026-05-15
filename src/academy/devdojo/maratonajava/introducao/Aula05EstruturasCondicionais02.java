package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 category infatil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 category adult

        int idade = 16;
        String category;

        if (idade < 15) {
            category = "category : infantil";
        } else if (idade >= 15 && idade < 18) {
            category = "category : juvenil";
        } else {
            category = "category : adulto";
        }
        System.out.println(category);
    }
}