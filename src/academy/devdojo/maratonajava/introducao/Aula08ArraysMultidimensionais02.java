package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] intArray = new int[3][];

        int[] array = {1, 2, 3};

        intArray[0] = new int[1];
        intArray[1] = array;
        intArray[2] = new int[]{1, 2, 3, 4, 5};

        int[][] intArray2 = {{1},{1,2,3},{1,2,3,4,5}};

        for (int[] arrayBase : intArray2) {
            System.out.println("\n");
            for (int num : arrayBase) {
                System.out.print(num);

            }
        }
    }
}
