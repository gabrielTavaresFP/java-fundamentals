package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Given the values 1 to 7, print if its a week or weekend day
        // Considering 1 as Sunday

        byte day = 4;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Week day");
                break;
            default:
                System.out.println("404");
                break;
        }
    }
}

/*     JAVA 14  case 1, 7:
                System.out.println("Weekend");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Week day");
                break;
            default:
                System.out.println("404");
                break;
/*
 */

