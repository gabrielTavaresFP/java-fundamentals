package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // ! = NÃO
        int age = 18;
        boolean permition = age >= 18;

        if(permition) {
            System.out.println("can drink");
        }else{
            System.out.println("cannot drink");
        }
        if(!permition) {
            System.out.println("cannot drink");
        }
    }
}
