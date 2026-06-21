package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        int salary = 100000;
        double taxes1 = 9.7 / 100;
        double taxes2 = 37.35 / 100;
        double taxes3 = 49.50 / 100;
        double result;

        if (salary < 34712) {
            result = salary * taxes1;
        }else if (salary >= 34713 && salary <= 68507) {
            result = salary * taxes2;
        }else{
            result = salary * taxes3;
        }
        System.out.println("u have to pay " + (int) result + " dollars to the government");
    }
}
