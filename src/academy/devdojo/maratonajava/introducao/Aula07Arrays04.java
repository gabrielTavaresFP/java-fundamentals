package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] names = {1, 2, 3, 4, 5,6,6,6,6,6,6,6,6,6,6,6,6,6,};

        //  for (int i = 0; i < names.length ; ++i) {
        //      System.out.println(names[i]);
        //  }
        for (int num : names) {
            System.out.println(num);

        }
    }
}
