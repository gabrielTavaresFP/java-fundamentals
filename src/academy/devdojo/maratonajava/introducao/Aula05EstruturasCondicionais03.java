package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Donate if salary > 5000
        double salary = 6000;
        String messageDonate = "u should donate";
        String messageDoNotDonate = "EU DESCI COM A LILAAA";
        String result2 = "";

        // (condition) ? if : else
        // salary > 5000 ? messageDonate : messageDoNotDonate
        // String result = salary > 5000 ? messageDonate : messageDoNotDonate;

        // System.out.println(result);

        if (salary < 5000) {
            result2 = messageDonate;
        } else {
            result2 = messageDoNotDonate;
        }
        System.out.println(result2);

        String thirdOperator = salary > 5000? "Ill give 500 bucks to dev" : "i dont have 500 bucks but ill have it ";
        System.out.println(thirdOperator);
    }
}