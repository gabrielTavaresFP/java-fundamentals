package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        int salary = 100000;
        int percent = 100;
        double taxes1 = 9.7 / percent;
        double taxes2 = 37.35 / percent;
        double taxes3 = 49.50 / percent;
        double result;

        if (salary < 34712) {
            result = salary * taxes1;
        }else if (salary >= 34713 && salary <= 68507) {
            result = salary * taxes2;
        }else{
            result = salary * taxes3;
        }
        System.out.println(result);
    }
}
