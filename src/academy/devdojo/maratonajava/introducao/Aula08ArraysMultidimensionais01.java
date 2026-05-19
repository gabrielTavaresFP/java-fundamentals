package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5, meses
        // 31,28,31,30 dias
        int[][] days = new int[3][3];
        days[0][0] = 10;
        days[0][1] = 20;
        days[0][2] = 30;
        days[1][0] = 40;
        days[1][1] = 50;
        days[1][2] = 60;
        days[2][0] = 70;
        days[2][1] = 80;
        days[2][2] = 90;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);

            }
        }
        System.out.println("-----------------");
        for (int[] arrayBase : days)
            for (int num : arrayBase) {
                System.out.println(num);
            }
    }
}
