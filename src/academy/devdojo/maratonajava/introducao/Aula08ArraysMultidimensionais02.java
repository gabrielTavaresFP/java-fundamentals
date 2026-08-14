package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] intArrayy = new int[3][];

        int[] array = {1, 2, 3};

        intArrayy[0] = new int[]{1, 2, 3, 4};
        intArrayy[1] = array;

        intArrayy[2] = new int[]{1, 2, 3, 4, 5};

        int[][] intArray2 = {{1},{1,2,3},{1,2,3,4,5}};

        for (int[] arrayBase : intArrayy) {
            System.out.println("\n");
            for (int num : arrayBase) {
                System.out.print(num);

            }
        }
    }
}
