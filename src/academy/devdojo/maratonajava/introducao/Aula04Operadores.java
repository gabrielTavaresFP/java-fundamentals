package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // ARITIMÉTICOS + - * /
        int num1 = 10;
        int num2 = 20;
        double result =  (double) num1 / num2;
        System.out.println(result);

        // % (resto, saber se o quociente é PAR 0 ou IMPAR 1
        int rest = 21 % 7;
        System.out.println(rest);

        //  RELACIONAIS < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenDifferentToTwenty = 10 != 20;
        boolean isTenDifferentToTen = 10 != 10;


        System.out.println("isTenBiggerThanTwenty " + isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty " + isTenSmallerThanTwenty);
        System.out.println("isTenEqualToTwenty " + isTenEqualToTwenty);
        System.out.println("isTenDifferentToTwenty " + isTenDifferentToTwenty);
        System.out.println("isTenDifferentToTen " + isTenDifferentToTen);

        // LÓGICOS && (AND)    // (OR)    ! (NOT)

        int age = 29;
        float salary = 3500F;
        boolean isOnTheLawByAge = age >= 30 && salary > 4612;
        boolean isNotOnTheLawByAge = age < 30 && salary >= 3381;

        System.out.println("isOnTheLawByAge "+isOnTheLawByAge);
        System.out.println("isNotOnTheLawByAge "+isNotOnTheLawByAge);

        double totalPriceCurrentAccount = 200;
        double totalPriceSavingsAccount = 10000;
        float play5Price = 5000F;

        boolean isPlay5Purchasable = totalPriceCurrentAccount > play5Price || totalPriceSavingsAccount > play5Price;
        System.out.println("isPlay5Purchasable  " +isPlay5Purchasable);

        // ATRIBUIÇÃO =  +=  -=  *=  /=  %=

        int bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 500; // 2300
        bonus *= 2; // 4600
        bonus /= 2; // 2300
        bonus %= 2; // 0

        System.out.println(bonus);


        int count = 0;
        count += 1;
        count++; // +1
        count--; // -1
        ++count; // +1
        --count; // -1
        int count2 = 0;
        System.out.println(count2++); // PRINT 0 AND ADD 1
        System.out.println(count2); // PRINT THE 1 ADDED
        System.out.println(++count2); // ADD 1 AND PRINT AFTER




    }
}
